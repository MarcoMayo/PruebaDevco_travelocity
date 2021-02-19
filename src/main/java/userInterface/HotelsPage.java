package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class HotelsPage {

    public static final Target LOADER = Target.the("loader")
            .locatedBy("//span[@class='uitk-loader']");

    public static final Target HOTELS_AVAILABLE = Target.the("Hotels available")
            .locatedBy("//a[@data-stid='open-hotel-information']");
}
