package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.HeaderResult;
import com.sophossolutions.questions.ResultOrder;
import com.sophossolutions.questions.ResultCar;
import com.sophossolutions.questions.ResultPrice;
import com.sophossolutions.model.RegisterUser;
import com.sophossolutions.questions.HeaderDate;
import com.sophossolutions.tasks.SelectBuy;
import com.sophossolutions.tasks.SelectNextOptions;
import com.sophossolutions.ui.FinalOrderPage;

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
		
		RegisterUser UserModel = new RegisterUser ("TiendaMascotasGrupo_5",
				"grupo5", "Andres", "Guarnizo",
				"andres.lopez@sophossolutions.com",
				"3131234567", "Carrera 31 C 19 A las",
				"", "Bogota", "Cundinamerca", "12", "Colombia");
		theActorInTheSpotlight().should(seeThat(HeaderResult.in(),IsEqual.equalTo("true")));
		theActorInTheSpotlight().should(seeThat(HeaderDate.in(),IsEqual.equalTo("false")));
		theActorInTheSpotlight().should(seeThat(ResultOrder.in(FinalOrderPage.TXT_FIRSTNAME),IsEqual.equalTo(UserModel.getStFirstName())));
		theActorInTheSpotlight().should(seeThat(ResultOrder.in(FinalOrderPage.TXT_LASTNAME),IsEqual.equalTo(UserModel.getStrLastName())));
		theActorInTheSpotlight().should(seeThat(ResultOrder.in(FinalOrderPage.TXT_ADDRESS),IsEqual.equalTo(UserModel.getStrAddress1())));
		theActorInTheSpotlight().should(seeThat(ResultOrder.in(FinalOrderPage.TXT_CITY),IsEqual.equalTo(UserModel.getStrCity())));
		theActorInTheSpotlight().should(seeThat(ResultOrder.in(FinalOrderPage.TXT_STATE),IsEqual.equalTo(UserModel.getStrState())));
		theActorInTheSpotlight().should(seeThat(ResultOrder.in(FinalOrderPage.TXT_ZIP),IsEqual.equalTo(UserModel.getStrZip())));
		theActorInTheSpotlight().should(seeThat(ResultOrder.in(FinalOrderPage.TXT_COUNTRY),IsEqual.equalTo(UserModel.getStrCountry())));
		
		String strIdProduct = theActorInTheSpotlight().recall("ID_PRODUCT");
		theActorInTheSpotlight().should(seeThat(ResultCar.in(FinalOrderPage.TXT_ID_ITEM.of(strIdProduct)),IsEqual.equalTo(strIdProduct)));
		String strPrice = theActorInTheSpotlight().recall("PRECIO_TOTAL");
		theActorInTheSpotlight().should(seeThat(ResultPrice.in(FinalOrderPage.TXT_TOTAL_PRICE),IsEqual.equalTo(strPrice)));
	}
	
}
