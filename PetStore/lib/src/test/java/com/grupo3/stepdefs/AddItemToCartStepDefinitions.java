package com.grupo3.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.grupo3.questions.AnimalsInCart;
import com.grupo3.util.Constants;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static com.grupo3.tasks.AddARandomProductToCart.addARandomProductToCart;

public class AddItemToCartStepDefinitions {

	@Given("Quiero agregar un item al carrito")
	public void quieroAgregarUnItemAlCarrito() {
	    theActorCalled(Constants.ACTOR).wasAbleTo(Open.url("https://petstore.octoperf.com/actions/Catalog.action"));;
	}

	@When("Busco {int} items y los agrego al carrito")
	public void buscoItemsYLosAgregoAlCarrito(Integer itemAmount) {
		for (int i = 0; i < itemAmount; i++) {
			theActorInTheSpotlight().wasAbleTo(addARandomProductToCart());			
		}
	}

	@Then("Deberia ver ese item en la lista de elementos del carrito")
	public void deberAVerEseItemEnLaListaDeElementosDelCarrito() {
		Actor theActor = theActorInTheSpotlight();
	    theActor.should(seeThat(AnimalsInCart.containsAnimalAddedByActor(theActor)));
	}
	
}
