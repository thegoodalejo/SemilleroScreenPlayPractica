package com.guacha.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
			glue = "com.guacha.stepdefs",
			features = "src/test/resources/com/guacha/features/login.feature",
			snippets = SnippetType.CAMELCASE
		)
public class Login {

}
