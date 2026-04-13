# 🏦 ParaBank Automation Framework

A **scalable and maintainable Selenium Automation Framework** built using **Java, TestNG, and Gradle**, following the **Page Object Model (POM)** design pattern.

This project automates key **banking workflows** of the ParaBank demo application and demonstrates **real-world automation framework design**.

---

## 🚀 Tech Stack

* **Java**
* **Selenium WebDriver 4**
* **TestNG**
* **Gradle**
* **ExtentReports**
* **Apache POI (Excel - Data Driven Testing)**
* **Lorem Ipsum Generator**
* **Page Object Model (POM)**

---

## ⭐ Key Highlights

* ✅ **End-to-End Automation Framework**
* ✅ **POM-based scalable architecture**
* ✅ **Data-Driven Testing (Excel + TestNG DataProvider)**
* ✅ **Cross-browser execution support**
* ✅ **Professional reporting using ExtentReports**
* ✅ **Automatic screenshot capture on failure**
* ✅ **Config-driven test execution**

---

## 📌 Test Coverage

### ✔ Functional Test Scenarios

* 🔐 **Login functionality**
* 📝 **User Registration**

  * Static data
  * Dynamic data (Lorem Ipsum)
  * Excel-driven data (DDT)
* 🏦 **Open New Account**
* 💰 **Loan Request Processing**
* 👤 **Profile Update (basic flow)**

---

## ⚙️ Framework Features

* 🔹 **Page Object Model (POM) architecture**
* 🔹 **Reusable and modular design**
* 🔹 **Excel-based Data Driven Testing (Apache POI)**
* 🔹 **TestNG XML suite execution**
* 🔹 **Multi-browser support:**

  * Chrome
  * Firefox
  * Edge
  * Safari
  * Headless modes
* 🔹 **ExtentReports integration**
* 🔹 **Screenshot capture on failure**
* 🔹 **Centralized configuration using `config.properties`**

---

## 📂 Project Structure

```
src
└── test
    ├── java
    │   └── com.parabank.parasoft
    │       ├── pages      # Page Object classes
    │       ├── test       # Test classes
    │       ├── report     # Extent Report setup
    │       └── util       # Utility classes
    │
    └── resources
        ├── data
        │   └── ddt.xlsx
        ├── config.properties
        ├── regression-suite.xml
        └── regressionPackage-suite.xml
```

---

## ▶️ How to Run the Project

### 1️⃣ Clone the repository

```bash
git clone https://github.com/SharifulIslamSabuj/ParabankAutomation.git
```

---

### 2️⃣ Import the project

* Open in **IntelliJ IDEA / Eclipse**
* Import as a **Gradle project**

---

### 3️⃣ Configure environment

Update `config.properties`:

```properties
baseUrl=https://parabank.parasoft.com/parabank/
username=sqa
password=sqa
browserName=chrome
```

---

### 4️⃣ Execute tests

#### ✔ Using TestNG Suite:

* Run: `regression-suite.xml`

#### ✔ Using Gradle Wrapper:

Windows:
.\gradlew test

Mac/Linux:
./gradlew test

---

## 📊 Test Reports

After execution, **Extent Report** is generated at:

```
/build/extentReport/Report.html
```

---

## 📸 Screenshots

Failure screenshots are automatically captured and stored at:

```
/build/screenshots/
```

---

## 🧠 Key Learning Outcomes

This project demonstrates:

* ✔ **Real-world Selenium automation framework design**
* ✔ **Scalable POM architecture**
* ✔ **Data-driven testing implementation**
* ✔ **Test execution reporting (ExtentReports)**
* ✔ **Cross-browser automation strategy**

---

## 👨‍💻 Author

**Md. Shariful Islam**
**SQA Automation Engineer**
(Java | Selenium | TestNG)

---

## 📌 Note

This project is created for **learning and portfolio demonstration purposes** using the ParaBank demo application.
