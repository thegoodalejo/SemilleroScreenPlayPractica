package com.guacha.stepdefs;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the; 

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.guacha.tasks.Login;
import com.guacha.ui.AccountCreationPage;
import com.guacha.ui.UserPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class LoginStepDefinitions {
	
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("I want to login into the ParaBank login portal")
	public void iWantToLoginIntoTheParaBankLoginPortal() {
		theActorCalled("John").wasAbleTo(Open.url("https://parabank.parasoft.com/parabank/index.htm"));
	}

	@When("I login with username {string} and password {string}")
	public void iLoginWithUsernameAndPassword(String username, String password) {
	    theActorInTheSpotlight().wasAbleTo(Login.withCredentials(username, password));
	    
	}

	@Then("I should see the user home page")
	public void iShouldSeeTheUserHomePage() {
	    theActorInTheSpotlight().should(seeThat(the(UserPage.TABLE_ACCOUNTS), isVisible()));
	}
	
}
