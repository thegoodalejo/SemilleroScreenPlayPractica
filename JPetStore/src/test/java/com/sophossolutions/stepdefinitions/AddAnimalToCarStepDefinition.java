package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.sophossolutions.tasks.GoToPage;
import com.sophossolutions.models.ItemAnimal;
import com.sophossolutions.questions.IdProduc;
import com.sophossolutions.tasks.GetInfo;
import com.sophossolutions.ui.AnimalPage;
import com.sophossolutions.ui.CarPage;
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
	public void setup()
	{
		setTheStage(new OnlineCast());
	}
	private String strActorName = Constants.ACTOR_NAME;
	private String auxIndex;
	
	@Given("Must go to animal catalogs")
	public void mustGoToAnimalCatalogs() {
		theActorCalled(strActorName).wasAbleTo(GoToPage.type(HomePage.LINK_ANIMAL,HomePage.LINKS_ANIMALS));
		
		theActorInTheSpotlight().wasAbleTo(GoToPage.animals(ResultTypeAnimalsPage.LINK_ANIMAL,ResultTypeAnimalsPage.LINKS_ANIMALS));
	}

	@When("Must select an animal randomly")
	public void mustSelectAnAnimalRandomly() {
		
		theActorInTheSpotlight().wasAbleTo(GoToPage.selectOne(AnimalPage.LINK_ANIMAL, AnimalPage.LINKS_ANIMALS));
		auxIndex = theActorInTheSpotlight().recall(Constants.DIR_INDEX_ANIMAL).toString();
		theActorInTheSpotlight().wasAbleTo(GetInfo.animal());
		theActorInTheSpotlight().wasAbleTo(Click.on(AnimalPage.BTN_ADD_TO_CART_ANIMAL.of(auxIndex)));
	}

	@Then("Observe the selected animal in the cart")
	public void observeTheSelectedAnimalInTheCart() {
		ItemAnimal infoAnimal = theActorInTheSpotlight().recall(Constants.MODEL_ANIMAL);
		theActorInTheSpotlight().should(seeThat(IdProduc.with(CarPage.TEXT_PRODUCT_ID,CarPage.N_ANIMALS_TABLE),
				IsEqual.equalTo(infoAnimal.getProductId())));
	}
}