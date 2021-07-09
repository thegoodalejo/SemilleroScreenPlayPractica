package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.ui.StoreHome.TXT_WELCOME;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.time.Duration;
import java.util.Map;

import com.sophossolutions.models.RegisterModel;
import com.sophossolutions.tasks.StoreRegister;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

public class StoreRegisterStepDefinitions {

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("I want to register in {string}")
	public void iWantToRegisterIn(String strUrl) {
		theActorCalled("Pepito").wasAbleTo(Open.url(strUrl));
	}

	@When("I assign the user data")
	public void iAssignTheUserData(DataTable userDataTable) {

		Map<String, String> userData = userDataTable.asMap(String.class, String.class);

		RegisterModel newUser = new RegisterModel(userData.get("username"), userData.get("password"),
				userData.get("firstname"), userData.get("lastname"), userData.get("email"), userData.get("phone"),
				userData.get("address1"), userData.get("address2"), userData.get("city"), userData.get("state"),
				userData.get("zip"), userData.get("country"), userData.get("languagepreference"),
				userData.get("favouritecategory"), Boolean.parseBoolean(userData.get("enablemylist")),
				Boolean.parseBoolean(userData.get("enablemybanner")));

		theActorInTheSpotlight().wasAbleTo(StoreRegister.withData(newUser));

	}

	@Then("I verify that the register is successful")
	public void iVerifyThatTheRegisterIsSuccessful() {
		theActorInTheSpotlight()
				.has(Ensure.that(TXT_WELCOME.waitingForNoMoreThan(Duration.ofSeconds(3))).isNotDisplayed());
	}

}
