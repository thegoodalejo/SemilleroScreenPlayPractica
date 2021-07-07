package com.sophossolutions.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.sophossolutions.tasks.ChangeAmount;
import com.sophossolutions.ui.CartPage;

public class UpdateCarStepDefinitions {
	
	@Given("Estando en el carrito con el item agregado")
	public void estandoEnElCarritoConElItemAgregado() {
		theActorCalled("grupo_5").should(seeThat(the(CartPage.TABLE), isVisible()));
	}

	@When("Deseo cambiar la cantidad del item {string} a {int}")
	public void deseoCambiarLaCantidadDelItemA(String strIdItem, Integer intAmount) {
	    theActorInTheSpotlight().wasAbleTo(ChangeAmount.in(strIdItem, intAmount));
	}

	@Then("Quiero validar que el nuevo precio total de los items sea el correcto")
	public void quieroValidarQueElNuevoPrecioTotalDeLosItemsSeaElCorrecto() {
	    
	}

}
