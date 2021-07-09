#Author: juan.ugarriza@sophossolutions.com
#Overview: Log into JPetStore
@Login
Feature: Log in on JPetStore
  I as an automator want to log in on JPetStore

  Scenario Outline: Log in on JPetStore
  	Given Open website "https://petstore.octoperf.com/actions/Catalog.action"
    And Navigate to log in page
    When Enter username "autosophos100" and password "contraGrupo4"
    Then Validate successful login