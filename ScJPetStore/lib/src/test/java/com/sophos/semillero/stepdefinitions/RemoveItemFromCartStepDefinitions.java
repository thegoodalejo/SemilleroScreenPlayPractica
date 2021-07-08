package com.sophos.semillero.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import io.cucumber.datatable.DataTable;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight; //ya conoce el actor
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import java.util.Map;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.AllProducts;
import com.sophos.semillero.questions.RemoveItemCartVerification;
import com.sophos.semillero.tasks.AddToCart;
import com.sophos.semillero.tasks.RemoveFromCart;
import com.sophos.semillero.ui.CatalogPage;
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
				seeThat(RemoveItemCartVerification.in(CatalogPage.CART_LIST), IsEqual.equalTo(true))
				.orComplainWith(Exception.class, "No se removió el ítem del carrito.")
				);
	}
	

}
