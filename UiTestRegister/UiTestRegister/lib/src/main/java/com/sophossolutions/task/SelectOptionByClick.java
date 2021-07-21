package com.sophossolutions.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectOptionByClick implements Task {
	
	private final String strOption = "//*[contains(text(),'{0}')]";
	private Target targetSelect;
	private String strValue;
	
	
	public SelectOptionByClick(Target targetSelect, String strValue) {
		this.strValue = strValue;
		this.targetSelect = targetSelect;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(
				Click.on(targetSelect),
				Click.on(Target.the("Option Selected").locatedBy(targetSelect.getCssOrXPathSelector() + strOption).of(strValue) )
		);
		
	}
	
	public static SelectOptionByClick on(Target targetSelect, String strValue) {
		return instrumented(SelectOptionByClick.class, targetSelect, strValue);
	}


}
