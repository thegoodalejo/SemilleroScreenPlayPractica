package com.grupo3.stepdefs;

import static com.grupo3.tasks.GetTheCartInfo.readAndRememberTheItemsInTheCart;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.grupo3.questions.AmountOfItemsInCart;
import com.grupo3.questions.TheItemsInTheCart;
import com.grupo3.util.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidateCartStepDefinitions {

	@Given("Tengo al menos {int} elementos en el carrito")
	public void tengoAlMenosElementosEnElCarrito(Integer minItems) {
		theActorCalled(Constants.ACTOR).should(seeThat(AmountOfItemsInCart.isAtLeast(minItems)));
	}

	@When("Veo la informacion de los elementos en el carrito")
	public void veoLaInformacionDeLosElementosEnElCarrito() {
	    theActorInTheSpotlight().wasAbleTo(readAndRememberTheItemsInTheCart());
	}

	@Then("Deberia validar que la informacion es congruente")
	public void deberiaValidarQueLaInformacionEsCongruente() {
	    theActorInTheSpotlight().should(seeThat(TheItemsInTheCart.areCongruent()));
	}
	
}
