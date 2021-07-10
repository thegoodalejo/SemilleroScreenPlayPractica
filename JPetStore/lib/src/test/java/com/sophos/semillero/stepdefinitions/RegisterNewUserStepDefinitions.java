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
import com.sophos.semillero.model.RegisterModel;
import com.sophos.semillero.questions.TextObtained;
import com.sophos.semillero.tasks.GoToRegisterPage;
import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.tasks.RegisterNewUser;
import com.sophos.semillero.ui.HomePage;

public class RegisterNewUserStepDefinitions {
	@Before("")
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("Navigate to register page")
	public void navigateToRegisterPage() {
		theActorCalled("Grupo 4").wasAbleTo(GoToRegisterPage.usingButtonAtTheBottom());
	}

	@When("Fill the form with {string} as id, {string} as password, {string} as first name, {string} as last name,"
			+ " {string} as email, {string} as phone, {string} as address one, {string} as address two, {string} as city,"
			+ " {string} as state, {string} as zip, {string} as country")
	public void fillTheFormWith(String strUser, String strPassword, String strFirstName, String strLastName,
			String strEmail, String strPhone, String strAddress1, String strAddress2, String strCity,
			String strState, String strZip, String strCountry) {
		RegisterModel rmNewUser = new RegisterModel(strUser, strPassword, strFirstName, strLastName,
				strEmail, strPhone, strAddress1, strAddress2, strCity, strState, strZip, strCountry);
		theActorInTheSpotlight().remember("rmNewUser", rmNewUser);
		
		theActorInTheSpotlight().wasAbleTo(RegisterNewUser.withAllCredentials());
	}
	
	@Then("Validate successful account creation")
	public void validateSuccessfulAccountCreation() {
		String strLogin = "Sign In";
		theActorInTheSpotlight().should(seeThat(TextObtained.from(HomePage.BTN_LOGIN), IsEqual.equalTo(strLogin))
				.orComplainWith(ExceptionMsg.class, "Error when registering user"));
	}
}
