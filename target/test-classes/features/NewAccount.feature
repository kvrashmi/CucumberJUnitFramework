#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@Smoke
Feature: Techfios bank and cash New Account Functionality 

Scenario: User should be able to login with valid credentials 
	and open a new account	
	Given User is on the techfios login page 
	When User enters the "<username>" in "Username" field
	When User enters the "<password>" in "Password" field
	And User clicks on "<login>"
	Then User should land on Dashboard page 
	And User clicks on "<bankCash>"
	And User clicks on "<newAccount>"
	And User enters "<accountTitle>" in accounts page 
	And User enters "<description>" in accounts page 
	And User enters "<initialBalance>" in accounts page 
	And User enters "<accountNumber>" in accounts page 
	And User enters "<contactPerson>" in accounts page 
	And User enters "<Phone>" in accounts page 
	And User enters "<accountTitle>" in accounts page 
	And User enters "<internetBankingURL>" in accounts page 
	And User clicks on "<newAccount>"
	Then User should be able to validate account created successfully
