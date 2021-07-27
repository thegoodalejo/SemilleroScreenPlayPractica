#Author: juan.blanco@sophossolutions.com
Feature: Basic calculator Example
  I want to probe a basic calculator using Serenity and ScreenPlay

  Background: 
    Given I want to go to page

  Scenario Outline: Testing the operands basics in Maths (ADD)
    Given I want to verify that i am on the home page
    When Add the numbers <number1> <number2>
    Then Verify the value of the sum two numbers in the modes of calculator

    Examples: 
      | number1 | number2 |
      |       0 |       0 |
