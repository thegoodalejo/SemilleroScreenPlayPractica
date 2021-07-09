#Author: valentina.correa@sophossolutions.com
@AddAnimalToCart
Feature: Add animal to cart at JPetStore
  I as an automator want to add animal to cart at JPetStore
  
  Background:
  	Given Open website "https://petstore.octoperf.com/actions/Catalog.action"
    And Navigate to log in page
    When Enter username <User ID> and password <Password>
    Then Validate successful login

    Examples: 
      | User ID         | Password       |
      | "autosophos101" | "contraGrupo4" |

  Scenario: Add animal to cart at JPetStore
    Given I am at the homepage
    When Agrego un animal al carrito de compras
    Then Valido que en la tabla este el ID Item