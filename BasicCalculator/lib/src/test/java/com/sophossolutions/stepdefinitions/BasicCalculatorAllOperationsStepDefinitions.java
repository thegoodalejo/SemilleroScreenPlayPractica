package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import java.util.Map;


import static com.sophossolutions.ui.CalculatorHomePage.BTN_CALCULATE;
import static com.sophossolutions.ui.CalculatorHomePage.EDIT_TEXT_ANSWER;
import static com.sophossolutions.ui.CalculatorHomePage.EDIT_TEXT_NUMBER1;
import static com.sophossolutions.ui.CalculatorHomePage.EDIT_TEXT_NUMBER2;
import static com.sophossolutions.ui.CalculatorHomePage.SELECT_MODE;
import static com.sophossolutions.constants.Constants.ACTOR_NAME;
import static com.sophossolutions.constants.Constants.ADD;
import static com.sophossolutions.constants.Constants.SUBSTRACTION;
import static com.sophossolutions.constants.Constants.MULTIPLICATION;
import static com.sophossolutions.constants.Constants.DIVIDE;
import static com.sophossolutions.constants.Constants.CONCAT;

import com.sophossolutions.tasks.PerformOperation;
import com.sophossolutions.ui.CalculatorHomePage;
import static com.sophossolutions.util.UtilsCalculator.verifyDataObtainedWith;


public class BasicCalculatorAllOperationsStepDefinitions {
	
	CalculatorHomePage HomePage;
	private Map<String, Object> dataActor;
	private Integer intRange = 20;
	
	
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("I want to go to page")
	public void iWantToGoToPage() {
	    theActorCalled(ACTOR_NAME).wasAbleTo(Open.browserOn(HomePage));
	}
	
	@Given("I want to verify that i am on the home page")
	public void iWantToVerifyThatIAmOnTheHomePage() {
		theActorCalled(ACTOR_NAME).should(seeThat(the(EDIT_TEXT_NUMBER1), isVisible()));
		theActorCalled(ACTOR_NAME).should(seeThat(the(EDIT_TEXT_NUMBER2), isVisible()));
		theActorCalled(ACTOR_NAME).should(seeThat(the(EDIT_TEXT_ANSWER), isVisible()));
	    theActorCalled(ACTOR_NAME).should(seeThat(the(BTN_CALCULATE), isVisible()));
	}
	
	@When("I select type of operation (.+) operate two numbers$")
	public void iSelectTypeOfOperationOperateTwoNumbers(String strIndexBuild) {
		Integer intNum1 =  (int) (1 + Math.random()*intRange);
		Integer intNum2 =  (int) (1 + Math.random()*intRange);
		theActorInTheSpotlight().wasAbleTo(
				SelectFromOptions.byValue(strIndexBuild).from(SELECT_MODE),
				Enter.theValue(intNum1.toString()).into(EDIT_TEXT_NUMBER1),
				Enter.theValue(intNum2.toString()).into(EDIT_TEXT_NUMBER2),
				PerformOperation.with(ADD, intNum1, intNum2),
				PerformOperation.with(SUBSTRACTION, intNum1, intNum2),
				PerformOperation.with(MULTIPLICATION, intNum1, intNum2),
				PerformOperation.with(DIVIDE, intNum1, intNum2),
				PerformOperation.with(CONCAT, intNum1, intNum2)
				);
		
	}

	@Then("I verify the operation result")
	public void iVerifyTheOperationResult() {
		verifyDataObtainedWith(theActorInTheSpotlight(), ADD);
		verifyDataObtainedWith(theActorInTheSpotlight(), SUBSTRACTION);
		verifyDataObtainedWith(theActorInTheSpotlight(), MULTIPLICATION);
		verifyDataObtainedWith(theActorInTheSpotlight(), DIVIDE);
		verifyDataObtainedWith(theActorInTheSpotlight(), CONCAT);
	}
}
