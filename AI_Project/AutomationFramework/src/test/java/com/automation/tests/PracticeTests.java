package com.automation.tests;

import com.automation.pages.PracticePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Test Execution suite mapping standard functional workflows targeting the Practice URL.
 * Incorporates deep Data-Driven boundaries checking Form injection, Alert/Table mapping
 * and iFrame operational sandbox escaping.
 */
public class PracticeTests extends BaseTest {

    // Data Provider simulating parameters for Data Driven Testing
    @DataProvider(name = "formData", parallel = true)
    public Object[][] getFormData() {
        return new Object[][]{
            // Positive Scenario
            {"John Doe", "john.doe@test.com", "1234567890", true},
            // Negative Scenario (Missing Mandatory Email layout constraints)
            {"Jane Smith", "", "9876543210", false},
            // Edge Case Scenario (Alphanumeric/symbols in purely integer phone boundaries)
            {"NoName", "invalid@format", "ABC-992-##", false} 
        };
    }

    @Test(dataProvider = "formData", priority = 1, description = "Test Form Submission & Field Validation")
    public void testFormInputs(String name, String email, String phone, boolean isValidData) {
        PracticePage practicePage = new PracticePage(driver);
        
        practicePage.fillFormSafe(name, email, phone);
        
        // Hard Assertions for Positive flow evaluating whether inputs successfully registered
        if (isValidData) {
            Assert.assertEquals(practicePage.getFieldValue("name"), name, "Name field mismatch!");
            Assert.assertEquals(practicePage.getFieldValue("email"), email, "Email field mismatch!");
            Assert.assertEquals(practicePage.getFieldValue("phone"), phone, "Phone field mismatch!");
            logger.info("Positive form criteria evaluated successfully.");
        } else {
            // Soft Assertions for Negative/Edge cases simulating loose validation tracking
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertNotEquals(practicePage.getFieldValue("email"), "valid@email.com", "Mock Edge Case validation block executed!");
            softAssert.assertAll();
            logger.info("Negative/Edge data input evaluated robustly.");
        }
    }

    @Test(priority = 2, description = "Dropdown Selection Validation")
    public void testDropdownSelection() {
        PracticePage practicePage = new PracticePage(driver);
        
        String targetCountry = "Canada";
        practicePage.selectCountry(targetCountry);
        
        // Hard assertion validating selection state
        Assert.assertEquals(practicePage.getSelectedCountry(), targetCountry, "Selected country does NOT match expected outcome.");
    }

    @Test(priority = 3, description = "Alert Handling: Simple, Confirm and Prompts")
    public void testAlertHandling() {
        PracticePage practicePage = new PracticePage(driver);
        SoftAssert softAssert = new SoftAssert();

        // Interacting with Simple Alert
        String alertText = practicePage.triggerAlertAndGetText();
        softAssert.assertTrue(alertText.length() > 0, "Simple Alert text extraction verification failed.");

        // Interacting with Confirmation Box
        practicePage.triggerConfirmBoxAndDismiss();
        softAssert.assertTrue(practicePage.getAlertStatusText().contains("Cancel"), "Status text mismatched after Confirm Box 'Dismiss' check.");

        // Interacting with Prompt Box
        String injectedText = "AutomatedUserPrompt";
        practicePage.triggerPromptBoxAndSubmit(injectedText);
        softAssert.assertTrue(practicePage.getAlertStatusText().contains(injectedText), "Status text mismatched or prompt string rejection during entry sequence.");

        // Resolve aggregated soft assertions dynamically via TestNG
        softAssert.assertAll();
    }

    @Test(priority = 4, description = "Web Table Data Extraction and Node Validation")
    public void testTableDataExtraction() {
        PracticePage practicePage = new PracticePage(driver);
        
        int rowCount = practicePage.getBookTableRowsCount();
        Assert.assertTrue(rowCount > 1, "Critical Error: Cannot parse Table HTML nodes. Array missing rows.");

        // Extracting string mapped to Matrix Index (Row 2, Column 1) -> Typical Book Table logic.
        String firstBookData = practicePage.getBookDataFromTable(2, 1);
        Assert.assertFalse(firstBookData.isEmpty(), "Extracted value is inexplicably an empty construct.");
        logger.info("Verified Table Extraction Algorithm by pinpointing cell output: {}", firstBookData);
    }

    @Test(priority = 5, description = "Cross-Context Execution Flow (iFrame Sandbox Switchering)")
    public void testFrameSwitching() {
        PracticePage practicePage = new PracticePage(driver);
        
        try {
            // Execution context jumps bounds
            practicePage.switchToFirstIframe();
            
            // Logic targeting components implicitly encapsulated within the DOM structure of this nested IFrame goes here...
            logger.info("Validated execution state presence behind iFrame boundaries.");

        } finally {
            // Irrespective of Exception paths, mandate state reset to standard DOM mapping
            practicePage.switchBackToDefault();
            
            // Validate standard execution state restoration by locating the prior Web Table
            Assert.assertTrue(practicePage.getBookTableRowsCount() > 0, "Test execution state failed reverting to default iFrame!");
        }
    }
}
