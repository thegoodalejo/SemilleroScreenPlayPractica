package com.sophossolutions.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "com.sophossolutions.stepdefinitions",
		features = "src/test/resources/features/ui_test_register.feature",
		snippets = SnippetType.CAMELCASE
		)

public class UiTestRegister {

}
