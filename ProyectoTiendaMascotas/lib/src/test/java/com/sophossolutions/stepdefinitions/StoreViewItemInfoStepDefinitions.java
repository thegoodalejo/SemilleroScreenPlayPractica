package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.ui.StoreHome.PET_SELECT;
import static com.sophossolutions.ui.StoreItem.PET_VIEWLINK;
import static com.sophossolutions.ui.StoreItem.PET_ID;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import com.sophossolutions.interactions.ClickButton;
import org.hamcrest.core.IsEqual;

import com.sophossolutions.exceptions.ExceptionMessage;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.tasks.SaveInfo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreViewItemInfoStepDefinitions {
	String strId;
	
	@When("I decide the pet by the description (.+)$")
	public void iDecideThePetByTheDescription(String string) {
		theActorInTheSpotlight().wasAbleTo(SaveInfo.on(PET_SELECT.of(string)),
				ClickButton.elementTarget(PET_VIEWLINK.of(string)));
		strId = theActorInTheSpotlight().recall("TextoElemento");
		System.out.println(strId);
	}

	@Then("I verify that show view item information")
	public void iVerifyThatShowViewItemInformation() {
		theActorInTheSpotlight().should(seeThat(TextOf.in(PET_ID.of(strId)), IsEqual.equalTo(strId))
				.orComplainWith(ExceptionMessage.class, "Ha ocurrido un error"));
	}

}
