#Author: maria.cala@sophossolutions.com
Feature: Buscar vuelo
  Yo como automatizador quiero buscar vuelos en Despegar

  Scenario Outline: Buscar vuelos en Despegar
    Given Deseo ir a la pagina de "https://www.despegar.com.co/"
    When Ingreso origen <origen> destino <destino> fecha de ida <fecha_ida> fecha de vuelta <fecha_vuelta> numero de adultos <numAdultos> numero de ninos <numNinos> y clase <clase>
    Then Buscar resultados

    Examples: 
      | origen     | destino     | fecha_ida | fecha_vuelta | numAdultos | numNinos | clase              |
      | San Andres | Monteria    |        13 |           27 |          1 | 1,4 años | Premium economy    |
      | Monteria   | Bogota      |        23 |           30 |          2 | 1,1 años | Primera Clase      |
      | Bogota     | Medellin    |         1 |           25 |          3 | 1,2 años | Ejecutiva/Business |
      | Cali       | Bucaramanga |         2 |            3 |          4 | 1,3 años | Economica          |
