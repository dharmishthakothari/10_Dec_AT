# Selenium TestNG Automation Framework

This project is a complete, production-ready UI automation testing framework architected utilizing Java, Selenium WebDriver, TestNG, Maven, Extent Reports, and Log4j2.

## 📂 Project Structure
```text
AutomationFramework/
├── pom.xml                                   # Core Maven Dependencies & Plugin Compiler definitions
├── src/
│   ├── main/
│   │   ├── java/com/automation/
│   │   │   ├── driver/
│   │   │   │   └── DriverFactory.java        # ThreadLocal Singleton pattern managing instances flawlessly
│   │   │   ├── listeners/
│   │   │   │   └── TestListener.java         # Native Hooks managing ExtentReports / Screen captures
│   │   │   ├── pages/
│   │   │   │   ├── BasePage.java             # Core POM wrapper encompassing Explicit Waits & Logging
│   │   │   │   └── PracticePage.java         # Sub-Class mapping logic for testautomationpractice.blogspot.com
│   │   │   ├── reporting/
│   │   │   │   ├── ExtentManager.java        # File IO reporting generator rules
│   │   │   │   └── ExtentTestManager.java    # Thread-safe logging instrumentation hooks
│   │   │   └── utils/
│   │   │       ├── ConfigReader.java         # Load properties dynamically
│   │   │       ├── ScreenshotUtils.java      # Capture test state visually 
│   │   │       ├── TestDataUtils.java        # Central cache definitions
│   │   │       └── WaitUtils.java            # Standardized explicit wait wrappers  
│   │   └── resources/
│   │       ├── config.properties             # Environment thresholds, URL, and runtime options
│   │       └── log4j2.xml                    # Granular mapping definition tracking internal pipelines
│   └── test/
│       ├── java/com/automation/tests/
│       │   ├── BaseTest.java                 # Lifecycle Initialization / Teardown blocks (@BeforeMethod)
│       │   └── PracticeTests.java            # Active Execution Data Providers & Assertions matrices
│       └── resources/
│           └── testng.xml                    # Pipeline Execution Manifest declaring concurrency scopes
```

## 🛠️ Execution Requirements

1. **Java JDK 17+** (Installed and matched to your system path)
2. **Apache Maven** (Available via shell `mvn` command)

## 🚀 Execution Commands

1. **Clean Installation (Download all POM Dependencies and clear caches):**
   ```shell
   mvn clean compile
   ```
2. **Execute Full Parallel Verification Suite:**
   ```shell
   mvn test
   ```
3. **Execute via explicitly forced parameters (e.g., Switch Browsers):**
   ```shell
   mvn test -Dbrowser=firefox
   ```

## 📊 Post-Execution Resources
- **Graphical HTML Pipeline Readout**: Navigate to `reports/AutomationReport.html` 
- **Underlying Operation Log Trackers**: Inside `logs/automation.log`
- **Failure Dumps**: Image buffers generated into `screenshots/`
