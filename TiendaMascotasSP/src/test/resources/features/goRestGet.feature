#Author: grupo_5

Feature: Get With Authentification
I like an automator
Want to Automate a GET api in gorest page
To validate the result is successful

Scenario: Request an GET to gorest with Authentification
Given Sets an url "https://gorest.co.in/"
When I requests to the endpoint "public-api/users/" and id "35"
Then Y should validate that the status code is 200