package com.sophossolutions.stepdefinitions;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotCurrentlyVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


import net.serenitybdd.screenplay.Actor;

import com.sophossolutions.tasks.Delete;
import com.sophossolutions.ui.CartPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class DeleteItemStepDefinitions {
	
	
	@When("Deseo eliminar el item {string}")
	public void deseoEliminarElItem(String strIdItem) {
		theActorCalled("grupo_5").wasAbleTo(Delete.the(strIdItem));
	}

	@Then("Quiero verificar que el item ya no esta en el carrito")
	public void quieroVerificarQueElItemYaNoEstaEnElCarrito() {
		String strIdItem = theActorInTheSpotlight().recall("ID_ITEM");
		theActorInTheSpotlight().should(seeThat(the(CartPage.ID_ITEM.of(strIdItem)), isNotCurrentlyVisible()));
	}
}
