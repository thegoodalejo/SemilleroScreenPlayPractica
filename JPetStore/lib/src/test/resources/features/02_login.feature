#Author: juan.ugarriza@sophossolutions.com
#Overview: Log into JPetStore
@Login
Feature: Log in on JPetStore
  I as an automator want to log in on JPetStore

  Background: Open JPetStore website
    Given Open website "https://petstore.octoperf.com/actions/Catalog.action"

  Scenario Outline: Log in on JPetStore
    Given Navigate to log in page
    When Enter username <User ID> and password <Password>
    Then Validate successful login

    Examples: 
      | User ID         | Password       |
      | "autosophos101" | "contraGrupo4" |
