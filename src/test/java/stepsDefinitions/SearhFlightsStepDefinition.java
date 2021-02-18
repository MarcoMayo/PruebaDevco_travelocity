package stepsDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DataFlight;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.AirlineFiltered;
import questions.DetailsFlight;
import questions.FlightSearched;
import tasks.FillFlightData;
import tasks.SelectAirline;
import tasks.SelectFlight;

import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;
import static userInterface.MainPage.TYPE_SERVICE;


public class SearhFlightsStepDefinition {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Travelocity user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.travelocity.com/"));


    }

    @Given("^that the user is on the main page$")
    public void thatTheUserIsOnTheMainPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(TYPE_SERVICE.of("Flights")));
    }

    @When("^the user enters the information about the flight$")
    public void theUserEntersTheInformationAboutTheFlight(List<DataFlight> dateFlight) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillFlightData.inFields(dateFlight.get(0)));
    }

    @Then("^he should see a flight (.*)$")
    public void heShouldSeeAFlight(String flight) {
        OnStage.theActorInTheSpotlight().should(seeThat(FlightSearched.withName()
                , is(equalTo(flight))));
    }

    @When("^the user selects a flight$")
    public void theUserSelectsAFlight() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectFlight.desired());
    }


    @Then("^he should see the flight details$")
    public void heShouldSeeTheFlightDetails() {
        OnStage.theActorInTheSpotlight().should(seeThat(DetailsFlight.isVisible()));
    }

    @Given("^Given the user searched for a flight with the following data$")
    public void givenTheUserSearchedForAFlightWithTheFollowingData(List<DataFlight> dateFlight) {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(TYPE_SERVICE.of("Flights")));
        OnStage.theActorInTheSpotlight().attemptsTo(FillFlightData.inFields(dateFlight.get(0)));
    }


    @When("^the user filters through the airline \"([^\"]*)\"$")
    public void theUserFiltersThroughTheAirline(String airline) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectAirline.withName(airline));
    }

    @Then("^he should see  \"([^\"]*)\" flights only$")
    public void heShouldSeeFlightsOnly(String airline) {
        OnStage.theActorInTheSpotlight().should(seeThat(AirlineFiltered.isVisible(airline)));
    }


}