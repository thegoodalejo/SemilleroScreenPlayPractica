package com.grupo3.stepdefs;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CommonSteps {
	
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
}
