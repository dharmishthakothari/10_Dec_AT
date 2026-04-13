package com.automation.utils;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestDataUtils {
    private static final Logger logger = LogManager.getLogger(TestDataUtils.class);
    
    // Hardcoded test data cache
    private static final Map<String, Object> hardcodedData = new HashMap<>();

    static {
        // Add hardcoded configurations/credentials here
        hardcodedData.put("sampleUser", "Tester");
        hardcodedData.put("sampleEmail", "tester@automation.mock");
    }

    public static Object getData(String key) {
        return hardcodedData.get(key);
    }

    // Optional structure block for JSON parsing (expandable with Jackson/Gson)
    // public static Map<String, Object> parseJsonData(String jsonFilePath) {
    //    logger.info("Parsing external JSON Data..."); 
    //    return new HashMap<>(); 
    // }
}
