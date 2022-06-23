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
@tag
Feature: Login
  User ingin login

  @tag1
  Scenario Outline: Login with valid data
    Given Masuk ke website healt
    And Klik button makeappointment
    And login dengan <username> dan <password>
    When Klik button login
    
    When user daftar dengan akun yang benar
    
    Then Berhasil daftar
    And Masuk kehalaman form

    Examples: 
      | username | password | tanggal |
      | name1		 |     5 		| 12 			|
      | name2 	 |     7 		| 12   		|
      
 @tag2
  Scenario : Login with valid data
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step  