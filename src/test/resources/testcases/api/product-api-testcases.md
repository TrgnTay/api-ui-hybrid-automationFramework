# Product API – Test Cases (FakeStore)
**Mapped to PRDCT User Stories**

---

## TC-API-PRDCT-001
### Title
Get all products successfully

### Related User Story
US-API-PRDCT-001

### Endpoint
GET /products

### Preconditions
- Product catalog exists
- API is available

### Steps
1. Send GET request to `/products`

### Expected Result
- HTTP status code is **200**
- Response body contains a list of products
- Product list is not empty

### Automation Coverage
- `ProductPositiveTest` — GET all products

---

## TC-API-PRDCT-002
### Title
Get product details by valid ID

### Related User Story
US-API-PRDCT-002

### Endpoint
GET /products/{id}

### Preconditions
- Product with given ID exists

### Steps
1. Send GET request to `/products/{id}` with a valid ID

### Expected Result
- HTTP status code is **200**
- Response contains correct product details
- Returned product ID matches requested ID

### Automation Coverage
- `ProductPositiveTest` — GET product by ID

---

## TC-API-PRDCT-003
### Title
Create product with valid payload

### Related User Story
US-API-PRDCT-003

### Endpoint
POST /products

### Preconditions
- Valid product payload is prepared

### Steps
1. Send POST request with valid product data

### Expected Result
- HTTP status code is **200**
- Product is created successfully
- Response contains correct title and price

### Automation Coverage
- `ProductPositiveTest.shouldCreateProductSuccessfully()`

---

## TC-API-PRDCT-004
### Title
Reject product creation with invalid payload

### Related User Story
US-API-PRDCT-004

### Endpoint
POST /products

### Preconditions
- Invalid product payload is prepared

### Steps
1. Send POST request with invalid payload

### Expected Result
- HTTP status code is **400**
- Product is not created
- Error response is returned

### Automation Coverage
- `ProductNegativeTest.shouldRejectInvalidPayload()`

---

## TC-API-PRDCT-005
### Title
Request non-existing product

### Related User Story
US-API-PRDCT-005

### Endpoint
GET /products/{id}

### Preconditions
- Product ID does not exist

### Steps
1. Send GET request with a non-existing product ID

### Expected Result 
- HTTP status code is **404**
- Error or empty response is returned

### Automation Coverage
- `ProductNegativeTest` — GET non-existing product ID
