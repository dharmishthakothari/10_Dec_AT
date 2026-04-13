package com.automation.listeners;

import com.automation.driver.DriverFactory;
import com.automation.reporting.ExtentManager;
import com.automation.reporting.ExtentTestManager;
import com.automation.utils.ScreenshotUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestListener implements ITestListener {
    private static final Logger logger = LogManager.getLogger(TestListener.class);
    private static ExtentReports extent = ExtentManager.createInstance();

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("Starting Execution Sequence: " + result.getMethod().getMethodName());
        ExtentTest test = extent.createTest(result.getMethod().getMethodName(), result.getMethod().getDescription());
        ExtentTestManager.setTest(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("Test Passed Successfully: " + result.getMethod().getMethodName());
        ExtentTestManager.getTest().log(Status.PASS, "Test validated successfully under active constraints.");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("Test Action Asserted as FAILED - Handling Revisions: " + result.getMethod().getMethodName());
        ExtentTestManager.getTest().log(Status.FAIL, "Test Operation Error / Hard Assert Failure: " + result.getThrowable());

        WebDriver driver = DriverFactory.getDriver();
        if (driver != null) {
            // Generate visual dump using Screenshot abstraction -> Pipe string path to Report Attachments logic.
            String imgOutputLoc = ScreenshotUtils.captureScreenshot(driver, result.getMethod().getMethodName());
            ExtentTestManager.getTest().addScreenCaptureFromPath(imgOutputLoc, "Graphical Output (Failure)");
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.warn("Test Operations Context Configured to SKIP: " + result.getMethod().getMethodName());
        ExtentTestManager.getTest().log(Status.SKIP, "Method marked for Skip operation evaluating conditional mapping " + result.getThrowable());
    }

    @Override
    public void onStart(ITestContext context) {
        logger.info(">> Pipeline Initialization | Extent HTML Builder Launching.");
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.info("<< Execution Finished. Serializing File Objects -> Extent Report Flush Triggered.");
        if (extent != null) {
            extent.flush();
        }
        ExtentTestManager.unload(); // Remove concurrent mapping preventing buffer overflows.
    }
}
