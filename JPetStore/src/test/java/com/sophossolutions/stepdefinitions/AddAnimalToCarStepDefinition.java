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
import static com.sophossolutions.ui.CarPage.TEXT_PRODUCT_ID;
import static com.sophossolutions.ui.CarPage.N_ANIMALS_TABLE;
import static com.sophossolutions.ui.AnimalPage.BTN_ADD_TO_CART_ANIMAL;
import static com.sophossolutions.ui.AnimalPage.LINK_ANIMAL_CAR;
import static com.sophossolutions.ui.AnimalPage.LINKS_ANIMALS_CAR;
import static com.sophossolutions.ui.HomePage.LINK_TYPE_ANIMAL;
import static com.sophossolutions.ui.HomePage.LINKS_ANIMALS_HOME;
import static com.sophossolutions.ui.ResultTypeAnimalsPage.LINK_ANIMAL;
import static com.sophossolutions.ui.ResultTypeAnimalsPage.LINKS_ANIMALS;
import static com.sophossolutions.util.Constants.ACTOR_NAME;
import static com.sophossolutions.util.Constants.DIR_INDEX_ANIMAL;
import static com.sophossolutions.util.Constants.MODEL_ANIMAL;

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
	private String strActorName = ACTOR_NAME;
	private String auxIndex;
	
	@Given("Must go to animal catalogs")
	public void mustGoToAnimalCatalogs() {
		theActorCalled(strActorName).wasAbleTo(GoToPage.type(LINK_TYPE_ANIMAL,LINKS_ANIMALS_HOME));
		
		theActorInTheSpotlight().wasAbleTo(GoToPage.animals(LINK_ANIMAL,LINKS_ANIMALS));
	}

	@When("Must select an animal randomly")
	public void mustSelectAnAnimalRandomly() {
		
		theActorInTheSpotlight().wasAbleTo(GoToPage.selectOne(LINK_ANIMAL_CAR, LINKS_ANIMALS_CAR));
		auxIndex = theActorInTheSpotlight().recall(DIR_INDEX_ANIMAL).toString();
		theActorInTheSpotlight().wasAbleTo(GetInfo.animal());
		theActorInTheSpotlight().wasAbleTo(Click.on(BTN_ADD_TO_CART_ANIMAL.of(auxIndex)));
	}

	@Then("Observe the selected animal in the cart")
	public void observeTheSelectedAnimalInTheCart() {
		ItemAnimal infoAnimal = theActorInTheSpotlight().recall(MODEL_ANIMAL);
		theActorInTheSpotlight().should(seeThat(IdProduc.with(TEXT_PRODUCT_ID,N_ANIMALS_TABLE),
				IsEqual.equalTo(infoAnimal.getProductId())));
	}
}