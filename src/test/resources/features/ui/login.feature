@ui
Feature: Login to SauceDemo

  As a registered user
  I want to log into the application
  So that I can access the product inventory

  @smoke
  Scenario: Successful login with valid credentials
    Given I am on the SauceDemo login page
    When I login with username "standard_user" and password "secret_sauce"
    Then the inventory page should be displayed

  @ui @negative
  Scenario Outline: Login fails with invalid credentials
    Given I am on the SauceDemo login page
    When I login with username "<username>" and password "<password>"
    Then a login error message should be shown

    Examples:
      | username        | password       |
      | invalid_user    | secret_sauce   |
      | standard_user   | wrong_password |
      | locked_out_user | secret_sauce   |
