package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class DetailsFlightPopUp {

    public static final Target DETAILS_FLIGHT = Target.the("details flight")
            .locatedBy("//div[@data-test-id='details-and-fares']");
}
