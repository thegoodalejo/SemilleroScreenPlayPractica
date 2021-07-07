package com.grupo3.stepdefs;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.grupo3.model.Animal;
import com.grupo3.questions.AmountOfItemsInCart;
import static com.grupo3.questions.TheItem.theItemWithTheAnimal;
import com.grupo3.tasks.ClickRemoveButton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RemoveItemFromCartStepDefinitions {

	@Given("Tengo al menos {int} elemento en mi carrito")
	public void tengoAlMenosElementoEnMiCarrito(Integer minItems) {
	    theActorCalled("X").should(seeThat(AmountOfItemsInCart.isAtLeast(minItems)));
	}

	@When("Elija un elemento y presione su boton de eliminar")
	public void elijaUnElementoYPresioneSuBotonDeEliminar() {
	    theActorInTheSpotlight().wasAbleTo(ClickRemoveButton.forLastItemAddedByActor(theActorInTheSpotlight()));
	}

	@Then("Deberia ver que el elemento ya no esta en el carrito")
	public void deberiaVerQueElElementoYaNoEstaEnElCarrito() {
		Animal animal = theActorInTheSpotlight().recall("ADDED_ANIMAL");
	    theActorInTheSpotlight().should(seeThat(theItemWithTheAnimal(animal).isNoLongerInTheCart()));
	}
	
}
