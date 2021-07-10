package com.sophos.semillero.questions;

import com.sophos.semillero.model.OrderInfoModel;
import com.sophos.semillero.ui.CheckoutPage;
import com.sophos.semillero.ui.ConfirmOrderPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmOrderInfoMatches implements Question<Boolean> {

	private OrderInfoModel orderInfo;

	public ConfirmOrderInfoMatches(OrderInfoModel orderInfo) {
		this.orderInfo = orderInfo;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		return doAddressesMatch(actor);
	}
	
	private Boolean doAddressesMatch(Actor actor) {
		return (ConfirmOrderPage.TXT_BILLING_FIRST_NAME.resolveFor(actor).getText().equals(orderInfo.getStrFirstNameBilling()) &&
				ConfirmOrderPage.TXT_BILLING_LAST_NAME.resolveFor(actor).getText().equals(orderInfo.getStrLastNameBilling()) &&
				ConfirmOrderPage.TXT_BILLING_ADDRESS_1.resolveFor(actor).getText().equals(orderInfo.getStrAddress1Billing()) &&
				ConfirmOrderPage.TXT_BILLING_ADDRESS_2.resolveFor(actor).getText().equals(orderInfo.getStrAddress2Billing()) &&
				ConfirmOrderPage.TXT_BILLING_CITY.resolveFor(actor).getText().equals(orderInfo.getStrCityBilling()) &&
				ConfirmOrderPage.TXT_BILLING_STATE.resolveFor(actor).getText().equals(orderInfo.getStrStateBilling()) &&
				ConfirmOrderPage.TXT_BILLING_ZIP.resolveFor(actor).getText().equals(orderInfo.getStrZipBilling()) &&
				ConfirmOrderPage.TXT_BILLING_COUNTRY.resolveFor(actor).getText().equals(orderInfo.getStrCountryBilling()) &&
				
				ConfirmOrderPage.TXT_SHIPPING_FIRST_NAME.resolveFor(actor).getText().equals(orderInfo.getStrFirstNameShipping()) &&
				ConfirmOrderPage.TXT_SHIPPING_LAST_NAME.resolveFor(actor).getText().equals(orderInfo.getStrLastNameShipping()) &&
				ConfirmOrderPage.TXT_SHIPPING_ADDRESS_1.resolveFor(actor).getText().equals(orderInfo.getStrAddress1Shipping()) &&
				ConfirmOrderPage.TXT_SHIPPING_ADDRESS_2.resolveFor(actor).getText().equals(orderInfo.getStrAddress2Shipping()) &&
				ConfirmOrderPage.TXT_SHIPPING_CITY.resolveFor(actor).getText().equals(orderInfo.getStrCityShipping()) &&
				ConfirmOrderPage.TXT_SHIPPING_STATE.resolveFor(actor).getText().equals(orderInfo.getStrStateShipping()) &&
				ConfirmOrderPage.TXT_SHIPPING_ZIP.resolveFor(actor).getText().equals(orderInfo.getStrZipShipping()) &&
				ConfirmOrderPage.TXT_SHIPPING_COUNTRY.resolveFor(actor).getText().equals(orderInfo.getStrCountryShipping())
				);
	}

	public static ConfirmOrderInfoMatches enteredInfo(OrderInfoModel orderInfo) {
		return new ConfirmOrderInfoMatches(orderInfo);
	}

}
