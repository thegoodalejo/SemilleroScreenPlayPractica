package com.sophos.semillero.runner;

import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "com.sophos.semillero.stepdefinitions",
		features = "src/test/resources/features/login.feature",
		snippets = SnippetType.CAMELCASE)
public class Login {

}
