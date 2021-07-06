package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import com.sophossolutions.models.RegisterModel;
import static com.sophossolutions.ui.StoreRegister.TXT_USERNAME;
import static com.sophossolutions.ui.StoreRegister.TXT_PASSWORD;
import static com.sophossolutions.ui.StoreRegister.TXT_REPEATPASSWORD;
import static com.sophossolutions.ui.StoreRegister.TXT_FIRSTNAME;
import static com.sophossolutions.ui.StoreRegister.TXT_LASTNAME;
import static com.sophossolutions.ui.StoreRegister.TXT_EMAIL;
import static com.sophossolutions.ui.StoreRegister.TXT_PHONE;
import static com.sophossolutions.ui.StoreRegister.TXT_ADDRESS1;
import static com.sophossolutions.ui.StoreRegister.TXT_ADDRESS2;
import static com.sophossolutions.ui.StoreRegister.TXT_CITY;
import static com.sophossolutions.ui.StoreRegister.TXT_STATE;
import static com.sophossolutions.ui.StoreRegister.TXT_ZIP;
import static com.sophossolutions.ui.StoreRegister.TXT_COUNTRY;
import static com.sophossolutions.ui.StoreRegister.SELECT_LANGUAGEPREFERENCE;
import static com.sophossolutions.ui.StoreRegister.SELECT_FAVOURITECATEGORY;
import static com.sophossolutions.ui.StoreRegister.BOOL_ENABLEMYLIST;
import static com.sophossolutions.ui.StoreRegister.BOOL_ENABLEMYBANNER;
import com.sophossolutions.interactions.ClickButton;

public class StoreRegister implements Task {

	RegisterModel newUser;
	
	public StoreRegister(RegisterModel newUser) {
		super();
		this.newUser = newUser;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Enter.theValue(newUser.getStrUserName()).into(TXT_USERNAME),
				Enter.theValue(newUser.getStrPassword()).into(TXT_PASSWORD),
				Enter.theValue(newUser.getStrPassword()).into(TXT_REPEATPASSWORD),
				Enter.theValue(newUser.getStrFirstName()).into(TXT_FIRSTNAME),
				Enter.theValue(newUser.getStrLastName()).into(TXT_LASTNAME),
				Enter.theValue(newUser.getStrEmail()).into(TXT_EMAIL),
				Enter.theValue(newUser.getStrPhone()).into(TXT_PHONE),
				Enter.theValue(newUser.getStrAddress1()).into(TXT_ADDRESS1),
				Enter.theValue(newUser.getStrAddress2()).into(TXT_ADDRESS2),
				Enter.theValue(newUser.getStrCity()).into(TXT_CITY),
				Enter.theValue(newUser.getStrState()).into(TXT_STATE),
				Enter.theValue(newUser.getStrZip()).into(TXT_ZIP),
				Enter.theValue(newUser.getStrCountry()).into(TXT_COUNTRY),
				SelectFromOptions.byValue(newUser.getStrLanguage()).from(SELECT_LANGUAGEPREFERENCE),
				SelectFromOptions.byValue(newUser.getStrFavouriteCategory()).from(SELECT_FAVOURITECATEGORY),
				ClickButton.whenState(BOOL_ENABLEMYBANNER, newUser.isEnableMyBanner()),
				ClickButton.whenState(BOOL_ENABLEMYLIST, newUser.isEnableMyList()));
	}
	
	public static StoreRegister withData(RegisterModel newUser) {
		return Tasks.instrumented(StoreRegister.class, newUser);
	}

}
