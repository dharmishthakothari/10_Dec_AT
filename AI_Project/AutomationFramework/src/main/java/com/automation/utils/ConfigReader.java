package com.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfigReader {
    private static final Logger logger = LogManager.getLogger(ConfigReader.class);
    private static Properties properties;

    static {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            properties = new Properties();
            properties.load(fis);
            fis.close();
            logger.info("Config properties loaded successfully.");
        } catch (IOException e) {
            logger.error("Failed to load config properties file.", e);
            throw new RuntimeException("Could not read configuration properties");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
