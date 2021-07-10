#Author: valentina.correa@sophossolutions.com
Feature: Registro sin exito metodo Post
  Yo quiero aprender a consumir apis para automatizar las peticiones

  Scenario: Registro sin exito Post
    Given Que "Grupo 4" quiere realizar un registro en la api "https://reqres.in/"
    When Envio la informacion del usuario para el endpoint "api/register"
      | email    | "sydney@fife" |
    Then Valido que la respuesta tenga status 400 y contenga error "Missing email or username"
