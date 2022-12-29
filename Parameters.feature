Feature: Read Test OrangeHRM Website
 

Background:
	Given Open OrangeHRM Website
  Scenario: Test OrangeHRM login with valid data
    Given I enter valid username "admin" and valid password "1234"
  
    When I click on login buttons
   
    Then I should get access of applications
    
  Scenario: Test OrangeHRM login with invalid data
    Given I enter Invalid username "adminxyz" and valid password "1234xyz"
  
    When I click on buttons
   
    Then I should not get access of applications