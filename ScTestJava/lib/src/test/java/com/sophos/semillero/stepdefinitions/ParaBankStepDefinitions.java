package com.sophos.semillero.stepdefinitions;

import org.hamcrest.core.IsEqual;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


import com.sophos.semillero.questions.TextValue;
import com.sophos.semillero.tasks.CrearCuenta;
import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.tasks.ObtenerNumeroC;
import com.sophos.semillero.ui.ParaBankHomePage;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;




public class ParaBankStepDefinitions {
	
	

	@Given("Debe  ir a la pagina de {string}")
	public void debeIrALaPaginaDe(String url) {
		theActorCalled("Santiago Espinal").wasAbleTo(Open.url(url));
	}

	@When("Ingresa las credenciales (.+) con numero de cuenta (.+)$")
	public void ingresaLasCredencialesJohnDemoConNumeroDeCuenta(String Credenciales, String Cuenta) {
		String datos[] = Credenciales.split("-");
		theActorCalled("Santiago Espinal").wasAbleTo(Login.in(datos[0],datos[1]),
				CrearCuenta.in(Cuenta));
		
	}

	@Then("valida que el numero de cuenta")
	public void validaQueElNumeroDeCuentaEsteEnElResumenDeCuenta() {
		theActorCalled("Santiago Espinal").wasAbleTo(ObtenerNumeroC.in(ParaBankHomePage.NC_NEW));
		theActorInTheSpotlight().should(seeThat(TextValue.in(ParaBankHomePage.NC_TABLA.of(TextValue.NumeroCuenta)),IsEqual.equalTo(TextValue.NumeroCuenta)));
	    
	}
	
	

	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
