package com.guacha.stepdefs;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.guacha.questions.AccountTableContains;
import com.guacha.questions.NewAccount;

import com.guacha.ui.AccountCreationPage;
import com.guacha.ui.UserPage;

import static com.guacha.tasks.CreateAccount.createAnAccount;
import static com.guacha.tasks.GoHome.returnToHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountStepDefinitions {
	
	String id = "";
	
	@Given("I Have logged into my online banking account")
	public void iHaveLoggedIntoMyOnlineBankingAccount() {
		theActorCalled("John").should(seeThat(the(UserPage.TABLE_ACCOUNTS), isVisible()));
	}

	@When("I create an account")
	public void iCreateAnAccount() {
	    theActorInTheSpotlight().wasAbleTo(createAnAccount());
	    id = theActorInTheSpotlight().asksFor(NewAccount.id());
	    
	}

	@Then("I should see the newly created account in the account list")
	public void iShouldSeeTheNewlyCreatedAccountInTheAccountList() {
		theActorInTheSpotlight().wasAbleTo(returnToHomePage());
	    theActorInTheSpotlight().should(seeThat(AccountTableContains.accountWithId(id)));
	}
}
