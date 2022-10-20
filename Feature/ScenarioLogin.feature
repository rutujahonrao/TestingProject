Feature: Test Multiple Employee Data 

  Scenario Outline: Enter the data of employee and check it.
    Given User Launch the browser
    And User opened url
    When User enters Username "<Name>",Age "<Age>",Salary "<Salary>",Address "<Address>" 
    And User Click on submit button
    Then Data should be added in database
    
    Examples: 
      | Name   |   Age | Salary | Address |
      | Rutuja |   25  |   60   |  Pune   |
      | Mohini |   22  |   50   | Kolhapur|
      |Supriya |   26  |   65   |  Sangli |
      | Pooja  |   26  |   65   | Kolhapur|