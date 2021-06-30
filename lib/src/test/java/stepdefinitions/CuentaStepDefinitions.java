package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Result;
import tasks.CreateAccount;
import tasks.Login;
import tasks.Print;
import ui.Resultado;

public class CuentaStepDefinitions {
	public String strNoCuenta;
	@Given("Deseo ir a la pagina {string}")
	public void deseoIrALaPagina(String string) {
		theActorCalled("Duvan").wasAbleTo(Open.url(string));
	}

	@When("Ingreso el usuario (.+) y la contrasena (.+)$")
	public void ingresoElUsuarioYLaContraseA(String string, String string2) {
		theActorCalled("Duvan").wasAbleTo(Login.WithCredentials(string,string2));
	}

	@When("y abrir una cuenta tipo (.+) a la cuenta (.+)$")
	public void yAbrirUnaCuentaTipoALaCuenta(String strTipo, String strCuenta) {		
		theActorInTheSpotlight().wasAbleTo(CreateAccount.With(strTipo,strCuenta));
		strNoCuenta = strCuenta;
	}

	@Then("Muestro la cuenta y el saldo en ella")
	public void muestroLaCuentaYElSaldoEnElla() {
		theActorInTheSpotlight().should(seeThat(Result.in(Resultado.CUENTAS_CREADA.of(strNoCuenta)), IsEqual.equalTo(strNoCuenta)));
		theActorInTheSpotlight().wasAbleTo(Print.that(Resultado.SALDO_CUENTA.of(strNoCuenta)));		
	}

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
