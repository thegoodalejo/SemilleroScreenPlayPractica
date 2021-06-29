#Author: andres.lopez@sophossolutions.com
Feature: Iniciar sesion en Guru
  yo como automatizador quiero ingresar a la pagina Guru

  Scenario: Iniciar sesion en Guru
    Given Deseo ir a la pagina de "http://demo.guru99.com/v4/"
    When Ingreso nombre de usuario "mngr335750" y password "ybYhajE"
    Then Valido que el tiitulo sea "Manger Id : mngr335750"
