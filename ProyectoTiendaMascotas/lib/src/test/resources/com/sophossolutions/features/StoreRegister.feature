#Author: jonathan.castro@sophossolutions.com
Feature: I want to register at the pet store
  As a tester I want to register to buy pets

  Scenario: I want to register at the pet store
    Given I want to register in "https://petstore.octoperf.com/actions/Account.action?newAccountForm="
    When I assign the user data
      | username           | pepito2         |
      | password           |             123 |
      | firstname          | pepito2         |
      | lastname           | lala            |
      | email              | lalal@gmail.com |
      | phone              |          123456 |
      | address1           | qpqpq           |
      | address2           | qpqpq           |
      | city               | Bogota          |
      | state              | Bogota          |
      | zip                |           13131 |
      | country            | Colombia        |
      | languagepreference | japanese        |
      | favouritecategory  | REPTILES        |
      | enablemylist       | True            |
      | enablemybanner     | True            |
    Then I verify that the register is successful
