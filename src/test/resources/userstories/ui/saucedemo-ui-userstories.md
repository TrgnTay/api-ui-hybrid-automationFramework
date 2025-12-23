# SauceDemo Ui - User stories
**QA-refined &testable**

---
## US-UI-AUTH-001
### Title
Login with valid credentioals

### Business Intent
As a registed user
I want to log in with valid credentials
So that I can access the product catalog.

### acceptance Criteria (Functional)
-User can log in with valid credentials
-User is redirected to the inventory page

### Acceptance criteria (Ui/ technical) -added only for documentation clarity purpose
- Login from accepts username and password
- Successful login redirects to inventory page
- Inventory page is displayed

---

## US-UI-AUTH-002
### Title
Reject login with invalid credentials

### Business Intent
As a user
I want to be prevented from logging in with invalid credentials
So that my account remains secure.

###Acceptance Criteria (Functional)
- Login fails with invalid credentials
- User remains on login page

###Acceptance Criteria (UI/Technical)
- Error message is displayed 
- Inventory page is not displayed


---


## US-UI-CART-001
### Title
Add product to cart


### Business Intent
As a logged-in user
I want to add a product to the cart
So that I can purchase it later.

### Acceptance Criteria (F)
- Product can be added to cart
- Cart icon updates with item count

### AC (UI/Technical)
- Add-to-cart button is clickable
- Cart badge increments


---

## US-UI-CHECKOUT-001
### Title
Complete checkout with valid data


### Buisiness Intent
As a logged-in user
I want to complete checkout with valid information
So that I can place an order.

### AC (F)
- Checkout process completes successfully
- Order confirmation is displayed

### AC (T)
- Checkout form accepts valid data
- Confirmation page is displayed

---


## US-UI-LOGOUT-001
###Title
Logout successfully

### business intent
As a logged-in user
I want to log out of the application
So that my session is terminated.

### AC (F)
- User is logged out
- User is redirected to login page

### AC (T)
- Logout button works
- Login page appears


























































































