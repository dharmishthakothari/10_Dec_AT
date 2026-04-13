package com.automation.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Core Initialization mechanism managing Browser allocation strings.
 * Leverages ThreadLocal context to guarantee true 1:1 Parallel Execution 
 * isolating session memory streams and avoiding WebDriver collision exceptions.
 */
public class DriverFactory {
    private static final Logger logger = LogManager.getLogger(DriverFactory.class);
    // ThreadLocal ensures WebDriver instance runs safely in parallel
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initializeDriver(String browser, boolean isHeadless) {
        WebDriver webDriver;
        logger.info("Initializing browser: {}", browser);
        switch (browser.toLowerCase()) {
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                if (isHeadless) firefoxOptions.addArguments("--headless");
                webDriver = new FirefoxDriver(firefoxOptions);
                break;
            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                if (isHeadless) edgeOptions.addArguments("--headless");
                webDriver = new EdgeDriver(edgeOptions);
                break;
            case "chrome":
            default:
                ChromeOptions chromeOptions = new ChromeOptions();
                if (isHeadless) chromeOptions.addArguments("--headless=new");
                webDriver = new ChromeDriver(chromeOptions);
                break;
        }

        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        driver.set(webDriver);
        logger.info("{} browser initialized successfully.", browser);
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
            logger.info("Browser closed and ThreadLocal driver removed.");
        }
    }
}
