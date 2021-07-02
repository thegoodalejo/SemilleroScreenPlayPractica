#Author: juan.ugarriza@sophossolutions.com

Feature: Post With Authentification
	As an automator I
	Want to automate a POST API
	To validate if the result is successful

Scenario: Title of your scenario
	Given "Juan Carlos" sets an url "https://gorest.co.in/"
	When he requests to the endpoint "public-api/users" and id "2"
	Then he should validate that the status code is 200
