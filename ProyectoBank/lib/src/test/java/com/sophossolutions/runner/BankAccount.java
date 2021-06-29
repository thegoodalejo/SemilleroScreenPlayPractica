package com.sophossolutions.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue= "com.sophossolutions.stepdefinitions",
		features= "src/test/resources/com/sophossolutions/features/BankAccount.feature",
		snippets= SnippetType.CAMELCASE
		)
public class BankAccount {

}
