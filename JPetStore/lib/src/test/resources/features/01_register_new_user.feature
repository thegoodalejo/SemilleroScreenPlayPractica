#Author: juan.ugarriza@sophossolutions.com
#Overview: Register new user on JPetStore
@RegisterNewUser
Feature: Register on JPetStore
  I as an automator want to register on JPetStore

	Background: Open JPetStore website
    Given Open website "https://petstore.octoperf.com/actions/Catalog.action"

  Scenario Outline: Register on JPetStore
    Given Navigate to register page
		When Fill the form with <User ID> as id, <Password> as password, <First Name> as first name, <Last Name> as last name, <Email> as email, <Phone> as phone, <Address1> as address one, <Address2> as address two, <City> as city, <State> as state, <Zip> as zip, <Country> as country
    Then Validate successful account creation

    Examples: 
      | User ID        | Password       | First Name | Last Name | Email                               | Phone   | Address1  | Address2 | City        | State     | Zip    | Country    |
      | "autosophos102" | "contraGrupo4" | "grupo"    | "cuatro"  | "juan.ugarriza@sophossolutions.com" | 1234567 | "nowhere" | "around" | "cartagena" | "bolivar" | 130001 | "colombia" |
