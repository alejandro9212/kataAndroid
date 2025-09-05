package co.com.androi.automation.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = "src/test/resources/features",
        glue = "co.com.androi.automation.stepdefinition",
        tags = "@regression",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)


public class TestRunner {
}
