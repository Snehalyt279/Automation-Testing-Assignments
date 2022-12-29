
Feature: Test User Registration
 

  Scenario: Test for User Registration
    Given User is on registration page
    When User enters following details
   	  | Snehal  | Tawar | New Panvel  | snehaltawar669@gmail.com  | 8850716909 | 1690988507  | 1690988507 |
      | Shubham | Tawar | Navi Mumbai |shubhamtawar097@gmail.com  | 1234567890 | 6789012345  | 6789012345 |
    Then User registration should be successful
    

 
      
