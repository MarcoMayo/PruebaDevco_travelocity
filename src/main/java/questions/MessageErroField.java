package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userInterface.MainPage;

import static userInterface.MainPage.MESSAGE_ERROR;

public class MessageErroField implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MESSAGE_ERROR).viewedBy(actor).asString();
    }

    public static MessageErroField cityDestination(){
        return new MessageErroField();
    }
}
