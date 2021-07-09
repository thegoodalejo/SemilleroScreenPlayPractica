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

import com.sophos.semillero.model.OrderCardModel;
import com.sophos.semillero.model.OrderUserInfoModel;
import com.sophos.semillero.questions.TextObtained;
import com.sophos.semillero.tasks.EnterCardDetails;
import com.sophos.semillero.tasks.GoToPageGivenByTarget;
import com.sophos.semillero.tasks.ValidateBillingInfoInConfirmOrder;
import com.sophos.semillero.tasks.ValidateReceipt;
import com.sophos.semillero.ui.CartPage;
import com.sophos.semillero.ui.CheckoutPage;
import com.sophos.semillero.ui.ConfirmOrderPage;
import com.sophos.semillero.ui.ReceiptPage;

public class FinishBuyRequestStepDefinitions {

	// private static WebDriver driver = new ChromeDriver();

	@Before("")
	public void setup() {
		setTheStage(new OnlineCast());
	}
	/*
	 * @Given("At least one item is present in the cart") public void
	 * atLeastOneItemIsPresentInTheCart() { String strEmptyCartMsg =
	 * "Your cart is empty."; // An exception is caught if the cart is empty. if
	 * (!driver.findElements(By.xpath(CartPage.TXT_EMPTY_CART.getCssOrXPathSelector(
	 * ))).isEmpty()) {
	 * theActorCalled("Grupo 4").should(seeThat(TextObtained.in(CartPage.
	 * TXT_EMPTY_CART), IsEqual.equalTo(strEmptyCartMsg))); } else { System.out.
	 * println("Cart is empty! Can't proceed to checkout. An exception will be thrown NOW!"
	 * ); // This forces an exception to be thrown if cart is somehow empty
	 * driver.findElement(By.xpath(CartPage.TXT_EMPTY_CART.getCssOrXPathSelector()))
	 * .click(); } }
	 */

	@Given("Go to checkout page")
	public void goToCheckoutPage() {
		theActorCalled("Grupo 4").wasAbleTo(GoToPageGivenByTarget.usingButtonOrLink(CartPage.BTN_CHECKOUT));
	}

	@When("Choose card type {string} with number {string} and date {string}")
	public void chooseCardTypeWithNumberAndDate(String strCardType, String strCardNumber, String strCardExpiryDate) {
		OrderCardModel ocmUserCard = new OrderCardModel(strCardType, strCardNumber, strCardExpiryDate);
		theActorInTheSpotlight().remember("ocmUserCard", ocmUserCard);

		theActorInTheSpotlight().wasAbleTo(EnterCardDetails.ofTheirCard());
	}

	@When("Confirm order information")
	public void confirmOrderInformation() {
		String strFirstNameBilling = CheckoutPage.TXT_FIRST_NAME.resolveFor(theActorInTheSpotlight()).getValue();
		String strLastNameBilling = CheckoutPage.TXT_LAST_NAME.resolveFor(theActorInTheSpotlight()).getValue();
		String strAddress1Billing = CheckoutPage.TXT_ADDRESS_1.resolveFor(theActorInTheSpotlight()).getValue();
		String strAddress2Billing = CheckoutPage.TXT_ADDRESS_2.resolveFor(theActorInTheSpotlight()).getValue();
		String strCityBilling = CheckoutPage.TXT_CITY.resolveFor(theActorInTheSpotlight()).getValue();
		String strStateBilling = CheckoutPage.TXT_STATE.resolveFor(theActorInTheSpotlight()).getValue();
		String strZipBilling = CheckoutPage.TXT_ZIP.resolveFor(theActorInTheSpotlight()).getValue();
		String strCountryBilling = CheckoutPage.TXT_COUNTRY.resolveFor(theActorInTheSpotlight()).getValue();
		OrderUserInfoModel ouimInfo = new OrderUserInfoModel(strFirstNameBilling, strLastNameBilling,
				strAddress1Billing, strAddress2Billing, strCityBilling, strStateBilling, strZipBilling,
				strCountryBilling, strFirstNameBilling, strLastNameBilling, strAddress1Billing,
				strAddress2Billing, strCityBilling, strStateBilling, strZipBilling, strCountryBilling);
		theActorInTheSpotlight().remember("ouimInfo", ouimInfo);
		
		theActorInTheSpotlight().wasAbleTo(
				GoToPageGivenByTarget.usingButtonOrLink(CheckoutPage.BTN_CONTINUE),
				ValidateBillingInfoInConfirmOrder.ofUser(),
				GoToPageGivenByTarget.usingButtonOrLink(ConfirmOrderPage.BTN_CONFIRM)
				);
		
	}

	@When("Validate that receipt information matches order")
	public void validateThatReceiptInformationMatchesOrder() {
		String[] strArrGeneratedDetails = ReceiptPage.ROW_GENERATED_DETAILS.resolveFor(theActorInTheSpotlight()).getText().split(" ");
		String strOrderId = strArrGeneratedDetails[1];
		String strOrderDate = strArrGeneratedDetails[2];
		System.out.println("Nice! Your newly created order has an ID of " + strOrderId);
		
		theActorInTheSpotlight().wasAbleTo(ValidateReceipt.ofOrder(strOrderDate));
	}
}
