package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import ui.CrearCuenta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class CreateAccount implements Task {

	private String strTipo;
	private String strCuenta;

	public CreateAccount(String Tipo, String Cuenta) {
		this.strTipo = Tipo;
		this.strCuenta = Cuenta;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CrearCuenta.CREAR_CUENTA_NUEVA),
				SelectFromOptions.byVisibleText(strTipo).from(CrearCuenta.LISTA_TIPOS),
				SelectFromOptions.byVisibleText(strCuenta).from(CrearCuenta.LISTA_CUENTAS),
				Click.on(CrearCuenta.BTN_CREAR),
				Click.on(CrearCuenta.VISTA_CUENTAS));
	}

	public static CreateAccount With(String strTipo, String strCuenta) {
		return instrumented(CreateAccount.class, strTipo, strCuenta);
	}

}
