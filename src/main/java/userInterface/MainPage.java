package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class MainPage {
    public static final Target TYPE_FLIGHTS = Target.the("select type of flights")
            .locatedBy("//div[@class='uitk-tabs-inner-container']//*[contains(text(),'{0}')]");

    public static final Target TYPE_SERVICE = Target.the("select type of service")
            .locatedBy("//li[@class='uitk-tab uitk-tab-icon-text ']//*[contains(text(),'{0}')]");

    public static final Target BUTTON_CITY_FIELD = Target.the("button field of city")
            .locatedBy("//*[@id='location-field-leg1-{0}-menu']//button");

    public static final Target ORIGIN_CITY_FIELD = Target.the("field of origin city")
            .locatedBy("//*[@id='location-field-leg1-origin']");

    public static final Target DESTIN_CITY_FIELD = Target.the("field of destination city")
            .locatedBy("//*[@id='location-field-leg1-destination']");

    public static final Target BUTTON_DATE = Target.the("button date")
            .locatedBy("//*[@id='d1-btn']");

    public static final Target DEPARTURE_DATE = Target.the("date of departure")
            .locatedBy("//button[@class='uitk-date-picker-day uitk-new-date-picker-day' and @aria-label='{0}']");

    public static final Target BUTTON_DONE_DATE = Target.the("button done date")
            .locatedBy("//span[contains(text(),'Done')]");

    public static final Target BUTTON_SEARCH_DATE = Target.the("button search date")
            .locatedBy("//button[contains(text(),'Search')]");
}
