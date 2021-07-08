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
import com.sophos.semillero.tasks.GoToRegisterPage;
import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.tasks.OpenAccount;
import com.sophos.semillero.tasks.Register;
import com.sophos.semillero.ui.HomePage;
import com.sophos.semillero.ui.OpenAccountPage;

public class RegisterStepDefinitions {
	@Before("")
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("Go to website {string}")
	public void goToWebsite(String strUrl) {
		theActorCalled("Grupo 4").wasAbleTo(Open.url(strUrl));
	}

	@When("Navigate to register page")
	public void navigateToRegisterPage() {
		theActorInTheSpotlight().wasAbleTo(GoToRegisterPage.usingButtonAtTheBottom());
	}

	@When("Fill the form with {string} as id, {string} as password, {string} as first name, {string} as last name,"
			+ " {string} as email, {int} as phone, {string} as address one, {string} as address two, {string} as city,"
			+ " {string} as state, {int} as zip, {string} as country")
	public void fillTheFormWith(String strUser, String strPassword, String strFirstName, String strLastName,
			String strEmail, int intPhone, String strAddress1, String strAddress2, String strCity,
			String strState, int intZip, String strCountry) {
		theActorInTheSpotlight().wasAbleTo(Register.withAllCredentials(strUser, strPassword, strFirstName, strLastName,
				strEmail, intPhone, strAddress1, strAddress2, strCity, strState, intZip, strCountry));
	}
	
	@Then("Validate successful account creation")
	public void validateSuccessfulAccountCreation() {
		String strLogin = "Sign In";
		theActorInTheSpotlight().should(seeThat(TextObtained.in(HomePage.BTN_LOGIN), IsEqual.equalTo(strLogin))
				.orComplainWith(ExceptionMsg.class, "Error when registering user"));
	}
}
