package ui;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	public static final Target TXT_USER_NAME = Target.the("Campo nombre de usuario").located(By.xpath("//input[@name='username']"));
	public static final Target TXT_PASSWORD = Target.the("campo contraseña").located(By.xpath("//input[@name='password']"));
	public static final Target BTN_LOGIN = Target.the("Boton login").located(By.xpath("//*[@value='Log In']"));
	
}
