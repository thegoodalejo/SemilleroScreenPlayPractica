package com.sophossolutions.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

	public static final Target TXT_USER = Target.the("Campo de usuario").located(By.name("username"));
	public static final Target TXT_PASSWORD = Target.the("Campo de la contraseña").located(By.name("password"));
	public static final Target TXT_REPEAT_PASSWORD = Target.the("campo de confirmacion de contraseña").located(By.name("repeatedPassword"));
	public static final Target TXT_USER_NAME = Target.the("Campo del nombre del usuario").located(By.name("account.firstName"));
	public static final Target TXT_USER_LASTNAME = Target.the("Campo del apellido del usuario").located(By.name("account.lastName"));
	public static final Target TXT_EMAIL = Target.the("Campo del email del usuario").located(By.name("account.email"));
	public static final Target TXT_ADDRESS1 = Target.the("Campo de la direccion 1 del usuario").located(By.name("account.address1"));
	public static final Target TXT_ADDRESS2 = Target.the("Campo de la direccion 2 del usuario").located(By.name("account.address2"));
	public static final Target TXT_CITY = Target.the("Campo de la ciudad del usuario").located(By.name("account.city"));
	public static final Target TXT_STATE = Target.the("Campo deL estado del usuario").located(By.name("account.state"));
	public static final Target TXT_ZIP = Target.the("Campo del codigo postal del usuario").located(By.name("account.zip"));
	public static final Target TXT_COUNTRY = Target.the("Campo del pais del usuario").located(By.name("account.country"));
	public static final Target TXT_FAVORITE_CATEGORY = Target.the("Lista de preferencia de animales").located(By.name("account.favouriteCategoryId"));
	public static final Target TXT_PHONE = Target.the("Campo del telefono del usuario").located(By.name("account.phone"));
}
