package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Switch implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        for (String window : BrowseTheWeb.as(actor).getDriver().getWindowHandles()) {
            BrowseTheWeb.as(actor).getDriver().switchTo().window(window);
        }
    }

    public static Switch timeSheetWindow() {
        return new Switch();
    }

}
