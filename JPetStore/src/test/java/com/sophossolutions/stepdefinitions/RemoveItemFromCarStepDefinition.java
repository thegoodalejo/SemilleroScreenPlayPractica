package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.sophossolutions.tasks.Remove;
import com.sophossolutions.ui.CarPage;
import com.sophossolutions.util.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RemoveItemFromCarStepDefinition {
	
	private String strActorName = Constants.ACTOR_NAME;
	@Before
	public void setup()
	{
		setTheStage(new OnlineCast());
	}
	@Given("Must go to cart")
	public void mustGoToCart() {
		theActorCalled(strActorName).attemptsTo(Click.on(CarPage.BTN_UPDATE_CAR));
	}
	@When("You must select an animal from the cart at random to upgrade")
	public void youMustSelectAnAnimalFromTheCartAtRandomToUpgrade() {
		theActorInTheSpotlight().wasAbleTo(Remove.with(CarPage.BTN_REMOVE,CarPage.N_ANIMALS_TABLE ));
	}
	@Then("Validate the updated price")
	public void validateTheUpdatedPrice() {
		theActorInTheSpotlight().should(seeThat(the(CarPage.TITLE_EMPTY), isVisible()));
	}
	
}
