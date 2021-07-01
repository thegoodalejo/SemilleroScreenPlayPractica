package com.sophossolutions.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "com.sophossolutions.stepdefinitions",
		features = "src/test/resources/features/para_bank_create_user.feature",
		snippets = SnippetType.CAMELCASE,
		strict = true
		)

public class ParaBankCreateUser {

}
