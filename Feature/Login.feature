Feature: Login
  Scenario: Successful login with valid credentials
    Given User launch chrome browser
    When User open the URL "https://admin-demo.nopcommerce.com/login"
    And User enter email as "admin@yourstore.com" and password as "admin"
    And Click on login button
    Then Page Title should be "Dashboard / nopCommerce administration"
    When user click on log out
    Then Page title should be "Your store. Login"
    And close the browser for Login Page
