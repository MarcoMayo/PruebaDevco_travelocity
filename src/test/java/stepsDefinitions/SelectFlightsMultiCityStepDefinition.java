package stepsDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;

public class SelectFlightsMultiCityStepDefinition {
    @When("^the user selects the option \"([^\"]*)\" in multi-city flight$")
    public void theUserSelectsTheOptionInMultiCityFlight(String arg1) {
    }


    @Then("^he should see an extra field to add another flight$")
    public void heShouldSeeAnExtraFieldToAddAnotherFlight() {
    }

    @When("^the user selects the option Add another flight in multi-city flight$")
    public void theUserSelectsTheOptionAddAnotherFlightInMultiCityFlight() {
    }

    @When("^he selects option Remove$")
    public void heSelectsOptionRemove() {
    }

    @Then("^he should see the last added field get removed$")
    public void heShouldSeeTheLastAddedFieldGetRemoved() {
    }

    @When("^the user enters the information about the multi-city flight$")
    public void theUserEntersTheInformationAboutTheMultiCityFlight(List<String> arg1) {
    }

    @Then("^he should see that date (\\d+) cannot be selected$")
    public void heShouldSeeThatDateCannotBeSelected(int arg1) {
    }

    @When("^And the user select the flights of airline \"([^\"]*)\"$")
    public void andTheUserSelectTheFlightsOfAirline(String arg1) {
    }

    @Then("^he should see that flight 2 only has available flights with the airline \"([^\"]*)\"$")
    public void heShouldSeeThatFlight2OnlyHasAvailableFlightsWithTheAirline( String arg2) {
    }
}
