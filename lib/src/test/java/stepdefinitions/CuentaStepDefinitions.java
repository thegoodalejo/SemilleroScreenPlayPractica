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
import ui.Resultado;

public class CuentaStepDefinitions {
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
	}

	@Then("Muestro la cuenta y el dinero en ella")
	public void muestroLaCuentaYElDineroEnElla() {
		theActorInTheSpotlight().should(seeThat(Result.in(Resultado.CUENTASCREADAS), IsEqual.equalTo("13344")));
	}

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

}
