package co.com.retoTecnico.tasks;


import co.com.retoTecnico.userinterface.StepOneAboutYourself;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.retoTecnico.userinterface.StepOneAboutYourself.*;

public class OpenUp implements Task {

    private StepOneAboutYourself stepOnePersonal;

    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(stepOnePersonal),
                Click.on(SINGUP_BUTTON)
        );
    }
}
