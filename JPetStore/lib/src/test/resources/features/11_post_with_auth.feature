#Author: valentina.correa@sophossolutions.com
Feature: Post con autenticacion
  Quiero automatizar una API POST para validar el resultado es exitoso

  Scenario: Post con autenticacion
    Given Que "Grupo 4" quiere crear un post de usuario en la api "https://gorest.co.in/"
    When Envio informacion del post al endpoint "public-api/posts/123/comments"
      | id         | "122"                                                                  |
      | post_id    | "123"                                                                  |
      | name       | "Bharat Banerjee"                                                      |
      | email      | "bharat_banerjee@dare.net"                                             |
      | body       | "Veniam autem molestias. Quo explicabo pariatur. Deleniti quod atque." |
      | created_at | "2021-07-10T03:50:06.644+05:30"                                        |
      | updated_at | "updated_at"                                                           |
    Then Valido que la respuesta tenga status 200
