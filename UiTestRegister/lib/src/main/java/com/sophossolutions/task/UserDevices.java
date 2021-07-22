package com.sophossolutions.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Map;

import static com.sophossolutions.ui.UserDevicesPage.*;

import io.cucumber.datatable.DataTable;

public class UserDevices implements Task {
	
	private Map<String, String> dataUserDevices;
	
	public UserDevices(DataTable dataUserDevices) {
		super();
		this.dataUserDevices = dataUserDevices.asMap(String.class, String.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.wasAbleTo(
				SelectOptionSearchType.on(ACTIVATE_EDIT_TEXT_OS, EDIT_TEXT_OS, dataUserDevices.get(dataUserDevices.keySet().toArray()[0])),
				SelectOptionSearchType.on(ACTIVATE_EDIT_TEXT_VERSION, EDIT_TEXT_VERSION, dataUserDevices.get(dataUserDevices.keySet().toArray()[1])),
				SelectOptionSearchType.on(ACTIVATE_EDIT_TEXT_LANGUAGE, EDIT_TEXT_LANGUAGE, dataUserDevices.get(dataUserDevices.keySet().toArray()[2])),
				SelectOptionSearchType.on(ACTIVATE_EDIT_TEXT_BRAND, EDIT_TEXT_BRAND, dataUserDevices.get(dataUserDevices.keySet().toArray()[3])),
				SelectOptionSearchType.on(ACTIVATE_EDIT_TEXT_MODEL, EDIT_TEXT_MODEL, dataUserDevices.get(dataUserDevices.keySet().toArray()[4])),
				SelectOptionSearchType.on(ACTIVATE_EDIT_TEXT_MODEL_VERSION, EDIT_TEXT_MODEL_VERSION, dataUserDevices.get(dataUserDevices.keySet().toArray()[5])),
				Click.on(BTN_NEXT_PAGE)
				);
	}

	public static UserDevices write(DataTable dataUserDevices) {
		return instrumented(UserDevices.class, dataUserDevices);
	}

}
