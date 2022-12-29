Feature: Read Test Yelp Website
 

Background:
	Given Open Yelp Website
  Scenario: Test Yelp search filter and sort
    Given I select filter and sort categories
  
    When I click on filter sort
   
    Then I should get filtered and sorted search