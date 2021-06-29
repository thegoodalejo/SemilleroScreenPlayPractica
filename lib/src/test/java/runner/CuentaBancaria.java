package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "stepdefinitions",
		features = "src/test/resources/features/cuentabancaria.feature",
		snippets = SnippetType.CAMELCASE)
public class CuentaBancaria {

}
