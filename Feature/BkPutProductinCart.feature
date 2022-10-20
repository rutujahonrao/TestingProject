

Feature: Put selected product into cart
  
  Scenario: Selected product put into a cart and view cart
    Given Customer add mobile phone into cart 
    And open the cart
    When customer open the cart 
    Then url should change
    And customer should see their product into cart

  