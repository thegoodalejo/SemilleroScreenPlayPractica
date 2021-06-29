package com.sophos.semillero.ui;




import net.serenitybdd.core.annotations.findby.By;

import net.serenitybdd.screenplay.targets.Target;

public class ParaBankHomePage {
	

	public static final Target ENLA_NEW_ACCOUNT = Target.the("link para crear una cuenta").locatedBy("//a[@href='/parabank/openaccount.htm']");
	public static final Target LISTA_TC = Target.the("Lista para tipo de cuenta ").located(By.xpath("//select[@id='type']"));
	public static final Target LISTA_NC = Target.the("Lista para numero de cuenta").located(By.xpath("//select[@id='fromAccountId']"));
	public static final Target BTN_ONA = Target.the("Boton para crear cuenta").located(By.xpath("//input[@value='Open New Account']"));
	public static final Target ENLA_AO = Target.the("Link para ver las cuentas creadas").located(By.xpath("//a[@href='/parabank/overview.htm']"));
	public static final Target NC_NEW = Target.the("Numero generado de la nueva cuenta").located(By.xpath("//a[@id='newAccountId']"));
	public static final Target NC_TABLA = Target.the("Numero de cuenta en la tabla").locatedBy("//a[text()='{0}']");
	public static final Target NC_BALANCE = Target.the("el balance de cuenta en la tabla").locatedBy("//a[text()='{0}']");
}
