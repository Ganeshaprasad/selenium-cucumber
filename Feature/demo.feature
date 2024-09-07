Feature: Login to application
  Scenario: Logo present in Home page
    Given I launch chrome browser
    When I open home page
    Then I verify logo present on page
    And close the browser