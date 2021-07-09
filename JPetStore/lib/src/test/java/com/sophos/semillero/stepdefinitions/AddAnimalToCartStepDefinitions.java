package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.exceptions.ExceptionMsg;
import com.sophos.semillero.questions.TextObtained;
import com.sophos.semillero.questions.TextObtainedInList;
import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.tasks.SelectRandomCategoryAndAnimal;
import com.sophos.semillero.ui.HomePage;

public class AddAnimalToCartStepDefinitions {

	private static int intRandomCategory;
	private static Target tarRandomCategory;

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("I am at the homepage")
	public void iAmAtTheHomePage() {
		String strTitleWhenLoggedIn = "Welcome grupo!";
		theActorCalled("Grupo 4")
				.should(seeThat(TextObtained.in(HomePage.TXT_LOGGED_IN), IsEqual.equalTo(strTitleWhenLoggedIn)));
	}

	@When("A random animal is added to the cart")
	public void aRandomAnimalIsAddedToTheCart() {
		intRandomCategory = (int) (Math.random() * 5 + 1);
		switch (intRandomCategory) {
			case 1:
				tarRandomCategory = HomePage.BTN_FISH;
				break;
			case 2:
				tarRandomCategory = HomePage.BTN_DOGS;
				break;
			case 3:
				tarRandomCategory = HomePage.BTN_REPTILES;
				break;
			case 4:
				tarRandomCategory = HomePage.BTN_CATS;
				break;
			case 5:
				tarRandomCategory = HomePage.BTN_BIRDS;
				break;
		}
		theActorInTheSpotlight().wasAbleTo(
				SelectRandomCategoryAndAnimal.givenByRandomlySelectedCategory(tarRandomCategory),
				
				);
		theActorInTheSpotlight().wasAbleTo(
				
				SelectItem.in(CategoryPage.LINK_CATEGORY),
				SelectItem.in(NamePage.LINK_NAME),
				AddCart.in(DetailPage.BTN_ADD_CART)
				);
		

	}

	@Then("Valido que en la tabla este el ID Item")
	public void validoQueEnLaTablaEsteElIDItem() {
		String strItemId = theActorInTheSpotlight().recall("ID_ITEM").toString();
		theActorInTheSpotlight()
				.should(seeThat(TextObtainedInList.in(CartPage.TXT_ID_ITEM, strItemId), IsEqual.equalTo(strItemId)));
	}

}
