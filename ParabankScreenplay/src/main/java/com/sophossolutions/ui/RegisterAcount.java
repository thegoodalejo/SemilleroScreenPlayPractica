package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterAcount
{
	public static final Target LINK_OPEN_ACOUNT = Target.the("Link de abrir nueva cuenta").located(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a"));
	public static final Target TYPE_ACOUNT_OPTIONS = Target.the("Tipo de cuenta").located(By.xpath("//*[@id=\"type\"]"));
	public static final Target NUMBER_ACOUNT_OPTIONS = Target.the("Numero de cuenta").located(By.xpath("//*[@id=\"fromAccountId\"]"));
	public static final Target BTN_NEW_ACOUNT = Target.the("Campo de usuario").located(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input"));
	
	public static final Target LINK_ACOUNT_LIST = Target.the("Link para ver las cuentas").located(By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a"));
	public static final Target TXT_NEW_ACOUNT = Target.the("Numero de la nueva cuenta").located(By.xpath("//*[@id=\"newAccountId\"]"));
	public static final Target TXT_ACOUNT_NUMBER = Target.the("Numero de cuenta creada").locatedBy("//*[@id=\"accountTable\"]/tbody/tr[{0}]/td[1]/a");
	public static final Target NC_BALANCE = Target.the("El saldo de la cuenta").locatedBy("//*[@id=\"accountTable\"]/tbody/tr[{0}]/td[2]");
}