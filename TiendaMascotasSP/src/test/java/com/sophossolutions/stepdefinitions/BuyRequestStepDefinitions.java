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
import com.sophossolutions.ui.MyAccountPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.questions.Text;

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
		String strFirstName  = theActorInTheSpotlight().recall("FIRSTNAME");
		String strLastName  = theActorInTheSpotlight().recall("LASTNAME");
		String strAddress  = theActorInTheSpotlight().recall("ADDRESS");
		String strCity  = theActorInTheSpotlight().recall("CITY");
		String strState  = theActorInTheSpotlight().recall("STATE");
		String strZip  = theActorInTheSpotlight().recall("ZIP");
		String strCountry  = theActorInTheSpotlight().recall("COUNTRY");
		RegisterUser UserModel = new RegisterUser (strFirstName, strLastName, strAddress, strCity, strState, strZip, strCountry);
		
		theActorInTheSpotlight().should(seeThat(HeaderResult.in(),IsEqual.equalTo("true")));
		theActorInTheSpotlight().should(seeThat(HeaderDate.in(),IsEqual.equalTo("true")));
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
