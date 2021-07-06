package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.sophos.semillero.ui.LoginPage.BTN_REGISTER;
import static com.sophos.semillero.ui.RegisterNewUser.TABLE_USER_INFORMATION;
import static com.sophos.semillero.ui.RegisterNewUser.TABLE_ACCOUNT_INFORMATION;
import static com.sophos.semillero.ui.RegisterNewUser.MENU_FAVOURITE_CATEGORY;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophos.semillero.tasks.DarClick;
import com.sophos.semillero.tasks.InsertThe;
import com.sophos.semillero.tasks.Select;

public class RegisterNewUserStepDefinitions {

	@When("I enter the user credentials (.+) account information (.+)$")
	public void iEnterTheUserCredentialsAccountInformationLocation(String strCredentials,String strInfo) {
	    theActorInTheSpotlight().wasAbleTo(DarClick.on(BTN_REGISTER),
	    		InsertThe.data(strCredentials, TABLE_USER_INFORMATION),
	    		InsertThe.data(strInfo, TABLE_ACCOUNT_INFORMATION));
	}

	@When("favourite category (.+)$")
	public void locationAndFavouriteCategory(String strCategory) {
		theActorInTheSpotlight().wasAbleTo(Select.the(strCategory, MENU_FAVOURITE_CATEGORY));
	}

	@Then("I should see the whole user information")
	public void iShouldSeeTheWholeUserInformation() {
	    
	}
}
