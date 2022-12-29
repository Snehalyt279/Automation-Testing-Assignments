Feature: Read Rediff Login
  


  Scenario: Test Reset Password
    Given Open Rediff Application2
   
    When Forgot the Password

    Then Get New Password
