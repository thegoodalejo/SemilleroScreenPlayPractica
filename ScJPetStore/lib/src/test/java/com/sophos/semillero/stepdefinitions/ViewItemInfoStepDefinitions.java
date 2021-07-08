package com.sophos.semillero.stepdefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight; //ya conoce el actor
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import java.util.Map;

import com.sophos.semillero.ui.CatalogPage;
import com.sophos.semillero.exceptions.Exception;
import com.sophos.semillero.tasks.SelectItem;

public class ViewItemInfoStepDefinitions {

	@When("I select the item")
	public void iSelectTheItem(DataTable data) {
		Map<String,String> mapData = data.asMap(String.class, String.class);
				
		String strCategoria = mapData.get("0").split(",")[0];
		String strProductoId = mapData.get("0").split(",")[1];
		String strItemId = mapData.get("0").split(",")[2];
		
		theActorInTheSpotlight().wasAbleTo(SelectItem.with(strCategoria, strProductoId, strItemId));	
	}
	
	@Then("I valide if the item has an image")
	public void iValideIfTheItemHasAnImage() {
		theActorInTheSpotlight().should(seeThat(the(CatalogPage.IMG_ITEM), isVisible())
				.orComplainWith(Exception.class, "No es visible la información del item."));
	}


}
