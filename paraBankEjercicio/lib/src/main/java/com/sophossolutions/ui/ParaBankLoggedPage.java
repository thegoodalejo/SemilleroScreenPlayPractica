package com.sophossolutions.ui;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class ParaBankLoggedPage {
	public static final Target TXT_LINK_CREATE_USER = Target.the("Hipervinculo para crear un usuario").locatedBy("//a[contains(text(),'Open New Account')]");
	public static final Target SELECT_CHECKING = Target.the("Select que contiene CHECKING").locatedBy("//select[.//option[contains(text(),'CHECKING')]]");
	public static final Target SELECT_NUMBER = Target.the("Select que contiene Numero").locatedBy("//select[@id='fromAccountId']");
	public static final Target BTN_CREATE_ACCOUNT = Target.the("Para crear el usuario ").located(By.xpath("//input[@value='Open New Account']"));
	public static final Target TXT_NUM_CREATED = Target.the("Texto de creado por el sistema ").located(By.xpath("//div[@class='ng-scope']//a"));
	
	public static final Target OPTION_CHECKING = Target.the("Opcion CHECKING").locatedBy(".//option[contains(text(),'CHECKING')]");
	public static final Target OPTION_NUMBER = Target.the("Opcion que contiene el numero de prueba").located(By.xpath("//option[contains(text(), '{0}')]"));
	
	
}
