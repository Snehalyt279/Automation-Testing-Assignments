
Feature: Read Google Title
 


  Scenario: Test Google Page Title
    Given Open Google Application3
   
    When Capture Title1
   
    Then I should get valid title as Google
    And check more outcomes

  Scenario Outline: Test search feature of Google
    Given Open Google Application4
    When I search keyword and go for search1
    Then I should get valid search result1

   
