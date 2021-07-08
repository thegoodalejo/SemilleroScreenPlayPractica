package com.sophos.semillero.stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight; 


import java.util.Map;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.AllProducts;
import com.sophos.semillero.tasks.AddThe;
import com.sophos.semillero.ui.CatalogPage;
import com.sophos.semillero.exceptions.Exception;



public class AddItemToCartStepDefinitions {
	
		
	@When("I add items to the cart")
	public void iAddItemsToTheCart(DataTable data) {
		Map<String,String> mapData = data.asMap(String.class, String.class);
		theActorInTheSpotlight().wasAbleTo(AddThe.items(mapData));
	}

	
	@Then("I valide my cart")
	public void IValideMyCart() {
		theActorInTheSpotlight().should(seeThat(AllProducts.wereAdded(CatalogPage.CART_LIST), IsEqual.equalTo(true))
				.orComplainWith(Exception.class, "No se agrego el ítem al carrito."));
	}


}
