package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.hamcrest.core.IsEqual;

import static com.sophossolutions.constants.Constants.ADD;
import static com.sophossolutions.ui.CalculatorHomePage.EDIT_TEXT_ANSWER;
import static com.sophossolutions.ui.CalculatorHomePage.EDIT_TEXT_NUMBER1;
import static com.sophossolutions.ui.CalculatorHomePage.EDIT_TEXT_NUMBER2;

import com.sophossolutions.questions.ResultText;
import com.sophossolutions.tasks.PerformOperation;


public class BasicCalculatorSumStepDefinitions {
	
	private String strResult;
	
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@When("Add the numbers (.+) (.+)$")
	public void addTheNumbers(Integer intNum1, Integer intNum2) {
	    theActorInTheSpotlight().wasAbleTo(
	    		Enter.theValue(intNum1.toString()).into(EDIT_TEXT_NUMBER1),
				Enter.theValue(intNum2.toString()).into(EDIT_TEXT_NUMBER2),
	    		PerformOperation.with(ADD, intNum1, intNum2)
	    	);
	    strResult = theActorInTheSpotlight().recall(ADD);
	}

	@Then("Verify the value of the sum two numbers in the modes of calculator")
	public void verifyTheValueOfTheSumTwoNumbersInTheModesOfCalculator() {
		theActorInTheSpotlight().should(seeThat(ResultText.of(EDIT_TEXT_ANSWER), IsEqual.equalTo(strResult)));
	}

}
