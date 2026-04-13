package com.automation.tests;

import com.automation.driver.DriverFactory;
import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected Logger logger = LogManager.getLogger(this.getClass());

    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    public void setup(@Optional("") String browserParam) {
        logger.info("----------------- Test Started -----------------");

        // Resolve browser parameter from testng.xml, fallback to config.properties
        String browser = (browserParam != null && !browserParam.isEmpty()) 
                            ? browserParam 
                            : ConfigReader.getProperty("browser");
        boolean headless = Boolean.parseBoolean(ConfigReader.getProperty("headless"));
        
        // Initialize Driver
        DriverFactory.initializeDriver(browser, headless);
        driver = DriverFactory.getDriver();
        
        // Setup timeouts
        long implicitWait = Long.parseLong(ConfigReader.getProperty("implicit.wait"));
        long pageLoadTimeout = Long.parseLong(ConfigReader.getProperty("page.load.timeout"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTimeout));
        
        // Navigate to Application
        String url = ConfigReader.getProperty("url");
        logger.info("Navigating to target URL: {}", url);
        driver.get(url);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        DriverFactory.quitDriver();
        logger.info("----------------- Test Ended -----------------");
    }
}
