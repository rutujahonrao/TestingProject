
Feature: Login to Buykart Application
 @tag1 			 
Scenario: When customer put their credentials on login page then it should be proceed.

    Given Customer opens the chrome browser
    And Open the demo site url
    When Customer write all credentials for login
    And Customer click on submit button
    Then Home page should be display
    
 @tag2   
Scenario Outline: Customer enters their credentials 
    Given Customer opens the chrome browser
    And  Open the demo site url
    When Customer enters Username "<Username>", Password "<Password>"
    Then Customer click on submit button

    Examples: 
      | Username     | Password    | 
      | rutuja       | rutuja@123  |
      | rutujahonrao | rutuja@123  | 
   