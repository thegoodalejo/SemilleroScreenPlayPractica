package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.ResultLogin;
import com.sophossolutions.tasks.SelectSpecie;
import com.sophossolutions.tasks.ViewItem;
import com.sophossolutions.ui.ItemInfo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewItemInfoStepDefinitions {
	
	@Given("Estando en la pagina de inicio deseo seleccionar una especie {string}")
	public void estandoEnLaPaginaDeInicioDeseoSeleccionarUnaEspecie(String strEspecie) {
		theActorCalled("grupo_5").wasAbleTo(SelectSpecie.withValue(strEspecie));
	}

	@When("Deseo seleccionar un producto {string} y selecionar un item {string}")
	public void deseoSeleccionarUnProductoYSelecionarUnItem(String strIdProducto, String strIdItem) {
		theActorInTheSpotlight().wasAbleTo(ViewItem.info(strIdProducto, strIdItem));
	}

	@Then("Quiero verificar la informacion de la ficha tecnica del animal")
	public void quieroVerificarLaInformacionDeLaFichaTecnicaDelAnimal() {
		String strIdItem = theActorInTheSpotlight().recall("ID_ITEM");
		theActorInTheSpotlight().should(seeThat(ResultLogin.in(ItemInfo.TXT_ID_ANIMAL.of(strIdItem)),IsEqual.equalTo(strIdItem)));	    
	}
}
