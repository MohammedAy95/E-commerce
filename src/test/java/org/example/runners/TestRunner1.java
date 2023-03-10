package org.example.runners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/main/resources/features",
        glue = "org/example/StepDefinitions",
        plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        tags = "@regression"
)

public class TestRunner1 extends AbstractTestNGCucumberTests {
}
