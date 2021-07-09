package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.ui.StoreHome.TXT_WELCOME;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.time.Duration;

import com.sophossolutions.tasks.StoreLogin;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

public class StoreLoginStepDefinitions {

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("I want Login in {string}")
	public void iWantLoginIn(String strUrl) {
		theActorCalled("Pepito").wasAbleTo(Open.url(strUrl));
	}

	@When("I assing {string} {string}")
	public void iAssing(String strUserName, String strPassword) {
		theActorInTheSpotlight().wasAbleTo(StoreLogin.withCredentials(strUserName, strPassword));
	}

	@Then("I verify that the login is successful")
	public void iVerifyThatTheLoginIsSuccessful() {
		theActorInTheSpotlight()
				.has(Ensure.that(TXT_WELCOME.waitingForNoMoreThan(Duration.ofSeconds(3))).isDisplayed());
	}

}
