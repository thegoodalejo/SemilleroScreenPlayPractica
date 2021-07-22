package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.Info;
import com.sophossolutions.tasks.PostCreateUser;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;




public class PostRequestWithoutAuthenticationStepDefinitions2 {
	
	@Before
	public void setup(){
		setTheStage(new OnlineCast());
	}
	
	@When("he requests to the endpoint {string} and")
	public void heRequestsToTheEndpointAnd(String strEndPoint, DataTable dataTableUser) {
	    theActorInTheSpotlight().wasAbleTo(PostCreateUser.with(strEndPoint, dataTableUser));
	}


	@Then("he should validate that the name {string} is correct")
	public void heShouldValidateThatTheNameIsCorrect(String strNameUser) {
		theActorInTheSpotlight().should(seeThat(Info.json("name"),IsEqual.equalTo(strNameUser)));
	}
	
}
