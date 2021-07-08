package com.grupo3.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
			glue = "com.grupo3.stepdefs",
			features = "src/test/resources/com/grupo3/features/make_a_purchase.feature",
			snippets = SnippetType.CAMELCASE
		)
public class MakeAPurchase {

}
