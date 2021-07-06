package com.sophos.semillero.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterNewUser {
	
	public static final Target TABLE_USER_INFORMATION= Target.the("Campos para la informacion del usuario").locatedBy("//form//table[1]//tr[{0}]//input");
	public static final Target TABLE_ACCOUNT_INFORMATION=Target.the("Campos para la informacion de la cuenta").locatedBy("//form//table[2]//tr[{0}]//input");
	public static final Target MENU_FAVOURITE_CATEGORY=Target.the("Menú para seleccionar la categoria preferida").locatedBy("//select[@name='account.favouriteCategoryId']");
}
