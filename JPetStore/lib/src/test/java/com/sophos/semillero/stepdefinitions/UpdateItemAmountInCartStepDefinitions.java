package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.exceptions.ExceptionMsg;
import com.sophos.semillero.questions.TextObtained;
import com.sophos.semillero.questions.TextObtainedFromString;
import com.sophos.semillero.tasks.UpdateItemAmountInCart;
import com.sophos.semillero.ui.CartPage;
import com.sophos.semillero.ui.CheckoutPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UpdateItemAmountInCartStepDefinitions {

	private int intNewItemAmount;

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("I am in the shopping cart page")
	public void iAmInTheShoppintCartPage() {
		String strShoppingCartPageTitle = "Shopping Cart";
		theActorCalled("Grupo 4").should(
				seeThat(TextObtained.from(CartPage.TXT_CART_PAGE_TITLE), IsEqual.equalTo(strShoppingCartPageTitle))
				.orComplainWith(ExceptionMsg.class,
						"Error when navigating to cart page"));
	}

	@When("I modify the amount of the first animal in the cart to {int}")
	public void modifyTheAmountOfTheFirstAnimalInTheCartTo(int intNewItemAmount) {
		this.intNewItemAmount = intNewItemAmount;

		theActorInTheSpotlight().remember("strPriceOfItem",
				CartPage.TXT_LIST_PRICE_FIRST_ITEM.resolveFor(theActorInTheSpotlight()).getText().substring(1));

		theActorInTheSpotlight()
				.wasAbleTo(UpdateItemAmountInCart.usingField(intNewItemAmount, CartPage.TXT_AMOUNT_FIRST_ITEM));
	}

	@Then("Validate the new item amount in the cart")
	public void validateTheNewItemAmountInTheCart() {
		String strUpdatedAmount = CartPage.TXT_AMOUNT_FIRST_ITEM.resolveFor(theActorInTheSpotlight()).getValue();
		theActorInTheSpotlight().should(seeThat(TextObtainedFromString.in(strUpdatedAmount),
				IsEqual.equalTo(String.valueOf(this.intNewItemAmount))).orComplainWith(ExceptionMsg.class,
						"Error when validating the new item amount in the cart"));

	}

	@Then("Validate that the total costs are correct")
	public void validateThatTheTotalCostIsCorrect() {
		String strUpdatedCartTotalFromPage = CartPage.TXT_CART_TOTAL.resolveFor(theActorInTheSpotlight()).getText()
				.split(": ")[1].substring(1);
		Double numUpdatedCartTotalFromPage = Double.parseDouble(strUpdatedCartTotalFromPage);

		Double numTrueUpdatedTotal = this.intNewItemAmount
				* Double.parseDouble(theActorInTheSpotlight().recall("strPriceOfItem"));

		String totalComparisonResult = String.valueOf(numUpdatedCartTotalFromPage.compareTo(numTrueUpdatedTotal));

		theActorInTheSpotlight().should(seeThat(TextObtainedFromString.in(totalComparisonResult), IsEqual.equalTo("0"))
				.orComplainWith(ExceptionMsg.class, "Error when validating that the total costs are correct"));

	}

}
