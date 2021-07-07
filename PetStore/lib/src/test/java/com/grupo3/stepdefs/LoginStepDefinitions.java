
package com.grupo3.stepdefs;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.grupo3.questions.MainMenu;
import com.grupo3.tasks.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

public class LoginStepDefinitions {
	

	@Given("Quiero iniciar sesion")
	public void quieroIniciarSesion() {
	    theActorCalled("X").wasAbleTo(Open.url("https://petstore.octoperf.com/actions/Account.action?signonForm="));
	}

	@When("Ingreso el usuario {string} y la contrasena {string}")
	public void ingresoElUsuarioYLaContrasena(String username, String password) {
	    theActorInTheSpotlight().wasAbleTo(Login.withCredentials(username, password));
	}

	@Then("Deberia ver las opciones de usuario registrado")
	public void deberiaVerLasOpcionesDeUsuarioRegistrado() {
	    theActorInTheSpotlight().should(seeThat(MainMenu.hasLoggedInOptions()));
	}
	
}
