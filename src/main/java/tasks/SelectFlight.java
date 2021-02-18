package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userInterface.FlightsPage.FLIGHT_SELECTED;

public class SelectFlight implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FLIGHT_SELECTED));
    }

    public static SelectFlight desired (){
        return Tasks.instrumented(SelectFlight.class);
    }
}
