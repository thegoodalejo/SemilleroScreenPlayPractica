package com.sophos.semillero.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "com.sophos.semillero.stepdefinitions",
		features = "src/test/resources/features/03_add_animal_to_cart.feature",
		snippets = SnippetType.CAMELCASE
		)
public class AddAnimalToCart {

}