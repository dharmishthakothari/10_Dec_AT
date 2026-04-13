package com.automation.reporting;

import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {
    // ThreadLocal ensures ExtentTest log instances do NOT mix up when TestNG runs Threads parallel
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    public static synchronized ExtentTest getTest() {
        return extentTest.get();
    }

    public static synchronized void setTest(ExtentTest test) {
        extentTest.set(test);
    }
    
    public static synchronized void unload() {
        extentTest.remove();
    }
    
    public static void logInfo(String message) {
        if(getTest() != null) {
            getTest().info(message);
        }
    }
}
