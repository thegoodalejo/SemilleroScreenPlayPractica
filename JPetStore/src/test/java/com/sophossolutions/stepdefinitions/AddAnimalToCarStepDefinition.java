package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.sophossolutions.tasks.Gotopage;
import com.sophossolutions.tasks.prueba;
import com.sophossolutions.ui.HomePage;
import com.sophossolutions.ui.ResultAnimalsPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddAnimalToCarStepDefinition
{	
	@Before
	public void settup()
	{
		setTheStage(new OnlineCast());
	}
	private String strActorName = "Juan Miguel y Santaigo ";
	
	@Given("Debe ir a los catalogos de animales")
	public void debeIrALosCatalogosDeAnimales() {
		theActorCalled(strActorName).wasAbleTo(Gotopage.animal(HomePage.LINK_ANIMAL,HomePage.LINKS_ANIMALS));
	}

	@When("Debe seleccionar un animal aleatoriamente")
	public void debeSeleccionarUnAnimalAleatoriamente() {
		theActorCalled(strActorName).wasAbleTo(Gotopage.animal(ResultAnimalsPage.LINK_ANIMAL,ResultAnimalsPage.LINKS_ANIMALS));
		
	}

	@Then("Observar el animal seleccionado en el carrito")
	public void observarElAnimalSeleccionadoEnElCarrito() {
	   System.out.println("Then");
	}
	
	

//	@When("Ingrese con el usuario {string} y contrasena {string}")
//	public void ingreseConElUsuarioYContrasena(String strUser, String strPassword)
//	{
//		System.out.println("@WHEN");
//		theActorCalled("Santiago Juan").wasAbleTo(LoginTask.withCredential(strUser, strPassword));
//	}
//
//	@Then("Ir a la pagina de inicio")
//	public void irALaPaginaDeInicio()
//	{
//		System.out.println("@THEN");
//		theActorCalled("Santiago Juan").should(seeThat(the(ParabankLogin.VISIBLE_TABLE), isVisible()));
//	}
	
}