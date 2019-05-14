

Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: To add customer
    Given the user name in telecom homepage
    And the user click on add button 
    When the user filling all the fields
    |Yuvaraj|Sakthivel|y1@gmail.com|thooraipakkam|987654|
    And the user click on submit button 
    Then the user id should be generated
    
