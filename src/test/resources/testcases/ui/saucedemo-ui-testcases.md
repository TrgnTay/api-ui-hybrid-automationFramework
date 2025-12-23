# SauceDemo UI - Test cases

---

## TC-UI-AUTH-001
### Title
Login with valid credentials

### Related User story
US-UI-AUTH-001

### Preconditions
- User is registered
- User is on login page

### Steps
1. Enter valid username
2. Enter valid password
3; Click login button

### Expected Result
- User is redirected to inventory page
- Inventory page is displayed

### Automation Coverage
- UI automation planned (LoginPage + InventoryPage)

---


## TC-UI-AUTH-002
### Title
Login with invalid credentials

### Related User story
US-UI-AUTH-002

### Preconditions
- Useris on login page

### steps
1. Enter invalid username or password
2. Click Login button

### Expected Result
- Error message is displayed
- User remains on login page

### Automation Coverage
- UI automation planned (Login negative scenario)

---

## TC-UI-CART-001
### Title
Add product to cart

### Related User Story
US-UI-CART-001

### Preconditions
- User is logged in
- Inventory page is displayed

### Steps
1. Click Add to Cart on a Product

### Expected Result
- Cart badge increments
- Product is added to cart

### Automation Coverage
- UI automation planned (InventoryPage)


## TC-UI-Checkout-001
### Title
Complete checkout with valid data

### Related User Story

US-UI-CHECKOUT-001


### Preconditions
- User is logged in
- Product exists in cart

### Steps
1. Go to cart
2. Proceed to checkout
3. Enter valid checkout information
4. Finish checkout

### Expected Result
- Checkout completes successfully
- Confirmation page is displayed

### Automation Coverage
- UI automation planned (Checkout flow)

---

## TC-UI-LOGOUT-001
### Title
Logout successfully

### Related User Story
US-UI-LOGOUT-001

### Preconditions
- User is logged in

### Steps
1. Click Logout

### Expected Result
- User is logged out
- Login page is displayed

### Automation Coverage
- UI automation planned (Logout flow)


































