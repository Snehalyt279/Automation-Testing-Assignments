Feature:Read Test Multiple Row

Scenario: Test for Rediff Login 

Given User can open Rediff 
When  User enters Username and Password in Rediff Login page
| Username                 		  | Password	  |
| SnehalTawar							  		|	Snehalyt279	|									

Then  User should Rediff Login successfully 

Scenario: Test for Echo Track Login 

Given User can open Echo Track 
When  User enters Username and Password in Echo Track Login page
| Username                 		  | Password	  |
| SnehalTawar							  		|	Snehalyt279	|									
Then  User should Echo Track Login successfully