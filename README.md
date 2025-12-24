# API + UI Hybrid Automation framework (Restassured + TestNG + Java | Cucumber + JUnit + Selenium + Page Object Model | Allure Reporting )


Senior-level QA automation project demonstrating **API-first testing** combined with **UI smoke automation**, built using Java-based tooling and real-world QA engineering practices.

This repository reflects how a **senior QA automation engineer** designs frameworks that are:
- scalable  
- maintainable  
- CI/CD ready  
- aligned with business requirements and test traceability  

---

## Project Goals


- Build a **clean, maintainable API automation framework**
- Apply **real user stories and test cases** before automation
- Demonstrate an **API-first testing strategy**
- Implement **UI smoke automation** aligned with CI pipelines
- Support **multiple execution styles** (TestNG, JUnit, Cucumber)
- Provide **unified test reporting** for API and UI layers

---

## Technology Stack

### Core
- Java 17
- Maven

### API Automation
- RestAssured
- TestNG
- Hamcrest Matchers

### UI Automation
- Selenium WebDriver
- SauceDemo web application
- Page Object Model (POM)
- Cross-browser execution (Chrome / Firefox / Edge)

### BDD & Alternative Runners (Planned)
- JUnit
- Cucumber (Gherkin-based BDD)


---
## Reporting (Allure)
- This project uses Allure for unified reporting across API and UI tests.
### Generate Report
mvn allure:serve
### Report Includes
API test results (TestNG)
UI scenarios & steps (Cucumber)




## Framework Architecture

The framework follows **clear separation of concerns**:

### Main Configuration

src/main/java
└── config
└── ConfigReader.java


### API Automation Layer

src/test/java/api
├── client → API endpoint abstraction
├── config → Request specification setup
├── models → API contract models
├── tests → Positive & negative scenarios
└── utils → Test data, retry logic, helpers


### UI Automation Layer

src/test/java/ui
├── base → BasePage abstraction
├── config → UI configuration
├── driver → WebDriver lifecycle & cross-browser support
├── pages → Page Object Model
└── cucumber
├── hooks → Setup / teardown, screenshots on failure
├── runners → Cucumber JUnit runner
└── steps → Step definitions


---

## API Automation Scope (Completed)

### Application Under Test
**FakeStore API**

### Covered Features
- Retrieve all products
- Retrieve product by ID
- Create product (positive scenarios)
- Negative scenarios (limited by FakeStore API validation)
- HTTP status validation
- Response body validation
- API contract awareness

---

## API User Stories & Test Cases

User stories and test cases are written **before automation**, following real-world QA processes.
**Location:**
src/test/resources/userstories/api
src/test/resources/testcases/api

### Example User Story

**US-API-PRDCT-001 – Retrieve list of products**

As a customer  
I want to retrieve the list of available products  
So that I can browse items before purchasing.

**Acceptance Criteria**
- API returns HTTP 200
- Response contains a non-empty product list

---

## Test Design Strategy

- Positive and negative scenarios clearly separated
- Test cases mapped to automated tests
- Centralized test data using factory pattern
- Retry mechanism implemented for flaky executions
- API contract changes detected early

---
## UI Automation Scope (SauceDemo)
### Application Under Test
**SauceDemo**

### UI User Stories (Completed – Documentation)

- US-UI-LOGIN-001: Successful login with valid credentials
- US-UI-LOGIN-002: Login failure with invalid credentials
- US-UI-CART-001: Add product to cart
- US-UI-CHECKOUT-001: Complete checkout flow

Location of UI user stories and test cases: src/test/resources/testcases/ui

> UI automation implementation focuses on **smoke tests only**, aligned with real CI/CD practices.

---





## Why This Project Matters

This repository demonstrates:
- Senior-level QA automation architecture
- Real test documentation (user stories & test cases)
- API-first strategy
- Hybrid API + UI framework design
- Extensibility for multiple test runners and BDD

---

## Roadmap

- [x] API automation framework
- [x] API user stories & test cases
- [x] SauceDemo UI user stories & test cases
- [x] UI smoke automation (Selenium)
- [x] JUnit support
- [x] Cucumber BDD integration
- [ ] CI pipeline integration


---


## Requirements, Test Cases & Traceability

This project follows a **real-world QA traceability model**, similar to tools such as
Jira + Xray .

The testing approach is structured as:

**User Stories → Test Cases → Automated Tests**

---



### User Stories (Business Requirements)

Product-related business requirements are documented as user stories:

- [Product API – User Stories](src/test/resources/userstories/api/product-api-userstories.md)

Each user story contains:
- Business intent
- Functional acceptance criteria
- API / technical acceptance criteria
- Explicit automation coverage

---

### Test Cases (Validation Layer)

Test cases are written in Markdown format to simulate
real enterprise test management systems:

- [Product API – Test Cases](src/test/resources/testcases/api/product-api-testcases.md)

Each test case includes:
- Preconditions
- Steps
- Expected results
- Mapping to user stories
- Mapping to automated tests

---
### Automation Coverage

Api test Automation is implemented using **Java + RestAssured + TestNG** and follows
an API-first strategy.

Examples:
- `ProductPositiveTest` – positive product flows
- `ProductNegativeTest` – negative and error scenarios   -FakeStore API does not enforce payload validation; negative scenarios are limited.

This ensures **full traceability** from business requirement to automated validation.

### TestNG Retry Mechanism

Some tests in this project use TestNG's RetryAnalyzer at method level
to re-run failed tests a limited number of times.

- Retry is explicitly enabled per test using @Test(retryAnalyzer = ...)
- No global retry listener is used
- This avoids hiding real defects while allowing controlled retries

---

## Execution Strategy
```md
### API Tests (TestNG)


mvn test


Uses:
testng-api.xml

API-first execution strategy

UI Tests (Cucumber + JUnit)

mvn test -Dtest=RunUiCucumberTest
With browser selection:
mvn test -Dtest=RunUiCucumberTest -Dbrowser=chrome
mvn test -Dtest=RunUiCucumberTest -Dbrowser=firefox
mvn test -Dtest=RunUiCucumberTest -Dbrowser=edge

Supported browsers: 
chrom
firefox
edge


---



```md

## Author

**Tai**  
Senior QA Automation Engineer  
Belgium

tuerkentai.x@gmail.com





