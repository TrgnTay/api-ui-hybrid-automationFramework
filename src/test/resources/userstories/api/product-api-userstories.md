# Product API – User Stories (FakeStore)
**QA-refined & testable**

---

## US-API-PRDCT-001
### Title
Retrieve list of products

### Business Intent
As a customer  
I want to retrieve the list of available products  
So that I can browse items before purchasing.

### Acceptance Criteria (Functional)
- The system returns a list of available products

### Acceptance Criteria (API / Technical)
- API returns **HTTP 200**
- Response body contains a list of products
- Product list is not empty

### Automated Coverage
- `ProductPositiveTest` — GET all products

---

## US-API-PRDCT-002
### Title
Retrieve product details by ID

### Business Intent
As a customer  
I want to retrieve product details by product ID  
So that I can view detailed information about a product.

### Acceptance Criteria (Functional)
- The system returns product details for an existing product

### Acceptance Criteria (API / Technical)
- API returns **HTTP 200** for a valid product ID
- Response contains correct product data
- Returned product ID matches the requested ID

### Automated Coverage
- `ProductPositiveTest` — GET product by ID

---

## US-API-PRDCT-003
### Title
Create a new product with valid data

### Business Intent
As an admin user  
I want to create a new product  
So that it becomes available in the product catalog.

### Acceptance Criteria (Functional)
- A new product can be created with valid data
- The created product becomes available in the catalog

### Acceptance Criteria (API / Technical)
- API returns **HTTP 200**
- Product is created successfully
- Response contains correct title and price

### Automated Coverage
- `ProductPositiveTest.shouldCreateProductSuccessfully()`

---

## US-API-PRDCT-004
### Title
Reject product creation with invalid data

### Business Intent
As an admin user  
I want invalid product data to be rejected  
So that only valid products exist in the catalog.

### Acceptance Criteria (Functional)
- The system does not allow creation of products with invalid data

### Acceptance Criteria (API / Technical)
- API returns **HTTP 400**
- Product is not created
- Error response is returned

### Automated Coverage
- `ProductNegativeTest.shouldRejectInvalidPayload()`

---

## US-API-PRDCT-005
### Title
Handle non-existing product request

### Business Intent
As a customer  
I want to be informed when a product does not exist  
So that I understand the product is unavailable.

### Acceptance Criteria (Functional)
- The system informs the user that the product does not exist

### Acceptance Criteria (API / Technical)
- API returns **HTTP 404** for a non-existing product ID
- Error or empty response is returned

### Automated Coverage
- `ProductNegativeTest` — GET non-existing product ID

---
