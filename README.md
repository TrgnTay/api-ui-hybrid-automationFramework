# API + UI Hybrid Automation framework



Senior-level QA automation project demonstrating **API-first testing** and **UI smoke automation**
using Java-based tooling and real-world QA engineering practices.

This repository reflects how a senior QA designs automation frameworks
that are scalable, maintainable, and aligned with CI/CD pipelines and business requirements.

---
## Project Goals

- Build a **clean, maintainable API automation framework**
- Apply **real user stories and test cases** before automation
- Demonstrate **API-first testing strategy**
- Prepare a scalable foundation for **UI smoke automation**
- Design the framework to support **multiple test styles (TestNG, JUnit, Cucumber)**

---

## Technology Stack

### Core
- Java 17
- Maven

### API Automation
- RestAssured
- TestNG
- Hamcrest Matchers

### UI Automation (In Progress)
- Selenium WebDriver
- SauceDemo web application
- Page Object Model (POM)

### BDD & Alternative Runners (Planned)
- JUnit
- Cucumber (Gherkin-based BDD)


## Framework Architecture

The framework follows **clear separation of concerns**:

- **Tests** describe business behavior
- **Clients** abstract API communication
- **Configuration** centralizes request setup
- **Models** represent API contracts
- **Utilities** support execution (data, retry, parsing)

src/main/java
└── utils
└── ConfigReader.java

src/test/java
└── api
├── client → API endpoint abstraction
├── config → Request specification setup
├── models → API contract models
├── tests → Positive & negative scenarios
└── utils → Test data, retry logic, helpers

---

## API Automation Scope (Completed)

### Application Under Test
**FakeStore API**

### Covered Features
- Retrieve all products
- Retrieve product by ID
- Create product (positive & negative scenarios)
- HTTP status validation
- Response body validation
- API contract awareness

---
## API User Stories & Test Cases

User stories and test cases are written **before automation**, following real-world QA processes.
Location: src/test/resources/testcases/

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

Location of UI user stories and test cases: src/test/resources/testcases/saucedemo-ui-testcases.md

> UI automation implementation focuses on **smoke tests only**, aligned with real CI/CD practices.

---




## Execution Strategy

- API tests executed first (API-first approach)
- UI tests rely on stable backend behavior
- Retry mechanism protects CI pipelines
- Framework designed to run with:
  - TestNG (current)
  - JUnit (planned)
  - Cucumber (BDD layer planned)

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
- [ ] UI smoke automation (Selenium)
- [ ] JUnit support
- [ ] Cucumber BDD integration
- [ ] CI pipeline integration
- [ ] Test reporting

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



## Author

**Tai**  
Senior QA Automation Engineer  
Belgium
Contact: 
tuerkentai.x@gmail.com





