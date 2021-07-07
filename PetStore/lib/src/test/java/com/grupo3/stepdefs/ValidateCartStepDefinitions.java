package com.grupo3.stepdefs;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.grupo3.model.ShoppingCart;
import com.grupo3.questions.AmountOfItemsInCart;
import static com.grupo3.tasks.GetTheCartInfo.readAndRememberTheItemsInTheCart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidateCartStepDefinitions {

	@Given("Tengo al menos {int} elementos en el carrito")
	public void tengoAlMenosElementosEnElCarrito(Integer minItems) {
		theActorCalled("X").should(seeThat(AmountOfItemsInCart.isAtLeast(minItems)));
	}

	@When("Veo la informacion de los elementos en el carrito")
	public void veoLaInformacionDeLosElementosEnElCarrito() {
	    theActorInTheSpotlight().wasAbleTo(readAndRememberTheItemsInTheCart());
	}

	@Then("Deberia validar que la informacion es congruente")
	public void deberiaValidarQueLaInformacionEsCongruente() {
	    ShoppingCart c = theActorInTheSpotlight().recall("SHOPPING_CART");
	    c.printCart();
	}
	
}
