package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class FlightsPage {
    public static final Target FLIGHTS_SEARCHED = Target.the("searched flights")
            .locatedBy("(//div[@class='uitk-card-content-section uitk-card-content-section-padded']//div[@class='uitk-flex']/div)[1]");

    public static final Target VISIBILITY_FLIGHTS = Target.the("visibility of flights")
            .locatedBy("//button[@class='uitk-card-link']");

    public static final Target SELECT_AIRLINE_PREFER = Target.the("checkbox select prefer airline")
            .locatedBy("//label[contains(@for ,'preferred-airline')]/div[contains(text(),'{0}')]");

    public static final Target AIRLINE_OPERATED = Target.the("airline of flight")
            .locatedBy("//*[@data-test-id='flight-operated']");

    public static final Target BUTTON_CLEAR_FILTER = Target.the("clear all")
            .locatedBy("//*[@data-test-id=\"filter-clear-all\"]");

    public static final Target FLIGHT_SELECTED = Target.the("flight selected")
            .locatedBy("//li[@data-test-id=\"offer-listing\"]");
}
