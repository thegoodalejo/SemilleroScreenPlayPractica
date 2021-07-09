package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sophos.semillero.model.CardModel;
import com.sophos.semillero.questions.TextObtained;
import com.sophos.semillero.tasks.EnterCardDetails;
import com.sophos.semillero.tasks.GoToPageGivenByTarget;
import com.sophos.semillero.tasks.ValidateBillingInfo;
import com.sophos.semillero.ui.CartPage;
import com.sophos.semillero.ui.CheckoutPage;
import com.sophos.semillero.ui.ConfirmOrderPage;

public class FinishBuyRequestStepDefinitions {
	
	private static WebDriver driver = new ChromeDriver();
	
	@Before("")
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("At least one item is present in the cart")
	public void atLeastOneItemIsPresentInTheCart() {
		String strEmptyCartMsg = "Your cart is empty.";
		// An exception is caught if the cart is empty.
		if (!driver.findElements(By.xpath(CartPage.TXT_EMPTY_CART.getCssOrXPathSelector())).isEmpty()) {
			theActorCalled("Grupo 4").should(seeThat(TextObtained.in(CartPage.TXT_EMPTY_CART),
					IsEqual.equalTo(strEmptyCartMsg)));
		} else {
			System.out.println("Cart is empty! Can't proceed to checkout. An exception will be thrown NOW!");
			// This forces an exception to be thrown if cart is somehow empty
			driver.findElement(By.xpath(CartPage.TXT_EMPTY_CART.getCssOrXPathSelector())).click();
		}
	}
	
	@Given("Go to checkout page")
	public void goToCheckoutPage() {
		theActorCalled("Grupo 4").wasAbleTo(GoToPageGivenByTarget.usingButtonOrLink(CartPage.BTN_CHECKOUT));
	}

	@When("Choose card type {string} with number {int} and date {string}")
	public void chooseCardTypeWithNumberAndDate(String strCardType, int intCardNumber, String strCardExpiryDate) {
		CardModel cmUserCard = new CardModel(strCardType, intCardNumber, strCardExpiryDate);
		theActorInTheSpotlight().remember("cmUserCard", cmUserCard);
		
		theActorInTheSpotlight().wasAbleTo(EnterCardDetails.ofTheirCard());
	}
	
	@When("Validate that billing details match account information")
	public void validateThatBillingDetailsMatchAccountInformation() {
		theActorInTheSpotlight().wasAbleTo(ValidateBillingInfo.ofUser());
		theActorInTheSpotlight().wasAbleTo(GoToPageGivenByTarget.usingButtonOrLink(CheckoutPage.BTN_CONTINUE));
	}
	
	@When("Confirm order information")
	public void confirmOrderDetails() {
		theActorInTheSpotlight().wasAbleTo(ValidateBillingInfo.ofUser());
		theActorInTheSpotlight().wasAbleTo(GoToPageGivenByTarget.usingButtonOrLink(ConfirmOrderPage.BTN_CONFIRM));
	}
}
