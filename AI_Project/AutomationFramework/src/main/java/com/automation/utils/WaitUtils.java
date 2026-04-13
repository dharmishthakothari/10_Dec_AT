package com.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitUtils {
    
    public static WebDriverWait getExplicitWait(WebDriver driver) {
        int explicitWaitTimeout = Integer.parseInt(ConfigReader.getProperty("explicit.wait"));
        return new WebDriverWait(driver, Duration.ofSeconds(explicitWaitTimeout));
    }

    public static WebElement waitForVisibility(WebDriver driver, By locator) {
        return getExplicitWait(driver).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForVisibility(WebDriver driver, WebElement element) {
        return getExplicitWait(driver).until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForClickability(WebDriver driver, By locator) {
        return getExplicitWait(driver).until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static WebElement waitForClickability(WebDriver driver, WebElement element) {
        return getExplicitWait(driver).until(ExpectedConditions.elementToBeClickable(element));
    }
}
