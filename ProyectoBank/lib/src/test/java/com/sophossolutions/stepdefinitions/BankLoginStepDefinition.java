package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.ValidateLogin;
import com.sophossolutions.tasks.LoginBank;
import com.sophossolutions.ui.AccountsPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class BankLoginStepDefinition {
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("I want login in {string}")
	public void iWantLoginIn(String strUrl) {
	    theActorCalled("John").wasAbleTo(Open.url(strUrl));
	}

	@When("I assing {string}")
	public void iAssing(String strUserData) {
	    theActorCalled("John").wasAbleTo(LoginBank.withCredetianl(strUserData));
	}

	@Then("I verify that the login is successful")
	public void iVerifyThatTheLoginIsSuccessful() {
	   theActorInTheSpotlight().should(seeThat(ValidateLogin.textWelcome(AccountsPage.TXT_WELCOME), IsEqual.equalTo(true)));	
	 }
	

}
