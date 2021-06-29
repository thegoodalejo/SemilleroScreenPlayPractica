#Author: julian.espitaleta@sophossolutions.com
Feature: Creating a new savings account
  I wish to automate the creation of a new savings account

	Background:
		Given I want to login into the ParaBank login portal
    When I login with username "john" and password "demo"
    Then I should see the user home page
	
  Scenario: Automate creation of savings account
    Given I Have logged into my online banking account
    When I create an account
    Then I should see the newly created account in the account list


