package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class DetailsFlightPopUp {

    public static final Target DETAILS_FLIGHT = Target.the("details flight")
            .locatedBy("//div[@data-test-id='details-and-fares']");

    public static final Target CONTINUE_BUTTON = Target.the("continue button")
            .locatedBy("//button[@data-test-id='select-button']");

    public static final Target ADD_HOTEL_POPUP = Target.the("popup to add hotel")
            .locatedBy("//*[@data-test-id='xSellHotelForcedChoice']");

    public static final Target CHECKOUT_HOTEL_FIELD = Target.the("field checkout hotel")
            .locatedBy("//*[@id='end-date-FCM-btn']");

    public static final Target SELECT_DATE_CHECKOUT = Target.the("button select date checkout")
            .locatedBy("//*[@class='uitk-date-picker-weeks']//button[contains(@aria-label,'{0}')]");

    public static final Target BUTTON_SEARCH_HOTEL = Target.the("button search hotel")
            .locatedBy("//*[@data-test-id='xsellAddHotelNow']");

}
