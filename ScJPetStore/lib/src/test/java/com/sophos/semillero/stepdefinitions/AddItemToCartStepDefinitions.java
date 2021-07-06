package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the; //evalua un target
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight; //ya conoce el actor
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.sophos.semillero.tasks.AddToCart;
import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.ui.CatalogPage;


public class AddItemToCartStepDefinitions {
	
	@Given("Deseo seleccionar un item")
	public void deseoSeleccionarUnItem() {
		
	}

	@When("Elijo una categoria (.+) un producto (.+) y un item(.+)$")
	public void elijoUnaCategoriaUnProductoYUnItem(String strCategoria, String strProductoId, String strItemId) {
		theActorCalled("Angel Vivas").wasAbleTo(AddToCart.withCategoriaProductoItem(strCategoria, strProductoId, strItemId));
		
	}

	
	@Then("Valido el carrito")
	public void validoElCarrito() {
		
	}
	
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
