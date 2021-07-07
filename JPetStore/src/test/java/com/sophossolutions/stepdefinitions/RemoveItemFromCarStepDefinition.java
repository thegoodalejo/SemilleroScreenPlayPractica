package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.sophossolutions.tasks.Remove;
import com.sophossolutions.ui.CarPage;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RemoveItemFromCarStepDefinition {
	private String strActorName = "Juan Miguel y Santaigo ";
	@Before
	public void settup()
	{
		setTheStage(new OnlineCast());
	}
	@Given("Debe ir al carrito")
	public void debeIrAlCarrito() {
		theActorCalled(strActorName).attemptsTo(Click.on(CarPage.BTN_UPDATE_CAR));
	}
	@When("Debe seleccionar un animal del carrito aleatoriamente")
	public void debeSeleccionarUnAnimalDelCarritoAleatoriamente() {
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		theActorInTheSpotlight().wasAbleTo(Remove.with(CarPage.BTN_REMOVE,CarPage.N_ANIMALS_TABLE ));
	}
	@Then("Validar la eliminacion del articulo")
	public void validarLaEliminacionDelArticulo() {
		theActorInTheSpotlight().should(seeThat(the(CarPage.TITLE_EMPTY), isVisible()));
	}
}
