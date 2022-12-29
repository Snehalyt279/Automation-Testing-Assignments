Feature: Read Test Amazon Website
 

Background:
	Given Open Amazon Website
  Scenario: Test Amazon search filter and sort
    Given I select filter1 and sort1 categories
  
    When I click on filter1 sort1
   
    Then I should get filtered1 and sorted1 search