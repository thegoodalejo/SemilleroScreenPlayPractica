package com.sophossolutions.stepsDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.TextObtained;
import com.sophossolutions.questions.ValidateTotalCost;
import com.sophossolutions.tasks.TypingText;
import com.sophossolutions.ui.CartPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UpdateCarAmmountStepDefinition {
	
	String cantidad = "3";
	String idItem;
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("Que estoy en el {string}")
	public void queEstoyEnEl(String strShoppingCart) {
		theActorCalled("Grupo 4").should(seeThat(TextObtained.in(CartPage.TXT_TITLE), IsEqual.equalTo(strShoppingCart)));
	}

	@When("Modifico la cantidad de un item agregado al carrito de compras")
	public void modificoLaCantidadDeUnItemAgregadoAlCarritoDeCompras() {
		theActorCalled("Grupo 4").wasAbleTo(TypingText.of(cantidad,CartPage.INPUT_CANT),Click.on(CartPage.BTN_UPDATE));
	}


	@Then("Valido que el costo total se actualice en el carrito")
	public void validoQueElCostoTotalSeActualicenEnElCarrito() {
		theActorInTheSpotlight().should(seeThat(ValidateTotalCost.in(cantidad),IsEqual.equalTo(true)));

	}

}
