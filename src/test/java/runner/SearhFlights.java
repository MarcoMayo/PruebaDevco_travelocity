package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = "stepsDefinitions",
        features = "src/test/resources/searh_flights.feature",
        snippets = SnippetType.CAMELCASE
        ,dryRun = true,tags = "@this")
public class SearhFlights {
}
