# API + UI Hybrid Automation framework



QA automation project demonstrating API-first testing and UI smoke automation testing implementing CI integration.


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
- `ProductNegativeTest` – negative and error scenarios

This ensures **full traceability** from business requirement to automated validation.

