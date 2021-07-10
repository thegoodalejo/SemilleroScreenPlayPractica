package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.exceptions.ExceptionMsg;
import com.sophos.semillero.questions.TextObtained;
import com.sophos.semillero.tasks.GoToPageGivenByTarget;
import com.sophos.semillero.tasks.GoToRegisterPage;
import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.tasks.RegisterNewUser;
import com.sophos.semillero.tasks.RemoveAnimalFromCart;
import com.sophos.semillero.ui.CartPage;
import com.sophos.semillero.ui.HomePage;

public class RemoveAnimalFromCartStepDefinitions {
	@Before("")
	public void setup() {
		setTheStage(new OnlineCast());
	}
	/*
	@Given("Navigate to shopping cart page")
	public void navigateToShoppingCartPage() {
		theActorCalled("Grupo 4").wasAbleTo(GoToPageGivenByTarget.usingButtonOrLink(HomePage.BTN_CART));
	}
	
	@When("Validate that item ID {string} is present")
	public void validateThatItemIdIsPresent(String strItemId) {
		theActorInTheSpotlight().should(seeThat(TextObtained.in(CartPage.BTN_REMOVE_ITEM.of(strItemId)), IsEqual.equalTo(strItemId)));
	}

	@Then("Delete item with ID {string}")
	public void deleteItemWithId(String strItemId) {
		theActorInTheSpotlight().wasAbleTo(RemoveAnimalFromCart.usingButtonForItemId(strItemId));
	}
	*/
	// This method works wih the current "add animal to cart" feature. They both have to be changed to support choosing items
	@When("Delete item from cart")
	public void deleteItemWithId() {
		String strItemDetailId = theActorInTheSpotlight().recall("strItemDetailId");
		theActorInTheSpotlight().wasAbleTo(RemoveAnimalFromCart.usingButtonForItemId(strItemDetailId));
	}
	
	@Then("Validate if the cart is now empty")
	public void validateIfTheCartIsNowEmpty() {
		String strEmptyCartMsg = "Your cart is empty.";
		theActorInTheSpotlight().should(seeThat(TextObtained.from(CartPage.TXT_EMPTY_CART),
				IsEqual.equalTo(strEmptyCartMsg)).orComplainWith(ExceptionMsg.class,
						"Error when validating if the cart is now empty"));
		
	}
}
