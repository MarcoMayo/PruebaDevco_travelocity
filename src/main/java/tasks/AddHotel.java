package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static userInterface.DetailsFlightPopUp.*;
import static userInterface.FlightsPage.VISIBILITY_FLIGHTS;
import static userInterface.MainPage.BUTTON_DONE_DATE;

public class AddHotel implements Task {

    private String dateCheckout;

    public AddHotel(String dateCheckout) {
        this.dateCheckout = dateCheckout;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);

        wait.until(ExpectedConditions.visibilityOf(DETAILS_FLIGHT.resolveFor(actor)));
        actor.attemptsTo(Click.on(CONTINUE_BUTTON));
        wait.until(ExpectedConditions.visibilityOf(ADD_HOTEL_POPUP.resolveFor(actor)));
        actor.attemptsTo(Click.on(CHECKOUT_HOTEL_FIELD));
        actor.attemptsTo(Click.on(SELECT_DATE_CHECKOUT.of(dateCheckout)));
        actor.attemptsTo(Click.on(BUTTON_DONE_DATE));
        actor.attemptsTo(Click.on(BUTTON_SEARCH_HOTEL));



    }

    public static AddHotel until(String dateCheckout){
        return Tasks.instrumented(AddHotel.class,dateCheckout);
    }


}
