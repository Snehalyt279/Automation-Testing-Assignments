
Feature: Read Test Facebook Application
 

Background:
	Given Open Facebook Application
  Scenario: Test facebook login with valid credentials
    Given I enter valid "8850716909" and valid "snehaltawar669@gmail.com"
  
    When I click on Login button
   
    Then I should get access of application

 
  Scenario Outline: Test facebook login with invalid credentials
    Given I enter valid "1690988507" and valid "snehaltawar279@gmail.com"
    When I click on button
    Then I should not get access of application

    
