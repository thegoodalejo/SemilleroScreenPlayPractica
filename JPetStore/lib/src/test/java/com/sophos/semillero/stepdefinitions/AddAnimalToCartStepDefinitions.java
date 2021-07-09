package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.exceptions.ExceptionMsg;
import com.sophos.semillero.questions.TextObtained;
import com.sophos.semillero.tasks.AddAnimalToCartFromDetailPage;
import com.sophos.semillero.tasks.GoToCategoryPage;
import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.tasks.SelectAnimalSpecies;
import com.sophos.semillero.tasks.SelectItem;
import com.sophos.semillero.ui.CartPage;
import com.sophos.semillero.ui.CategoryPage;
import com.sophos.semillero.ui.HomePage;

public class AddAnimalToCartStepDefinitions {

	private static int intRandomCategory;
	private static int intRandomItem;
	private static Target tarRandomCategory;

	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("I am at the homepage")
	public void iAmAtTheHomePage() {
		String strTitleWhenLoggedIn = "Welcome grupo!";
		theActorCalled("Grupo 4")
				.should(seeThat(TextObtained.in(HomePage.TXT_LOGGED_IN), IsEqual.equalTo(strTitleWhenLoggedIn)));
	}

	@When("A random animal is added to the cart")
	public void aRandomAnimalIsAddedToTheCart() {
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
		theActorInTheSpotlight().wasAbleTo(GoToCategoryPage.usingLink(tarRandomCategory));
		
		List<?> listItemNames = CategoryPage.TB_NAMES.resolveAllFor(theActorInTheSpotlight());
		intRandomItem = ThreadLocalRandom.current().nextInt(2, /*listItemNames.size()*/ 3);

		theActorInTheSpotlight().wasAbleTo(
				SelectAnimalSpecies.fromTableRowInCategoryPage(intRandomItem),
				SelectItem.fromTableRowInCategoryPage(intRandomItem),
				AddAnimalToCartFromDetailPage.usingButtonAtTheBottom()
				);
	}

	@Then("Validate that picked animal is in the cart")
	public void validateThatPickedAnimalIsInTheCart() {
		String strItemId = theActorInTheSpotlight().recall("strItemDetailId");
		theActorInTheSpotlight()
				.should(seeThat(TextObtained.in(CartPage.BTN_ITEM_ID.of(strItemId)), IsEqual.equalTo(strItemId)));
	}

}
