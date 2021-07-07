package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.models.ItemShopCar;
import com.sophossolutions.questions.IdProducAnima;
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

public class ViewItemInfoStepDefinition {

	private String strActorName = Constants.ACTOR_NAME;

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("Must go to animal catalogs page")
	public void mustGoToAnimalCatalogsPage() {
		theActorCalled(strActorName).wasAbleTo(GoToPage.type(HomePage.LINK_ANIMAL, HomePage.LINKS_ANIMALS));

		theActorInTheSpotlight()
				.wasAbleTo(GoToPage.animals(ResultTypeAnimalsPage.LINK_ANIMAL, ResultTypeAnimalsPage.LINKS_ANIMALS));
	}

	@When("You must go to the page of a random animal")
	public void youMustGoToThePageOfARandomAnimal() {
		theActorInTheSpotlight().wasAbleTo(GoToPage.selectOne(AnimalPage.LINK_ANIMAL, AnimalPage.LINKS_ANIMALS));
		String auxIndex = theActorInTheSpotlight().recall(Constants.DIR_INDEX_ANIMAL).toString();
		theActorInTheSpotlight().wasAbleTo(GetInfo.animal());
		theActorInTheSpotlight().wasAbleTo(Click.on(AnimalPage.TEXT_ITEM_ID.of(auxIndex)));
	}

	@Then("Validate the information in the table")
	public void validateTheInformationInTheTable() {
		ItemShopCar infoAnimal = theActorInTheSpotlight().recall(Constants.MODEL_ANIMAL);  // Aca hay un cambio !
		theActorInTheSpotlight().should(seeThat(IdProducAnima.with(ResultTypeAnimalsPage.TXT_ID_ANIMAL),
				IsEqual.equalTo(infoAnimal.getItemID())));
	}
}
