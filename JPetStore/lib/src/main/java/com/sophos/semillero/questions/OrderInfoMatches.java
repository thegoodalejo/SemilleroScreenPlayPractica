package com.sophos.semillero.questions;

import com.sophos.semillero.model.OrderInfoModel;
import com.sophos.semillero.ui.CheckoutPage;
import com.sophos.semillero.ui.ConfirmOrderPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class OrderInfoMatches implements Question<Boolean> {

	private OrderInfoModel orderInfo;

	public OrderInfoMatches(OrderInfoModel orderInfo) {
		this.orderInfo = orderInfo;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		return doAddressesMatch();
	}
	
	private Boolean doAddressesMatch() {
		return (TextObtained.in(ConfirmOrderPage.TXT_BILLING_FIRST_NAME).equals(orderInfo.getStrFirstNameBilling()) &&
				TextObtained.in(ConfirmOrderPage.TXT_BILLING_LAST_NAME).equals(orderInfo.getStrLastNameBilling()) &&
				TextObtained.in(ConfirmOrderPage.TXT_BILLING_ADDRESS_1).equals(orderInfo.getStrAddress1Billing()) &&
				TextObtained.in(ConfirmOrderPage.TXT_BILLING_ADDRESS_2).equals(orderInfo.getStrAddress2Billing()) &&
				TextObtained.in(ConfirmOrderPage.TXT_BILLING_CITY).equals(orderInfo.getStrCityBilling()) &&
				TextObtained.in(ConfirmOrderPage.TXT_BILLING_STATE).equals(orderInfo.getStrStateBilling()) &&
				TextObtained.in(ConfirmOrderPage.TXT_BILLING_ZIP).equals(orderInfo.getStrZipBilling()) &&
				TextObtained.in(ConfirmOrderPage.TXT_BILLING_COUNTRY).equals(orderInfo.getStrCountryBilling()) &&
				
				TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_FIRST_NAME).equals(orderInfo.getStrFirstNameShipping()) &&
				TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_LAST_NAME).equals(orderInfo.getStrLastNameShipping()) &&
				TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_ADDRESS_1).equals(orderInfo.getStrAddress1Shipping()) &&
				TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_ADDRESS_2).equals(orderInfo.getStrAddress2Shipping()) &&
				TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_CITY).equals(orderInfo.getStrCityShipping()) &&
				TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_STATE).equals(orderInfo.getStrStateShipping()) &&
				TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_ZIP).equals(orderInfo.getStrZipShipping()) &&
				TextObtained.in(ConfirmOrderPage.TXT_SHIPPING_COUNTRY).equals(orderInfo.getStrCountryShipping())
				);
	}

	public static OrderInfoMatches enteredInfo(OrderInfoModel orderInfo) {
		return new OrderInfoMatches(orderInfo);
	}

}
