package com.sophos.semillero.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight; //ya conoce el actor
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import java.util.Map;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.AddItemCartVerification;
import com.sophos.semillero.tasks.AddToCart;
import com.sophos.semillero.tasks.SelectItem;
import com.sophos.semillero.ui.CatalogPage;
import com.sophos.semillero.exceptions.Exception;



public class AddItemToCartStepDefinitions {
	
		
	@When("Agrego items al carrito")
	public void agregoItemsAlCarrito(DataTable data) {
		Map<String,String> mapData = data.asMap(String.class, String.class);
		
		for (int i = 0; i < mapData.size(); i++) {
			String strCategoria = mapData.get(i+"").split(",")[0];
			String strProductoId = mapData.get(i+"").split(",")[1];
			String strItemId = mapData.get(i+"").split(",")[2];
			
			theActorInTheSpotlight().wasAbleTo(SelectItem.with(strCategoria, strProductoId, strItemId));
			theActorInTheSpotlight().wasAbleTo(AddToCart.with(strCategoria, strProductoId, strItemId));			
		}	
	}

	
	@Then("Valido el carrito")
	public void validoElCarrito() {
		theActorInTheSpotlight()
		.should(
				seeThat(AddItemCartVerification.in(CatalogPage.CART_LIST), IsEqual.equalTo(true))
				.orComplainWith(Exception.class, "No se agrego el ítem al carrito.")
				);
	}


}
