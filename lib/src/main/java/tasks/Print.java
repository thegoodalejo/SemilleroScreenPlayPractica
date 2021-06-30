package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Print implements Task {

	private Target CuentaCreada;

	public Print(Target Cuenta) {
		this.CuentaCreada = Cuenta;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println(CuentaCreada.resolveFor(actor).getTextValue());
	}

	public static Print that(Target Cuenta) {
		return instrumented(Print.class, Cuenta);
	}

}
