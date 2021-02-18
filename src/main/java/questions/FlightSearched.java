package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static userInterface.FlightsPage.*;

public class FlightSearched implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver,300);

        wait.until(ExpectedConditions.visibilityOf(VISIBILITY_FLIGHTS.resolveFor(actor)));
        return Text.of(FLIGHTS_SEARCHED).viewedBy(actor).asString();
    }
    public static FlightSearched withName() {
        return new FlightSearched();
    }
}
