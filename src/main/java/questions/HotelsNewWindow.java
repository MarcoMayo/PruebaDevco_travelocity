package questions;

import interactions.Switch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Visibility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static userInterface.HotelsPage.HOTELS_AVAILABLE;
import static userInterface.HotelsPage.LOADER;

public class HotelsNewWindow implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        actor.attemptsTo(Switch.timeSheetWindow());
        wait.until(ExpectedConditions.invisibilityOf(LOADER.resolveFor(actor)));

        return Visibility.of(HOTELS_AVAILABLE).viewedBy(actor).asBoolean();
    }

    public static HotelsNewWindow isVisible(){
        return new HotelsNewWindow();
    }
}
