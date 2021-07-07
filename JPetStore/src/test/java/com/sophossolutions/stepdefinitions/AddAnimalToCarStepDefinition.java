package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.tasks.GetInfo;
import com.sophossolutions.tasks.GoToPage;
import com.sophossolutions.ui.AnimalPage;
import com.sophossolutions.ui.HomePage;
import com.sophossolutions.ui.ResultTypeAnimalsPage;
import com.sophossolutions.util.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
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
		theActorCalled(strActorName).wasAbleTo(GoToPage.type(HomePage.LINK_ANIMAL,HomePage.LINKS_ANIMALS));
		theActorInTheSpotlight().wasAbleTo(GoToPage.animals(ResultTypeAnimalsPage.LINK_ANIMAL,ResultTypeAnimalsPage.LINKS_ANIMALS));
		
	}

	@When("Debe seleccionar un animal aleatoriamente")
	public void debeSeleccionarUnAnimalAleatoriamente() {
		theActorInTheSpotlight().wasAbleTo(GoToPage.selectOne(AnimalPage.LINK_ANIMAL, ResultTypeAnimalsPage.LINKS_ANIMALS));
		String auxIndex = theActorInTheSpotlight().recall(Constants.DIR_INDEX_ANIMAL).toString();
		theActorInTheSpotlight().wasAbleTo(GetInfo.animal());
		theActorInTheSpotlight().wasAbleTo(Click.on(AnimalPage.BTN_ANIMAL.of(auxIndex)));
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