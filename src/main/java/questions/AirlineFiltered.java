package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static userInterface.FlightsPage.AIRLINE_OPERATED;
import static userInterface.FlightsPage.BUTTON_CLEAR_FILTER;

public class AirlineFiltered implements Question<Boolean> {

    private List<String> arrayAirlines;
    private String airline;

    public AirlineFiltered(String airline) {
        this.airline = airline;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver,300);

        wait.until(ExpectedConditions.visibilityOf(BUTTON_CLEAR_FILTER.resolveFor(actor)));
        arrayAirlines = Text.of(AIRLINE_OPERATED).viewedBy(actor).asList();

        for (int i=0; i < arrayAirlines.size(); i++){
            if (arrayAirlines.get(i).contains(airline)){
            }else return false;
        }

        return true;
    }

    public static AirlineFiltered isVisible(String airline) {
        return new AirlineFiltered(airline);
    }
}
