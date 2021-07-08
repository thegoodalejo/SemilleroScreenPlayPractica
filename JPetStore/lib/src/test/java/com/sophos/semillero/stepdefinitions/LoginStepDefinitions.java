package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.exceptions.ExceptionMsg;
import com.sophos.semillero.questions.TextObtained;
import com.sophos.semillero.tasks.GoToHomePage;
import com.sophos.semillero.tasks.GoToLoginPage;
import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.tasks.OpenAccount;
import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.OpenAccountPage;

public class LoginStepDefinitions {
	@Given("Navigate to log in page")
	public void navigateToLoginPage(String strUrl) {
		theActorInTheSpotlight().wasAbleTo(GoToLoginPage.usingButtonAtTheTop());
	}

	@When("Enter username {string} and password {string}")
	public void enterUsernameAndPassword(String strUser, String strPassword) {
		theActorInTheSpotlight().wasAbleTo(Login.withCredential(strUser, strPassword));
	}

	@Then("Validate successful login")
	public void validateSuccessfulLogin() {
		String strTitleWhenLoggedIn = "Sign Out";
		theActorInTheSpotlight().should(seeThat(TextObtained.in(HomePage.BTN_SIGN_OUT), IsEqual.equalTo(strTitleWhenLoggedIn))
				.orComplainWith(ExceptionMsg.class, "Error when logging in"));
	}

	@Before("")
	public void setup() {
		setTheStage(new OnlineCast());
	}
}
