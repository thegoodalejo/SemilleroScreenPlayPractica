#Author: juan.ugarriza@sophossolutions.com
#Overview: Open JPetStore URL in browser
@OpenWebsite
Feature: Open JPetStore website
	I as an automator want to open the JPetStore website
	
Scenario: Open JPetStore website
	Given Open website "https://petstore.octoperf.com/actions/Catalog.action"
