package com.sophos.semillero.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight; //ya conoce el actor
import org.hamcrest.core.IsEqual;
import com.sophos.semillero.questions.RemovedItemCartVerification;
import com.sophos.semillero.tasks.RemoveFromCart;
import com.sophos.semillero.ui.CartPage;
import com.sophos.semillero.exceptions.Exception;



public class RemoveItemFromCartStepDefinitions {
	
	
	@Given("I want to be in the cart")
	public void iWantToBeInTheCart() {
	}

	@When("I want to remove the item with id {string}")
	public void iWantToRemoveTheItemWithId(String itemId) {
		theActorInTheSpotlight().wasAbleTo(RemoveFromCart.itemWithId(itemId));
		
	}

	@Then("I validate that i have removed the item")
	public void iValidateThatIHaveRemovedTheItem() {
		theActorInTheSpotlight()
		.should(
				seeThat(RemovedItemCartVerification.in(CartPage.CART_LIST), IsEqual.equalTo(true))
				.orComplainWith(Exception.class, "No se removió el ítem del carrito.")
				);
	}
	

}
