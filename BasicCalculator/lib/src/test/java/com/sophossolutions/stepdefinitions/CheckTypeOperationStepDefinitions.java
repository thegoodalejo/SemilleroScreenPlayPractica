package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;
import com.sophossolutions.questions.ResultText;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static com.sophossolutions.ui.CalculatorHomePage.SELECT_MODE;
import static com.sophossolutions.ui.CalculatorHomePage.OPTIONS_SELECT_MODE;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CheckTypeOperationStepDefinitions {
	
	private String strValueSelect;
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@When("Select type of operation (.+)$")
	public void selectTypeOfOperation(String strIndexSelected) {
	    theActorInTheSpotlight().wasAbleTo(SelectFromOptions.byValue(strIndexSelected).from(SELECT_MODE));
	    strValueSelect = strIndexSelected;
	}

	@Then("I verify the respective option")
	public void iVerifyTheRespectiveOption() {
		theActorInTheSpotlight().should(seeThat(ResultText.of(OPTIONS_SELECT_MODE.of(strValueSelect)), IsEqual.equalTo(strValueSelect)));
	}
}
