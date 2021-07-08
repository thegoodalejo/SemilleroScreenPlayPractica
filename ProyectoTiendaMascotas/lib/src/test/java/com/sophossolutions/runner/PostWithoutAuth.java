package com.sophossolutions.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue="com.sophossolutions.stepdefinitions",
		features= "src/test/resources/com/sophossolutions/features/post_without_auth.feature",
		snippets= SnippetType.CAMELCASE)
public class PostWithoutAuth {

}
