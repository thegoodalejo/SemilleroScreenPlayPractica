package com.grupo3.stepdefs;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.grupo3.model.Usuario;
import com.grupo3.tasks.RegistrarUsuario;
import com.grupo3.util.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

public class RegistrarStepDefinitions
{
	@Given("Quiero ir a la pagina {string}")
	public void quieroIrALaPagina(String stUrl)
	{
		System.out.println("@GIVEN");
		theActorCalled(Constants.ACTOR).wasAbleTo(Open.url(stUrl));
	}

	@When("Ingresar info usuario {string} contrasena {string} nombre {string} apellido {string} correo {string} telefono {string} direccion1 {string} direccion2 {string} ciudad {string} estado {string} zip {string} pais {string}")
	public void ingresarInfoUsuarioContrasenaNombreApellidoCorreoTelefonoDireccion1Direccion2CiudadEstadoZipPais(String strUser, String strPassword, String strFirstName, String strLastName, String strEmail, String strPhone, String strAddress1, String strAddress2, String strCity, String strState, String strZip, String strCountry)
	{
		System.out.println("@WHEN");
		Usuario usuario = new Usuario(strUser, strPassword, strFirstName, strLastName, strEmail, strPhone, strAddress1, strAddress2, strCity, strState, strZip, strCountry);
		theActorInTheSpotlight().wasAbleTo(RegistrarUsuario.withData(usuario));
	}

	@Then("debe registrar el usuario")
	public void debeRegistrarElUsuario()
	{
		System.out.println("@THEN");
	}
}