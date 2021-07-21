package com.sophossolutions.task;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.sophossolutions.ui.UserNamePage.EDIT_TEXT_FIRST_NAME;
import static com.sophossolutions.ui.UserNamePage.EDIT_TEXT_LAST_NAME;
import static com.sophossolutions.ui.UserNamePage.EDIT_TEXT_EMAIL;
import static com.sophossolutions.ui.UserNamePage.EDIT_TEXT_SEARCH_LANGUAGE;
import static com.sophossolutions.ui.UserNamePage.SELECT_BIRTH_MONTH;
import static com.sophossolutions.ui.UserNamePage.SELECT_BIRTH_DAY;
import static com.sophossolutions.ui.UserNamePage.SELECT_BIRTH_YEAR;
import static com.sophossolutions.ui.UserNamePage.SELECT_LANGUAGE;
import static com.sophossolutions.ui.UserNamePage.BTN_NEXT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Map;

public class BasicUserData implements Task {
	
	private Map<String, String> dataUser;
	private String[] strDateBirthDay; 
		
	public BasicUserData(DataTable dataTableUser) {
		this.dataUser =  dataTableUser.asMap(String.class, String.class);
		this.strDateBirthDay = dataUser.get( dataUser.keySet().toArray()[3]).split("/");
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(
				Enter.theValue(dataUser.get( dataUser.keySet().toArray()[0])).into(EDIT_TEXT_FIRST_NAME), 
				Enter.theValue(dataUser.get( dataUser.keySet().toArray()[1])).into(EDIT_TEXT_LAST_NAME),
				Enter.theValue(dataUser.get( dataUser.keySet().toArray()[2])).into(EDIT_TEXT_EMAIL),
				SelectOptionByClick.on(SELECT_BIRTH_MONTH, strDateBirthDay[0]),
				SelectOptionByClick.on(SELECT_BIRTH_DAY, strDateBirthDay[1]),
				SelectOptionByClick.on(SELECT_BIRTH_YEAR, strDateBirthDay[2]),
				Enter.theValue(dataUser.get( dataUser.keySet().toArray()[4])).into(EDIT_TEXT_SEARCH_LANGUAGE),
				Click.on(SELECT_LANGUAGE),
				Click.on(BTN_NEXT)
		);
		
	}

	public static BasicUserData write(DataTable dataTableUser) {
		return instrumented(BasicUserData.class, dataTableUser);
	}

}
