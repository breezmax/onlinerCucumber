package onliner.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ={"src/test/java/onliner/features/filtration.feature"},
        glue = "onliner/steps",
        plugin = {"pretty","html:target/cucumber.html",
                "json:target/cucumber.json","json:target/cucumber-reports/CucumberTestReport.json"}
)
public class FiltrationAutoTestBDD extends AbstractTestNGCucumberTests {
}

