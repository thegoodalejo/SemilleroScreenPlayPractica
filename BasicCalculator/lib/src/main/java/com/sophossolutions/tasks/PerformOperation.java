package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.sophossolutions.util.UtilsCalculator.getData;
import static com.sophossolutions.ui.CalculatorHomePage.EDIT_TEXT_ANSWER;
import static com.sophossolutions.ui.CalculatorHomePage.SELECT_OPERATION;
import static com.sophossolutions.ui.CalculatorHomePage.BTN_CALCULATE;
import static com.sophossolutions.constants.Constants.ID_ANSWER;
import static com.sophossolutions.constants.Constants.ID_DATA;
import static com.sophossolutions.constants.Constants.TIMEOUT_ANSWER;

public class PerformOperation implements Task {
	
	private String strIndexOperation;
	private Integer intNumber1;
	private Integer intNumber2;
	
	public PerformOperation(String strIndexOperation,Integer intNumber1, Integer intNumber2) {
		super();
		this.strIndexOperation = strIndexOperation;
		this.intNumber1 = intNumber1;
		this.intNumber2 = intNumber2;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(
				SelectFromOptions.byValue(strIndexOperation).from(SELECT_OPERATION),
				Click.on(BTN_CALCULATE)
				);
		WaitUntil.the(EDIT_TEXT_ANSWER, isVisible()).forNoMoreThan(TIMEOUT_ANSWER).seconds();
		actor.remember(ID_DATA + strIndexOperation, getData(strIndexOperation, intNumber1, intNumber2));
		actor.remember(ID_ANSWER + strIndexOperation, EDIT_TEXT_ANSWER.resolveFor(actor).getTextValue());
	}

	public static PerformOperation with(String strIdexOpt, Integer intNumber1, Integer intNumber2) {
		// TODO Auto-generated method stub
		return instrumented(PerformOperation.class, strIdexOpt,intNumber1, intNumber2);
	}

}
