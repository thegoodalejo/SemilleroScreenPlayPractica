package com.sophossolutions.runner;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "com.sophossolutions.stepdefinitions",
		features = "src/test/resources/features/para_bank.feature",
		snippets = SnippetType.CAMELCASE,
		strict = true
		)

public class paraBankEjercicio {

}
