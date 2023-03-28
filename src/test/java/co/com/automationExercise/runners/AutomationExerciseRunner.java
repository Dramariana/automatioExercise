package co.com.automationExercise.runners;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", glue = {
        "co.com.automationExercise.stepdefinitions" }, snippets = CucumberOptions.SnippetType.CAMELCASE)
public class AutomationExerciseRunner {
}
