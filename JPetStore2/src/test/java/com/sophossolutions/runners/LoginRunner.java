package com.sophossolutions.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "com.sophossolutions.stepsDefinitions",
		features = "src/test/resources/com/sophossolutions/features/login.feature",
		snippets = SnippetType.CAMELCASE)
public class LoginRunner {

}
