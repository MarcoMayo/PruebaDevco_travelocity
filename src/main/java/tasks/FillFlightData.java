package tasks;

import model.DataFlight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static userInterface.MainPage.*;

public class FillFlightData implements Task {

    private DataFlight dataFlight;

    public FillFlightData(DataFlight dataFlight) {
        this.dataFlight = dataFlight;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TYPE_FLIGHTS.of(dataFlight.getTypeFlight())),
                Click.on(BUTTON_CITY_FIELD.of("origin")),
                Enter.theValue(dataFlight.getCityOrigin()).into(ORIGIN_CITY_FIELD).thenHit(Keys.ENTER),
                Click.on(BUTTON_CITY_FIELD.of("destination")),
                Enter.theValue(dataFlight.getCityDestination()).into(DESTIN_CITY_FIELD).thenHit(Keys.ENTER),
                Click.on(BUTTON_DATE),
                Click.on(DEPARTURE_DATE.of(dataFlight.getDateOrigin())),
                Click.on(BUTTON_DONE_DATE),
                Click.on(BUTTON_SEARCH_DATE)
        );
    }

    public static FillFlightData inFields(DataFlight dataFlight){
        return Tasks.instrumented(FillFlightData.class, dataFlight);
    }
}
