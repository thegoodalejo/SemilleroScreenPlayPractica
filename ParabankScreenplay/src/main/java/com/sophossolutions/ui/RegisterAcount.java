package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterAcount
{
	public static final Target LINK_OPEN_ACOUNT = Target.the("Link de abrir nueva cuenta").located(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a"));
	public static final Target TYPE_ACOUNT_OPTIONS = Target.the("Tipo de cuenta").located(By.xpath("//*[@id=\"type\"]"));
	public static final Target NUMBER_ACOUNT_OPTIONS = Target.the("Numero de cuenta").located(By.xpath("//*[@id=\"fromAccountId\"]"));
	public static final Target BTN_NEW_ACOUNT = Target.the("Campo de usuario").located(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input"));
	
	public static final Target LINK = Target.the("Link para ver las cuentas creadas").located(By.xpath("//a[@href='/parabank/overview.htm']"));
	public static final Target NC_NEW = Target.the("Numero generado de la nueva cuenta").located(By.xpath("//a[@id='newAccountId']"));
	public static final Target NC_TABLA = Target.the("Numero de cuenta en la tabla").locatedBy("//a[text()='{0}']");
	public static final Target NC_BALANCE = Target.the("el balance de cuenta en la tabla").locatedBy("//a[text()='{0}']");
}