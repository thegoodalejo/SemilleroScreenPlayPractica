#Author: julian.espitaleta@sophossolutions.com

Feature: Login into ParaBank
  I wish to automate the loginprocess into a ParaBank online banking account

  Scenario: Logging into ParaBank
    Given I want to login into the ParaBank login portal
    When I login with username "john" and password "demo"
    Then I should see the user home page