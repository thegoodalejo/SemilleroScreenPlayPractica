package com.grupo3.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
			glue = "com.grupo3.stepdefs",
			features = "src/test/resources/com/grupo3/features/validate_items_in_cart.feature",
			snippets = SnippetType.CAMELCASE
		)
public class ValidateItemsInCart {

}
