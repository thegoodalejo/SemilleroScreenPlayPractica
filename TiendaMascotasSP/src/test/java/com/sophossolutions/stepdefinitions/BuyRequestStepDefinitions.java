package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.tasks.SelectBuy;
import com.sophossolutions.tasks.SelectNextOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyRequestStepDefinitions {
	@Given("Estando en el carrito deseo proceder a generar la orden de compra")
	public void estandoEnElCarritoDeseoProcederAGenerarLaOrdenDeCompra() {
		theActorCalled("grupo_5").wasAbleTo(SelectBuy.in());
	}

	@When("Continuar y confirmar con el proceso de generacion de orden")
	public void continuarYConfirmarConElProcesoDeGeneracionDeOrden() {
	   
		theActorInTheSpotlight().wasAbleTo(SelectNextOptions.in());
	}

	@Then("Espero ver los datos correspondientes a mi compra")
	public void esperoVerLosDatosCorrespondientesAMiCompra() {
	   
	}

}
