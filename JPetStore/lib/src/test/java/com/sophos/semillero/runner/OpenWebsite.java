package com.sophos.semillero.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "com.sophos.semillero.stepdefinitions",
		features = "src/test/resources/features/00_open_website.feature",
		snippets = SnippetType.CAMELCASE
		)
public class OpenWebsite {

}
