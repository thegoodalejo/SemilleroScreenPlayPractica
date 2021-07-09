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
import com.sophos.semillero.tasks.GoToCartPage;
import com.sophos.semillero.tasks.GoToHomePage;
import com.sophos.semillero.tasks.GoToLoginPage;
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
	
	@Given("Navigate to shopping cart page")
	public void navigateToShoppingCartPage() {
		theActorCalled("Grupo 4").wasAbleTo(GoToCartPage.usingButtonAtTheTop());
	}
	
	@When("Validate that item ID {string} is present")
	public void validateThatItemIdIsPresent(String strItemId) {
		theActorInTheSpotlight().should(seeThat(TextObtained.in(CartPage.BTN_REMOVE_ITEM.of(strItemId)), IsEqual.equalTo(strItemId)));
	}

	@Then("Delete item with ID {string}")
	public void deleteItemWithId(String strItemId) {
		theActorInTheSpotlight().wasAbleTo(RemoveAnimalFromCart.usingButtonForItemId(strItemId));
	}

}
