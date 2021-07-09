package com.sophos.semillero.stepdefinitions;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import org.hamcrest.core.IsEqual;
import com.sophos.semillero.questions.GetResponseGorestVerification;
import com.sophos.semillero.tasks.MakeAGetGorest;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApiGetGorestStepDefinitions {
	
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@When("I send the request {string} id {string} and resource {string}")
	public void iSendTheRequestIdAndResource(String strEndPoint, String strUserId, String strResource) {
		theActorInTheSpotlight().wasAbleTo(MakeAGetGorest.oauth(strEndPoint, strUserId,strResource));		
	}

	@Then("I check that my response is {int} and total posts")
	public void iCheckThatMyResponseIsAndTotalPosts(Integer intCode) {
		theActorInTheSpotlight().should(seeThat(GetResponseGorestVerification.with(intCode),IsEqual.equalTo(true)));
	}

}
