#Author: andres.guarnizo@sophossolutions.com

Feature: Post With Authentification
I want as an automator
Want to Automate a POST api
To validate the result is successful

Scenario: Title of your scenario
Given "Andres" sets an url "https://gorest.co.in/"
When he requests to the endpoint "public-api/users/" and id "35"
Then he should validate that the status code is 200
