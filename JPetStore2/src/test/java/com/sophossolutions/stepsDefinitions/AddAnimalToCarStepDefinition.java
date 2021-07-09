package com.sophossolutions.stepsDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.TextObtained;
import com.sophossolutions.questions.TextObtainedInList;
import com.sophossolutions.tasks.SelectItem;
import com.sophossolutions.tasks.AddCart;
import com.sophossolutions.tasks.SelectCategory;
import com.sophossolutions.ui.CartPage;
import com.sophossolutions.ui.CategoryPage;
import com.sophossolutions.ui.DetailPage;
import com.sophossolutions.ui.HomePage;
import com.sophossolutions.ui.NamePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddAnimalToCarStepDefinition {
	
	String idItem;
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("Que me mostro el mensaje {string}")
	public void queMeMostroElMensaje(String strTitleWhenLoggedIn) {
		theActorCalled("Grupo 4").should(seeThat(TextObtained.in(HomePage.TXT_WELCOME), IsEqual.equalTo(strTitleWhenLoggedIn)));
	}
	
	@When("Agrego un animal al carrito de compras")
	public void agregoUnAnimalAlCarritoDeCompras() {
		theActorCalled("Grupo 4").wasAbleTo(SelectCategory.in(), 
				SelectItem.in(CategoryPage.LINK_CATEGORY),
				SelectItem.in(NamePage.LINK_NAME),
				AddCart.in(DetailPage.BTN_ADD_CART));
		idItem = theActorCalled("Grupo 4").recall("ID_ITEM").toString();
		
	}
	
	@Then("Valido que en la tabla este el ID Item")
	public void validoQueEnLaTablaEsteElIDItem() {
		theActorInTheSpotlight().should(seeThat(TextObtainedInList.in(CartPage.TXT_ID_ITEM,idItem),IsEqual.equalTo(idItem)));
	}
}
