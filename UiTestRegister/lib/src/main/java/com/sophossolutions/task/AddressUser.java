package com.sophossolutions.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Map;

import static com.sophossolutions.ui.UserAddressPage.EDIT_TEXT_CITY;
import static com.sophossolutions.ui.UserAddressPage.EDIT_TEXT_ZIP_CODE;
import static com.sophossolutions.ui.UserAddressPage.BTN_NEXT;
import static com.sophossolutions.ui.UserAddressPage.OPTION_CITY;

import io.cucumber.datatable.DataTable;

public class AddressUser implements Task{

	private Map<String, String> dataUserAddress;
	
	public AddressUser(DataTable dataUserAddress) {
		super();
		this.dataUserAddress =  dataUserAddress.asMap(String.class, String.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(
			Enter.theValue(dataUserAddress.get(dataUserAddress.keySet().toArray()[0])).into(EDIT_TEXT_CITY),
			Click.on(OPTION_CITY),
			Enter.theValue(dataUserAddress.get(dataUserAddress.keySet().toArray()[1])).into(EDIT_TEXT_ZIP_CODE),
			Click.on(BTN_NEXT)
				);
		
	}
	
	public static AddressUser write (DataTable dataUserAddress) {
		return instrumented(AddressUser.class, dataUserAddress);
	}

}
