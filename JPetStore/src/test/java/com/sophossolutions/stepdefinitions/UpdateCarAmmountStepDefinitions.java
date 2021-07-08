package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.sophossolutions.models.ItemShopCar;
import com.sophossolutions.questions.PriceCart;
import com.sophossolutions.tasks.UpdateCar;
import com.sophossolutions.ui.CarPage;
import com.sophossolutions.util.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UpdateCarAmmountStepDefinitions {

	private String strActorName = Constants.ACTOR_NAME;
	private String strAuxIndex;
	@Before
	public void setup()
	{
		setTheStage(new OnlineCast());
	}
	
	@Given("I want to select {int} pets")
	public void iWantToSelectPets(Integer intAmmountPets) {
		strAuxIndex = theActorCalled(strActorName).recall(Constants.DIR_INDEX_ANIMAL).toString();
		theActorInTheSpotlight().attemptsTo(
				Enter.theValue(intAmmountPets.toString()).into(CarPage.EDIT_TEXT_QUANTITY.of(strAuxIndex))
				);
		
	}

	@When("Update cart")
	public void updateCart() {
	    theActorInTheSpotlight().wasAbleTo(UpdateCar.quantity());
	    
	}

	@Then("Validate the cost in the cart")
	public void validateTheCostInTheCart() {
		
		ItemShopCar infoAnimal = theActorInTheSpotlight().recall(Constants.MODEL_CART);
	    theActorInTheSpotlight().should(seeThat(PriceCart.with(CarPage.TOTAL_PRICE_SHOP),
	    		IsEqual.equalTo(infoAnimal.getStrTotalCost())));
	    		
	}
	
}
