package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


import com.sophossolutions.tasks.Login;
import static com.sophossolutions.ui.HomePage.TXT_WELCOME;
import static com.sophossolutions.util.Constants.ACTOR_NAME;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginUserStepDefinitions {
	
	private String strActorName = ACTOR_NAME;
	
	@Before()
	public void setup(){	
		setTheStage(new OnlineCast());
	}

	@Given("Navigate to the page {string}")
	public void navigateToThePage(String urlHome) {
		theActorCalled(strActorName).wasAbleTo(Open.url(urlHome));
	}

	@When("Login with the user {string} and password {string}")
	public void loginWithTheUserAndPassword(String strUserName, String strPassword) {
		theActorInTheSpotlight().wasAbleTo(Login.withCredential(strUserName, strPassword));
	}

	@Then("Observe the login page")
	public void observeTheLoginPage() {
		theActorInTheSpotlight().should(seeThat(the(TXT_WELCOME), isVisible()));
	}
	
}
