package com.sophos.semillero.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.Performable;;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
	glue = "com.sophos.semillero.stepdefinitions", 
	features = "src/test/resources/features/view_item_info.feature",
	snippets = SnippetType.CAMELCASE	
	)

public class ViewItem {

}
