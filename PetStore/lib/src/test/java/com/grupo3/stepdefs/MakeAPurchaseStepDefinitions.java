package com.grupo3.stepdefs;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static com.grupo3.tasks.FinishThePurchasingProcess.finishThePurchasingProcessWithCredentials;

import static com.grupo3.interactions.GetCartItems.rememberTheItemsInTheCart;

import com.grupo3.model.Purchase;
import com.grupo3.questions.TheInfoInTheReceipt;
import com.grupo3.ui.CartViewPage;


public class MakeAPurchaseStepDefinitions {

	@When("Termino el proceso de compra")
	public void terminoElProcesoDeCompra() {
	    theActorCalled("X").wasAbleTo(rememberTheItemsInTheCart());
	}

	@When("Ingreso la informacion pertinente")
	public void ingresoLaInformacionPertinente() {
	    theActorInTheSpotlight().wasAbleTo(finishThePurchasingProcessWithCredentials("qwertyasdf", "asdf"));
	}

	@Then("Valido que la informacion de la factura sea congruente con la compra")
	public void validoQueLaInformacionDeLaFacturaSeaCongruenteConLaCompra() {
	    theActorInTheSpotlight().should(seeThat(TheInfoInTheReceipt.isCongruentWithTheMostRecentPurchase()));
	}
	
}
