package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.automation.utils.WaitUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Abstract BasePage mapping fundamental Page Object Model structure.
 * Wraps common WebDriver actions with explicit waits preventing sync race conditions,
 * and automates reporting instrumentation directly into execution nodes.
 */
public abstract class BasePage {
    protected WebDriver driver;
    protected Logger logger;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.logger = LogManager.getLogger(this.getClass());
        // Initialize Page Factory elements
        PageFactory.initElements(driver, this);
    }

    protected void click(WebElement element) {
        WaitUtils.waitForClickability(driver, element).click();
        logger.debug("Clicked on element");
        com.automation.reporting.ExtentTestManager.logInfo("Performed native click interaction over visible WebElement context.");
    }

    protected void click(By locator) {
        WaitUtils.waitForClickability(driver, locator).click();
        logger.debug("Clicked on element with locator: {}", locator);
        com.automation.reporting.ExtentTestManager.logInfo("Located dynamic component (" + locator.toString() + ") and validated pointer clicking mechanism.");
    }

    protected void type(WebElement element, String text) {
        WebElement el = WaitUtils.waitForVisibility(driver, element);
        el.clear();
        el.sendKeys(text);
        logger.debug("Typed text: '{}'", text);
        com.automation.reporting.ExtentTestManager.logInfo("Validated contextual text array injection >> Extracted: [" + text + "]");
    }

    protected void type(By locator, String text) {
        WebElement el = WaitUtils.waitForVisibility(driver, locator);
        el.clear();
        el.sendKeys(text);
        logger.debug("Typed text: '{}' on locator: {}", text, locator);
        com.automation.reporting.ExtentTestManager.logInfo("Transmitted string configuration: ['" + text + "'] towards parameterized locator - " + locator.toString());
    }

    protected String getText(WebElement element) {
        String text = WaitUtils.waitForVisibility(driver, element).getText();
        logger.debug("Retrieved text: '{}'", text);
        com.automation.reporting.ExtentTestManager.logInfo("Scraped String Mapping Resulting Output => [" + text + "]");
        return text;
    }
}
