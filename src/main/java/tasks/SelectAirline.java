package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userInterface.FlightsPage.SELECT_AIRLINE_PREFER;

public class SelectAirline implements Task {

    private String airline;

    public SelectAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_AIRLINE_PREFER.of(airline)));
    }

    public static SelectAirline withName (String airline){
        return Tasks.instrumented(SelectAirline.class, airline);
    }
}
