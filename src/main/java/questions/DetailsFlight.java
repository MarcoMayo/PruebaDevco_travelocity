package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.questions.Visibility;
import userInterface.DetailsFlightPopUp;

import static userInterface.DetailsFlightPopUp.DETAILS_FLIGHT;


public class DetailsFlight implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(DETAILS_FLIGHT).viewedBy(actor).asBoolean();
    }

    public static DetailsFlight isVisible(){
        return new DetailsFlight();
    }
}
