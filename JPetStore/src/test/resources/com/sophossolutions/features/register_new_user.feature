#Author: santiago.espinal@sophossolutions.com and juan.blanco@sophossolutions.com
Feature: Test a users registration
  I as an automation want to test the registration of a user

  Scenario: User registration
    Given It must be in the url "https://petstore.octoperf.com/actions/Account.action?newAccountForm="
    When You must enter the information "JuanSantiago,1234,BlancoEspinal,BlancoEspinal@gmail.com,3013020432,address1,address2,Rio,canos,40021,conas,CATS"
    Then The information must be in the fields
    
    
   