package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.sophos.semillero.ui.LoginPage.BTN_REGISTER;
import static com.sophos.semillero.ui.RegisterNewUser.TABLE_USER_INFORMATION;
import static com.sophos.semillero.ui.RegisterNewUser.TABLE_ACCOUNT_INFORMATION;
import static com.sophos.semillero.ui.RegisterNewUser.MENU_FAVOURITE_CATEGORY;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophos.semillero.interactions.SaveModel;
import com.sophos.semillero.model.UserJPetStore;
import com.sophos.semillero.tasks.DarClick;
import com.sophos.semillero.tasks.InsertThe;
import com.sophos.semillero.tasks.Select;

public class RegisterNewUserStepDefinitions {
	

	@When("I enter the user credentials (.+) account information (.+) favourite category (.+)$")
	public void iEnterTheUserCredentialsAccountInformationLocationFavouriteCategory(String strCredentials,String strInfo,String strCategory) {
	    theActorInTheSpotlight().wasAbleTo(DarClick.on(BTN_REGISTER),
	    		InsertThe.data(strCredentials, TABLE_USER_INFORMATION),
	    		InsertThe.data(strInfo, TABLE_ACCOUNT_INFORMATION),
	    		Select.the(strCategory, MENU_FAVOURITE_CATEGORY),
	    		SaveModel.user(strCredentials, strInfo, strCategory,"USER_MODEL"));
	}

	@Then("I should see the whole user information")
	public void iShouldSeeTheWholeUserInformation() {
		UserJPetStore usuario=theActorInTheSpotlight().recall("USER_MODEL");
		System.out.println(usuario.getStrEmail());
	}
}
