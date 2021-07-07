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

import com.sophos.semillero.questions.AddItemCartVerification;
import com.sophos.semillero.questions.RemoveItemCartVerification;
import com.sophos.semillero.tasks.AddToCart;
import com.sophos.semillero.tasks.RemoveFromCart;
import com.sophos.semillero.ui.CatalogPage;
import com.sophos.semillero.exceptions.Exception;



public class RemoveItemFromCartStepDefinitions {
	
	
	@Given("Deseo estar en el carrito")
	public void deseoEstarEnElCarrito() {
	}

	@When("Deseo remover el item con id {string}")
	public void deseoRemoverElItemConId(String itemId) {
		theActorInTheSpotlight().wasAbleTo(RemoveFromCart.itemWithId(itemId));
		
	}

	@Then("Verifico el carrito")
	public void verificoElCarrito() {
		theActorInTheSpotlight()
		.should(
				seeThat(RemoveItemCartVerification.in(CatalogPage.CART_LIST), IsEqual.equalTo(true))
				.orComplainWith(Exception.class, "No se removió el ítem del carrito.")
				);
	}
	

}
