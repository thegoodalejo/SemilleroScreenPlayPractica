package com.sophos.semillero.stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight; 
import org.hamcrest.core.IsEqual;
import com.sophos.semillero.questions.UpdatedItemCartVerification;
import com.sophos.semillero.tasks.UpdateCartItem;
import com.sophos.semillero.ui.CartPage;
import com.sophos.semillero.exceptions.Exception;


public class UpdateCarAmountStepDefinitions {
	
		
	@When("I want to change the quantity of the itemId {string} by {string}")
	public void iWantToChangeTheQuantityOfTheItemIdBy(String strItemId, String newQuantity) {
		
		theActorInTheSpotlight().wasAbleTo(UpdateCartItem.itemQuantity(strItemId, newQuantity));
	}

	
	@Then("I valide my cart updated")
	public void IValideMyCartUpdated() {
		theActorInTheSpotlight().should(seeThat(UpdatedItemCartVerification.in(CartPage.CART_LIST), IsEqual.equalTo(true))
				.orComplainWith(Exception.class, "Items no se actualizaron correctamente en carrito."));
	}


}
