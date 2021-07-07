package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static com.sophossolutions.ui.StoreCar.PET_SELECTED;
import static com.sophossolutions.ui.StoreHome.PET_TYPE;
import static com.sophossolutions.ui.StoreHome.PET_BREED;
import static com.sophossolutions.ui.StoreHome.BTN_ADD;
import static com.sophossolutions.ui.StoreHome.PET_SELECT;

import com.sophossolutions.exceptions.ExceptionMessage;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.tasks.ClickTo;
import com.sophossolutions.tasks.SaveInfo;
import com.sophossolutions.ui.StoreHome;
import org.hamcrest.core.IsEqual;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StoreAddPetStepDefinitions {
	String strId;

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("I want search pet type {string}")
	public void iWantSearchPetType(String strPetType) {
		theActorInTheSpotlight().wasAbleTo(ClickTo.ElementTarget(PET_TYPE.of(strPetType)));
	}

	@Given("Select pet breed {string}")
	public void selectPetBreed(String strPetBreed) {
		theActorInTheSpotlight().wasAbleTo(ClickTo.ElementTarget(PET_BREED.of(strPetBreed)));
	}

	@When("decide the pet by the description {string}")
	public void decideThePetByTheDescription(String strPetSelect) {
		theActorInTheSpotlight().wasAbleTo(SaveInfo.on(PET_SELECT.of(strPetSelect)),
				ClickTo.ElementTarget(BTN_ADD.of(strPetSelect)));
		strId = theActorInTheSpotlight().recall("TextoElemento");
	}

	@Then("I verified that the pet is in the shopping cart")
	public void iVerifiedThatThePetIsInTheShoppingCart() {
		theActorInTheSpotlight().should(seeThat(TextOf.in(PET_SELECTED.of(strId)), IsEqual.equalTo(strId))
				.orComplainWith(ExceptionMessage.class, "Ha ocurrido un error"));
	}

}
