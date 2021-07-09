package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.models.ItemAnimal;
import com.sophossolutions.questions.IdProducAnima;
import com.sophossolutions.tasks.GetInfo;
import com.sophossolutions.tasks.GoToPage;
import static com.sophossolutions.ui.AnimalPage.LINK_ANIMAL_CAR;
import static com.sophossolutions.ui.AnimalPage.LINKS_ANIMALS_CAR;
import static com.sophossolutions.ui.AnimalPage.TEXT_ITEM_ID;
import static com.sophossolutions.ui.HomePage.LINK_TYPE_ANIMAL;
import static com.sophossolutions.ui.HomePage.LINKS_ANIMALS_HOME;
import static com.sophossolutions.ui.ResultTypeAnimalsPage.LINK_ANIMAL;
import static com.sophossolutions.ui.ResultTypeAnimalsPage.LINKS_ANIMALS;
import static com.sophossolutions.ui.ResultTypeAnimalsPage.TXT_ID_ANIMAL;
import static com.sophossolutions.util.Constants.ACTOR_NAME;
import static com.sophossolutions.util.Constants.DIR_INDEX_ANIMAL;
import static com.sophossolutions.util.Constants.MODEL_ANIMAL;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ViewItemInfoStepDefinition {

	private String strActorName = ACTOR_NAME;

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("Must go to animal catalogs page")
	public void mustGoToAnimalCatalogsPage() {
		theActorCalled(strActorName).wasAbleTo(GoToPage.type(LINK_TYPE_ANIMAL, LINKS_ANIMALS_HOME));

		theActorInTheSpotlight()
				.wasAbleTo(GoToPage.animals(LINK_ANIMAL, LINKS_ANIMALS));
	}

	@When("You must go to the page of a random animal")
	public void youMustGoToThePageOfARandomAnimal() {
		theActorInTheSpotlight().wasAbleTo(GoToPage.selectOne(LINK_ANIMAL_CAR, LINKS_ANIMALS_CAR));
		String auxIndex = theActorInTheSpotlight().recall(DIR_INDEX_ANIMAL).toString();
		theActorInTheSpotlight().wasAbleTo(GetInfo.animal());
		theActorInTheSpotlight().wasAbleTo(Click.on(TEXT_ITEM_ID.of(auxIndex)));
	}

	@Then("Validate the information in the table")
	public void validateTheInformationInTheTable() {
		ItemAnimal infoAnimal = theActorInTheSpotlight().recall(MODEL_ANIMAL);  
		theActorInTheSpotlight().should(seeThat(IdProducAnima.with(TXT_ID_ANIMAL),
				IsEqual.equalTo(infoAnimal.getItemID())));
	}
}
