package com.sophossolutions.stepsDefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RemoveItemFromCarStepDefinition {
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@When("Elimino item agregado al carrito de compras")
	public void eliminoItemAgregadoAlCarritoDeCompras() {
	}

	@Then("Valido que el item ya no se encuentre en el carrito")
	public void validoQueElItemYaNoSeEncuentreEnElCarrito() {
	}
}
