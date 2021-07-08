#Author: juan.ugarriza@sophossolutions.com

Feature: Log in on JPetStore
	I as an automator want to log in on JPetStore

Background: Register on JPetStore
    Given Go to website "https://petstore.octoperf.com/actions/Catalog.action"
    When Navigate to register page
    And Fill the form with <User ID> as id, <Password> as password, <First Name> as first name, <Last Name> as last name, <Email> as email, <Phone> as phone, <Address1> as address one, <Address2> as address two, <City> as city, <State> as state, <Zip> as zip, <Country> as country
    Then Validate successful account creation

    Examples: 
      | User ID        | Password       | First Name | Last Name | Email                               | Phone   | Address1  | Address2 | City        | State     | Zip    | Country    |
      | "autosophos45" | "contraGrupo4" | "grupo"    | "cuatro"  | "juan.ugarriza@sophossolutions.com" | 1234567 | "nowhere" | "around" | "cartagena" | "bolivar" | 130001 | "colombia" |

Scenario: Log in on JPetStore
	Given Navigate to log in page
	When Enter username "autosophos4" and password "gruppe4"
	Then Validate successful login
