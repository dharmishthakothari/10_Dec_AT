package com.automation.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.io.File;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports createInstance() {
        if (extent == null) {
            String reportDirPath = System.getProperty("user.dir") + "/reports";
            new File(reportDirPath).mkdirs();
            String reportPath = reportDirPath + "/AutomationReport.html";
            
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(new File(reportPath));
            
            sparkReporter.config().setDocumentTitle("Automation Test Report");
            sparkReporter.config().setReportName("Functional Test Execution Results");
            sparkReporter.config().setTheme(Theme.DARK);

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
            extent.setSystemInfo("Environment", "QA Pipeline");
            extent.setSystemInfo("Tester", "Automation Architect");
            extent.setSystemInfo("Framework", "TestNG + POM + Selenium WebDriver");
        }
        return extent;
    }
}
