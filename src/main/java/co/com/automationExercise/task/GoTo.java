package co.com.automationExercise.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.automationExercise.userinterfaces.AutomationExerciseHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(Click.on(PRODUCT_BUTTON));
    }

    public static GoTo products() {
        return instrumented(GoTo.class);

    }
}
