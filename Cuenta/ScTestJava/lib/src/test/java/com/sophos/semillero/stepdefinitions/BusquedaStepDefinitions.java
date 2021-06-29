package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsAnything;

import com.sophos.semillero.questions.Result;
//import com.sophos.semillero.tasks.Search;
import com.sophos.semillero.tasks.Create;
import com.sophos.semillero.tasks.Login;
import com.sophos.semillero.tasks.Overview;
import com.sophos.semillero.ui.OpenAccount;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;

public class BusquedaStepDefinitions {
	String strNumCuenta;
	
	@Given("Deseo ir a la pagina {string}")
	public void deseoIrALaPagina(String strUrl) {
		theActorCalled("Sara").wasAbleTo(Open.url(strUrl));
	}

	@When("Ingreso credenciales {string}")
	public void ingresoCredenciales(String strCredenciales) {
		String[] strCredencial=strCredenciales.split(",");
		String strUserName=strCredencial[0];
		String strPassword=strCredencial[1];
		theActorInTheSpotlight().wasAbleTo(Login.with(strUserName, strPassword),
				Create.with("1","13566"));
		strNumCuenta=OpenAccount.TXT_ACCOUNT.resolveFor(theActorInTheSpotlight()).getTextValue();
	}

	@Then("Muestro estado de cuenta y verifico")
	public void muestroEstadoDeCuentaYVerifico() {
		theActorInTheSpotlight().wasAbleTo(Overview.with());
	}
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}

    /*
	@Given("Deseo ir a la pagina {string}")
	public void deseoIrALaPagina(String string) {
	   theActorCalled("Grupo 2").wasAbleTo(Open.url(string));
	}
	@When("Ingreso nombre de producto (.+)$")
	public void ingresoNombreDeProducto(String strProducto) {
		theActorCalled("Grupo 2").wasAbleTo(Search.the(strProducto));
	}

	@Then("Muestro nombre y precio del producto {string}")
	public void muestroNombreYPrecioDelProducto(String strListNum) {
		
		String[] arrNum = strListNum.split(",");
		System.out.println("------------------------------------------------");
		for (int i=0; i<arrNum.length; i++) {
			theActorInTheSpotlight().wasAbleTo(PrintTheResult.from(ResultPage.TXT_PRODUCTO1.of(arrNum[i])
					,ResultPage.TXT_PRECIO1.of(arrNum[i])));
		}
		System.out.println("------------------------------------------------");
	}
	
	@Before()
	public void setup() {
		setTheStage(new OnlineCast());
	}*/
	
}
