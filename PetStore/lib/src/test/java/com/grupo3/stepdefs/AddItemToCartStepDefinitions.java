package com.grupo3.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static com.grupo3.tasks.AddARandomProductToCart.addARandomProductToCart;

public class AddItemToCartStepDefinitions {

	@Given("Quiero agregar un item al carrito")
	public void quieroAgregarUnItemAlCarrito() {
	    
	}

	@When("Busco el item y lo agrego al carrito")
	public void buscoElItemYLoAgregoAlCarrito() {
	    theActorInTheSpotlight().wasAbleTo(addARandomProductToCart());
	}

	@Then("Deberia ver ese item en la lista de elementos del carrito")
	public void deberAVerEseItemEnLaListaDeElementosDelCarrito() {
	    System.out.println("xd");
	}
	
}
