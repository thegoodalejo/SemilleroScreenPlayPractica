package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.StringRegularExpression.matchesRegex;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static com.sophos.semillero.ui.CheckOutPages.BTN_CHECKOUT;
import static com.sophos.semillero.ui.CheckOutPages.BTN_CONTINUE;
import static com.sophos.semillero.ui.CheckOutPages.BTN_CONFIRM;
import static com.sophos.semillero.ui.Invoice.TXT_ORDER_DATE;
import static com.sophos.semillero.ui.Invoice.TXT_BILL;
import static com.sophos.semillero.ui.Invoice.TXT_BILL_ITEMS;
import static com.sophos.semillero.ui.CheckOutPages.TABLE_USER_DATA;

import com.sophos.semillero.interactions.SaveData;
import com.sophos.semillero.model.UserJPetStore;
import com.sophos.semillero.questions.CheckUserData;
import com.sophos.semillero.questions.FinishBuy;
import com.sophos.semillero.questions.OrderVerification;
import com.sophos.semillero.tasks.DarClick;
import com.sophos.semillero.tasks.SaveModels;

import org.hamcrest.core.IsEqual;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.text.SimpleDateFormat;
import java.util.Date;
public class FinishBuyRequest {
	
	String dateFormat = new SimpleDateFormat("yyyy/MM/dd").format(new Date());
	
	@Given("I want to complete my order")
	public void iWantToCompleteMyOrder() {
		theActorInTheSpotlight().wasAbleTo(DarClick.on(BTN_CHECKOUT));
	}

	@When("I confirm my data")
	public void iConfirmMyData() {
		theActorInTheSpotlight().wasAbleTo(DarClick.on(BTN_CONTINUE),
				SaveData.value("USER_DATA",TABLE_USER_DATA));
		
		String strInfo=theActorInTheSpotlight().recall("USER_DATA");
		
		theActorInTheSpotlight().wasAbleTo(SaveModels.user(strInfo,"USER_MODEL"),
				DarClick.on(BTN_CONFIRM));
	}

	@Then("I validate the invoice data")
	public void iValidateTheInvoiceData() {
		UserJPetStore usuario=theActorInTheSpotlight().recall("USER_MODEL");
		theActorInTheSpotlight().should(seeThat(FinishBuy.on(TXT_ORDER_DATE, 1),matchesRegex("^#[0-9]+")));
		//theActorInTheSpotlight().should(seeThat(FinishBuy.on(TXT_ORDER_DATE,2),IsEqual.equalTo(dateFormat)));
		theActorInTheSpotlight().should(seeThat(CheckUserData.on(TXT_BILL, usuario),IsEqual.equalTo(true)));
		theActorInTheSpotlight().should(seeThat(OrderVerification.in(TXT_BILL_ITEMS),IsEqual.equalTo(true)));
	}

}
