package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "Feature",
glue= "StepDefinition",
monochrome=true,
plugin={"pretty","html:target/CucumberHTMLRep.html"})


public class TestRunner {

}
