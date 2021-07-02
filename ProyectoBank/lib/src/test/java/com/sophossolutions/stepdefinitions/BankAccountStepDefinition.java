package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.ui.AccountsPage.ID_ACCOUNT;
import static com.sophossolutions.ui.AccountsPage.ACCOUNT_BALANCE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.interactions.PrintMsgConsole;
import com.sophossolutions.questions.ValidateLogin;
import com.sophossolutions.questions.ValidateNewAccount;
import com.sophossolutions.tasks.NewAccount;
import com.sophossolutions.ui.AccountsPage;
import com.sophossolutions.ui.NewAccountPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class BankAccountStepDefinition {
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("I want to create a new account")
	public void iWantToCreateANewAccount() {
		theActorCalled("john").should(seeThat(ValidateLogin.textWelcome(AccountsPage.TXT_WELCOME), IsEqual.equalTo(true)));
	}
	
	@When("Define the existing bank account {string}")
	public void defineTheExistingBankAccount(String strAccountData) {
		theActorInTheSpotlight().wasAbleTo(NewAccount.withData(strAccountData));
	}

	@Then("I verify that account was created correctly")
	public void iVerifyThatAccountWasCreatedCorrectly() {
		
		String strAccountNumber = theActorInTheSpotlight().recall("ACCOUNT_NUMBER");
		
		theActorInTheSpotlight().should(seeThat(ValidateNewAccount.withId(ID_ACCOUNT.of(strAccountNumber)),
				IsEqual.equalTo(strAccountNumber)));
		
		theActorInTheSpotlight().wasAbleTo(PrintMsgConsole.of("The account number: " + strAccountNumber  + ", was created correctly and has a balance " + theActorInTheSpotlight().recall("ACCOUNT_BALANCE")));
	}

}
