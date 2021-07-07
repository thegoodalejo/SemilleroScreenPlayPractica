package com.sophossolutions.stepdefinitions;

import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.sophossolutions.tasks.SelectSpecie;
import com.sophossolutions.ui.CartPage;
import com.sophossolutions.questions.Item;
import com.sophossolutions.tasks.AddToCar;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCarStepDefinitions {
	@Given("Estando en la pagina de inicio deseo selecionar una especie de animal {string}")
	public void estandoEnLaPaginaDeInicioDeseoSelecionarUnaEspecieDeAnimal(String strEspecie) {
		theActorCalled("grupo_5").wasAbleTo(SelectSpecie.withValue(strEspecie));

	}

	@When("Deseo selecionar un producto {string} y agregar el item {string}")
	public void deseoSelecionarUnProductoYAgregarElItem(String strIdProducto, String strIdItem) {
		theActorInTheSpotlight().wasAbleTo(AddToCar.the(strIdProducto, strIdItem));

	}

	@Then("Quiero verificar si quedo el item {string} en el carrito")
	public void quieroVerificarSiQuedoElItemEnElCarrito(String strItem) {
		theActorInTheSpotlight().should(seeThat(Item.inCar(CartPage.ID_ITEM.of(strItem)),IsEqual.equalTo(strItem)));
	}

}
