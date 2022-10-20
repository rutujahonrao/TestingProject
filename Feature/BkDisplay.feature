

Feature: Display Home Page
 
  Scenario: Customer should able to login if credentials are correct and see home page.
    Given Demo site url change
    When customer click on any product it should be open
    And url get change
    Then customer should see the another related products
    