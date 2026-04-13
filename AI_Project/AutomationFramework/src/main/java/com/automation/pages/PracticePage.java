package com.automation.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class PracticePage extends BasePage {

    // Locators for Form Elements
    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "phone")
    private WebElement phoneInput;

    @FindBy(id = "textarea")
    private WebElement addressInput;

    @FindBy(id = "male")
    private WebElement genderMaleRadio;

    @FindBy(id = "female")
    private WebElement genderFemaleRadio;

    @FindBy(id = "country")
    private WebElement countryDropdown;

    @FindBy(id = "colors")
    private WebElement colorsDropdown;

    // Locators for Alerts
    @FindBy(xpath = "//button[text()='Alert']")
    private WebElement alertBoxButton;

    @FindBy(xpath = "//button[text()='Confirm Box']")
    private WebElement confirmBoxButton;

    @FindBy(xpath = "//button[text()='Prompt']")
    private WebElement promptBoxButton;

    @FindBy(id = "demo") // Used for grabbing the output text after alert interaction
    private WebElement alertResultText;

    // WebTable locator
    @FindBy(name = "BookTable")
    private WebElement bookTable;

    public PracticePage(WebDriver driver) {
        super(driver);
    }

    // --- Action Methods ---

    public void fillFormSafe(String name, String email, String phone) {
        if(name != null && !name.isEmpty()) type(nameInput, name);
        if(email != null && !email.isEmpty()) type(emailInput, email);
        if(phone != null && !phone.isEmpty()) type(phoneInput, phone);
    }

    public String getFieldValue(String fieldName) {
        switch (fieldName.toLowerCase()) {
            case "name": return nameInput.getAttribute("value");
            case "email": return emailInput.getAttribute("value");
            case "phone": return phoneInput.getAttribute("value");
            default: return "";
        }
    }

    public void selectCountry(String country) {
        Select dropdown = new Select(countryDropdown);
        dropdown.selectByVisibleText(country);
        logger.info("Selected country: {}", country);
    }

    public String getSelectedCountry() {
        Select dropdown = new Select(countryDropdown);
        return dropdown.getFirstSelectedOption().getText();
    }

    // --- Alert Handling ---
    public String triggerAlertAndGetText() {
        click(alertBoxButton);
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        logger.info("Accepted simple alert containing text: {}", text);
        return text;
    }

    public void triggerConfirmBoxAndDismiss() {
        click(confirmBoxButton);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        logger.info("Dismissed confirm box alert");
    }

    public void triggerPromptBoxAndSubmit(String text) {
        click(promptBoxButton);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
        logger.info("Submitted prompt box with text: {}", text);
    }

    public String getAlertStatusText() {
        return getText(alertResultText);
    }

    // --- WebTable Extraction ---
    public int getBookTableRowsCount() {
        return bookTable.findElements(By.tagName("tr")).size();
    }

    public String getBookDataFromTable(int rowIndex, int colIndex) {
        // Table row 'tr' starts indexing at 1 (Row 1 usually covers the headers)
        String xpathVal = "//table[@name='BookTable']//tr[" + rowIndex + "]/td[" + colIndex + "]";
        return driver.findElement(By.xpath(xpathVal)).getText();
    }

    // --- Frame Handling ---
    public void switchToFirstIframe() {
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        logger.info("Switched execution context to iframe bounds");
    }

    public void switchBackToDefault() {
        driver.switchTo().defaultContent();
        logger.info("Switched execution context back to default document content");
    }
}
