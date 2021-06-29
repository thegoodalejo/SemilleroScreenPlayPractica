package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ParabankLogin
{
	public static final Target TXT_USER = Target.the("Campo de usuario").located(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input"));
	public static final Target TXT_PASSWORD = Target.the("Campo de usuario").located(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input"));
	public static final Target BTN_LOGIN = Target.the("Campo de usuario").located(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
}