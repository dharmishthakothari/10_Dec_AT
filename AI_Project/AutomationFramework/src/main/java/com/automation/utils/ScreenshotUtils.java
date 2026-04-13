package com.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {
    private static final Logger logger = LogManager.getLogger(ScreenshotUtils.class);

    public static String captureScreenshot(WebDriver driver, String testName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destinationPath = System.getProperty("user.dir") + "/screenshots/" + testName + "_" + dateName + ".png";
        File finalDestination = new File(destinationPath);
        try {
            Files.createDirectories(finalDestination.getParentFile().toPath());
            Files.copy(source.toPath(), finalDestination.toPath());
            logger.info("Screenshot captured and saved to: {}", destinationPath);
        } catch (IOException e) {
            logger.error("Exception while taking screenshot", e);
        }
        return destinationPath;
    }
}
