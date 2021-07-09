package com.sophossolutions.stepsDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.TextObtained;
import com.sophossolutions.tasks.SelectCategory;
import com.sophossolutions.tasks.SelectItem;

import com.sophossolutions.ui.CategoryPage;
import com.sophossolutions.ui.DetailPage;
import com.sophossolutions.ui.NamePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ViewItemInfoStepDefinition {

	String idItem;
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("Que estoy en la pagina {string}")
	public void queEstoyEnLaPagina(String strUrl) {
		theActorCalled("Grupo 4").wasAbleTo(Open.url(strUrl));
	}

	@When("Ingreso al detalle de un animal")
	public void ingresoAlDetalleDeUnAnimal() {
		theActorCalled("Grupo 4").wasAbleTo(SelectCategory.in(), 
				SelectItem.in(CategoryPage.LINK_CATEGORY),
				SelectItem.in(NamePage.LINK_NAME));
		idItem = theActorCalled("Grupo 4").recall("ID_ITEM").toString();
	}

	@Then("Valido que el ID_ITEM sea el mismo en el detalle")
	public void validoQueElID_ITEMSeaElMismoEnElDetalle() {
		theActorInTheSpotlight().should(seeThat(TextObtained.in(DetailPage.ID_ITEM),IsEqual.equalTo(idItem)));
	}
}
