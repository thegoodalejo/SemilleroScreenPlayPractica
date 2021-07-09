#Author: valentina.correa@sophossolutions.com
Feature: Registrar usuario en JPetStore
  yo como automatizador quiero probar la funcionalidad de registrar en la pagina JPetStore

  Scenario: Registrar usuario en JPetStore
    Given Deseo ir a pagina "https://petstore.octoperf.com/actions/Catalog.action"
    When Ingreso User ID "autosophos44", New password "contraGrupo4", Repeat password "contraGrupo4", First name "Grupo 4", Last name "Correa", Email "tina@gmail.com", Phone "123", Address1 "d1", Address2 "d2", City "Armenia", State "Quindio", Zip "03", Country "Colombia"
