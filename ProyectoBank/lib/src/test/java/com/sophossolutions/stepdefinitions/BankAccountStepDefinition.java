package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.ui.AccountsPage.TABLE_ACCOUNTS;
import static com.sophossolutions.ui.NewAccountPage.strNumberAccount;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.ValidateNewAccount;
import com.sophossolutions.tasks.LoginBank;
import com.sophossolutions.tasks.NewAccount;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;

public class BankAccountStepDefinition {
	
	@Given("I want to create a bank account on the site {string}")
	public void iWantToCreateABankAccountOnTheSite(String strUrl) {
		theActorCalled("Jonathan Castro").wasAbleTo(Open.url(strUrl));
	}

	@When("I assing {string}")
	public void iAssing(String strUserData) {
	    theActorCalled("Jonathan Castro").wasAbleTo(LoginBank.withCredetianl(strUserData));
	}

	@When("Define the existing bank account {string}")
	public void defineTheExistingBankAccount(String strAccountData) throws InterruptedException {
		theActorCalled("Jonathan Castro").wasAbleTo(NewAccount.withData(strAccountData));
	}

	@Then("I verify that account was created correctly")
	public void iVerifyThatAccountWasCreatedCorrectly() {
		
		theActorInTheSpotlight().should(seeThat(ValidateNewAccount.withId(TABLE_ACCOUNTS.of(strNumberAccount)), IsEqual.equalTo(strNumberAccount)));
		
		System.out.println("The account number: " + strNumberAccount + ", was created correctly" );
	}
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
