package com.sophos.semillero.runner;

import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "com.sophos.semillero.stepdefinitions",
		features = "src/test/resources/features/CrearCuentaParaBank.feature",
		snippets = SnippetType.CAMELCASE,
		strict = true
		)
public class ParaBankR {

}
