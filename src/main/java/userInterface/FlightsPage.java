package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class FlightsPage {
    public static final Target FLIGHTS_SEARCHED = Target.the("searched flights")
            .locatedBy("(//div[@data-test-id='arrival-departure'])[1]");

    public static final Target VISIBILITY_FLIGHTS = Target.the("visibility of flights")
            .locatedBy("//div[@data-test-id='intersection-observer']");

    public static final Target SELECT_AIRLINE_PREFER = Target.the("checkbox select prefer airline")
            .locatedBy("//div[contains(@data-test-id,'preferred-airline') and contains(text(),'{0}')]");

    public static final Target AIRLINE_OPERATED = Target.the("airline of flight")
            .locatedBy("//*[@data-test-id='flight-operated']");

    public static final Target BUTTON_CLEAR_FILTER = Target.the("clear all")
            .locatedBy("//*[@data-test-id='filter-clear-all']");

    public static final Target FLIGHT_SELECTED = Target.the("flight selected")
            .locatedBy("//li[@data-test-id='offer-listing']");
}


