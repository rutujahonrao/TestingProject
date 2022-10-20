
Feature: Select a product on home page
  
   Scenario: customer search any product on search box on home page then it should display list of product
    Given Customer is on home page and search mobile phones
    And  new webpage should display 
    And url get changed
    Then search page should display the list of mobile phones
    When customer select perticular mobile phone
    Then new webpage should open along with descriptive info of mobile phone
    
  