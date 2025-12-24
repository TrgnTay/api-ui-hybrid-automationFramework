package ui.cucumber.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/ui",
    glue = {"ui.cucumber.steps", "ui.cucumber.hooks"},
    	    plugin = {
    	            "pretty",
    	            "json:target/cucumber-results/cucumber.json",
    	            "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
    	        },
    	    tags = "@ui"
    
)
public class RunUiCucumberTest {
}
