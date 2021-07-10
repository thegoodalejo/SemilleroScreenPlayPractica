package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.TextObtained;
import com.sophos.semillero.tasks.AddAnimalToCartFromDetailPage;
import com.sophos.semillero.tasks.GoToCategoryPage;
import com.sophos.semillero.tasks.SelectAnimalSpecies;
import com.sophos.semillero.tasks.SelectItem;
import com.sophos.semillero.ui.AnimalSpeciesPage;
import com.sophos.semillero.ui.CartPage;
import com.sophos.semillero.ui.CategoryPage;
import com.sophos.semillero.ui.DetailPage;
import com.sophos.semillero.ui.HomePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;

public class ViewItemInfoStepDefinition {

	private static int intRandomCategory;
	private static int intRandomItem;
	private static Target tarRandomCategory;
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("A random animal is chosen")
	public void ingresoAlDetalleDeUnAnimal() {
		intRandomCategory = ThreadLocalRandom.current().nextInt(1, 5 + 1);
		switch (intRandomCategory) {
		case 1:
			tarRandomCategory = HomePage.BTN_FISH;
			break;
		case 2:
			tarRandomCategory = HomePage.BTN_DOGS;
			break;
		case 3:
			tarRandomCategory = HomePage.BTN_REPTILES;
			break;
		case 4:
			tarRandomCategory = HomePage.BTN_CATS;
			break;
		case 5:
			tarRandomCategory = HomePage.BTN_BIRDS;
			break;
		}
		theActorCalled("Grupo 4").wasAbleTo(GoToCategoryPage.usingLink(tarRandomCategory));
		
		List<?> listItemNames = CategoryPage.TB_NAMES.resolveAllFor(theActorInTheSpotlight());
		intRandomItem = ThreadLocalRandom.current().nextInt(2, /*listItemNames.size()*/ 3);

		theActorInTheSpotlight().wasAbleTo(
				SelectAnimalSpecies.fromTableRowInCategoryPage(intRandomItem)
				);
		
		String strItemIdToSeeDetail = AnimalSpeciesPage.BTN_ITEM_DETAIL.of(String.valueOf(intRandomItem))
				.resolveFor(theActorInTheSpotlight()).getText();
		theActorInTheSpotlight().remember("strItemIdToSeeDetail", strItemIdToSeeDetail);
	}
	
	@When("Item detail page is opened")
	public void validateThatPickedAnimalIsInTheCart() {
		theActorInTheSpotlight().wasAbleTo(
				SelectItem.fromTableRowInCategoryPage(intRandomItem)
				);
	}

	@Then("Valido que el ID_ITEM sea el mismo en el detalle")
	public void validoQueElID_ITEMSeaElMismoEnElDetalle() {
		String strItemIdToSeeDetail = theActorInTheSpotlight().recall("strItemIdToSeeDetail");
		theActorInTheSpotlight()
				.should(seeThat(TextObtained.from(DetailPage.TXT_ITEM_ID), IsEqual.equalTo(strItemIdToSeeDetail)));
	}
}
