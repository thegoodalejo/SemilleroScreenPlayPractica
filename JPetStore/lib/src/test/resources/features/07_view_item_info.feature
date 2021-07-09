#Author: valentina.correa@sophossolutions.com
@ViewItemInfo
Feature: View item info at JPetStore
  I as an automator want to view item info at JPetStore
  
  Background:
    Given Open website "https://petstore.octoperf.com/actions/Catalog.action"
  
  Scenario: View item info at JPetStore
    Given A random animal is chosen
    When Item detail page is opened
    Then Valido que el ID_ITEM sea el mismo en el detalle
    