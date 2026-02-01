# 🚀 TestNG Web Automation Framework

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-4.39.0-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-7.10.2-FF7F00?style=for-the-badge&logo=testng&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

## 📖 About The Project
This repository contains a professional **Web Automation Framework** built with **TestNG** and **Selenium WebDriver**. It implements the **Page Object Model (POM)** design pattern to ensure clean, maintainable, and scalable test automation.

The framework is specifically designed for testing HRM (Human Resource Management) systems, featuring a robust utility layer, data-driven capabilities via Excel, and high-quality reporting.

## 🛠 Tech Stack & Tools
* **Programming Language:** Java
* **Web Automation:** Selenium WebDriver (v4.39.0)
* **Testing Framework:** TestNG (v7.10.2)
* **Reporting:** ExtentReports (v5.1.2)
* **Data-Driven Testing:** Apache POI (v5.5.1)
* **Build Tool:** Maven
* **Logging:** SLF4J (v1.7.36)

## 📂 Repository Structure
The project follows a standard Maven directory structure with a focus on logical separation:

```text
TestNG-Framework/
├── src/test/java/com/neotech/
│   ├── pages/          # Page Factory / WebElement locators (POM)
│   ├── testbase/       # BaseClass, Listeners, and Setup/Teardown logic
│   ├── testcases/      # Functional test scripts (Login tests, etc.)
│   └── utils/          # CommonMethods, ExcelUtility, Constants, and ConfigsReader
├── configs/            # configuration.properties for environment settings
├── testdata/           # Excel files for Data-Driven Testing
├── target/             # Compiled classes and HTML Reports (HRM.html)
├── smoke.xml           # TestNG suite for critical smoke tests
├── regression.xml      # TestNG suite for full regression testing
└── pom.xml             # Project dependencies and configurations
