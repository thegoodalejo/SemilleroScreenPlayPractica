package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.sophossolutions.tasks.GoToPage;
import com.sophossolutions.tasks.Login;
import com.sophossolutions.ui.HomePage;
import com.sophossolutions.ui.ParabankLogin;
import com.sophossolutions.ui.ResultAnimalsPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddAnimalToCarStepDefinition
{	
	@Before
	public void settup()
	{
		setTheStage(new OnlineCast());
	}
	
	@Given("Debe ir a los catalogos de animales")
	public void debeIrALosCatalogosDeAnimales() {
		//theActorCalled("Santiago Juan").wasAbleTo(GoToPage.animal(HomePage.LINK_ANIMAL,HomePage.LINKS_ANIMALS));
	}

	@When("Debe seleccionar un animal aleatoriamente")
	public void debeSeleccionarUnAnimalAleatoriamente() {
		theActorCalled("Santiago Juan").wasAbleTo(GoToPage.animal(ResultAnimalsPage.LINK_ANIMAL,ResultAnimalsPage.LINKS_ANIMALS),
				GoToPage.animal(ResultAnimalsPage.LINK_ANIMAL_PORTAL,ResultAnimalsPage.LINKS_ANIMALS_PORTAL));
		
	}

	@Then("Observar el animal seleccionado en el carrito")
	public void observarElAnimalSeleccionadoEnElCarrito() {
	   System.out.println("Then");
	}
//	
//	@Given("Quiero ir a la pagina {string}")
//	public void quieroIrALaPagina(String strUrl)
//	{
//		System.out.println("@GIVEN");
//		theActorCalled("Santiago Juan").wasAbleTo(Open.url(strUrl));
//	}
//
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