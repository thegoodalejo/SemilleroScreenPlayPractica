package questions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.targets.Target;
import ui.CrearCuenta;
import ui.Resultado;

public class Result implements Question<String>{
	private Target Cuenta;
	private Target CuentasCreadas;
	private String StrCuenta;
	
	public Result(Target acc) {
		this.CuentasCreadas = acc;
	}
	@Override
	public String answeredBy(Actor actor) {		
		return CuentasCreadas.resolveFor(actor).getTextValue();
	}
	
	public static Result  in(Target text) {
		return new Result(text);
	}
	
	
	public String respuesta(Actor actor) {
		return CuentasCreadas.resolveFor(actor).getTextValue();
	}
	
}