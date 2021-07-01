package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
	public static final Target BTN_CREATE_ACCOUNT = Target.the("Para crear el usuario ").locatedBy("//input[@value='Open New Account']");
	public static final Target OPTION_NUMBER = Target.the("Opcion que contiene el numero de prueba").locatedBy("//select[@id='fromAccountId']//option[{0}]");
	public static final Target SELECT_TYPE = Target.the("Select que contiene CHECKING y SAVINGS").locatedBy("//select[.//option[contains(text(),'CHECKING')]]");
	public static final Target SELECT_NUMBER = Target.the("Select que contiene Numero").locatedBy("//select[@id='fromAccountId']");
	public static final Target TXT_LINK_CREATE_USER = Target.the("Hipervinculo para crear un usuario").locatedBy("//a[contains(text(),'Open New Account')]");
	public static final Target TXT_NUM_CREATED = Target.the("Texto de creado por el sistema ").locatedBy("//div[@class='ng-scope']//a");
	public static final Target TXT_SHOW_ACCOUNTS = Target.the("Hipervinculo Ver cuentas").locatedBy("//a[contains(text(), 'Accounts Overview')]");
	public static final Target TXT_TITLE_PAGE = Target.the("Titulo de la pagina de Home").locatedBy("//b[contains(text(), 'Welcome')]");
}
