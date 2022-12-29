
Feature: Test User Registration1
 

  Scenario: Test for User Registration1
    Given User is on registration1 page
    When User enters following details1
   	  | Snehal Tawar | snehaltawar279  | 1234567890  | 1234567890 | snehaltawar669@gmail.com  | 1234567890 | XECE |
      | Shubham Tawar| shubhamtawar097 | 0987654321  | 0987654321 | snehaltawar669@gmail.com  | 0987654321 | XECE |
    Then User registration1 should be successful
    