package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.ui.StoreHome.PET_SELECT;
import static com.sophossolutions.ui.StoreItem.PET_VIEWLINK;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.tasks.ClickTo;
import com.sophossolutions.tasks.SaveInfo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreViewItemInfoStepDefinitions {
	
	@When("I decide the pet by the description {string}")
	public void iDecideThePetByTheDescription(String string) {
		theActorInTheSpotlight().wasAbleTo(SaveInfo.on(PET_SELECT.of(string)),
				ClickTo.ElementTarget(PET_VIEWLINK.of(string)));
	}

	@Then("I verify that show view item information")
	public void iVerifyThatShowViewItemInformation() {
		System.out.println("THEN x2");
	}

}
