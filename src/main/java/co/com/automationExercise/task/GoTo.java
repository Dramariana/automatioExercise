package co.com.automationExercise.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static co.com.automationExercise.userinterfaces.AutomationExerciseHomePage.*;
import static co.com.automationExercise.userinterfaces.AutomationExerciseGoogleVintage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        PRODUCT_ICON.waitingForNoMoreThan(Duration.ofSeconds(10)).isVisibleFor(actor);
        actor.attemptsTo(Click.on(PRODUCT_BUTTON));
        GOOGLE_ADD.waitingForNoMoreThan(Duration.ofSeconds(70)).isVisibleFor(actor);

       // System.out.println("voy a undir el boton");
        if (ASWIFT1.isVisibleFor(actor)) {
            actor.attemptsTo(Switch.toFrame("aswift_1"));
            //System.out.println("entre al if");
        } else if (ASWIFT4.isVisibleFor(actor)) {
            actor.attemptsTo(Switch.toFrame("aswift_4"));
            //System.out.println("entre al if");
        } else if (ASWIFT5.isVisibleFor(actor)) {
            actor.attemptsTo(Switch.toFrame("aswift_5"));
            //System.out.println("entre al else");
        }
        if (DISMISS_GOOGLE_ADD.isVisibleFor(actor)) {
            actor.attemptsTo(Click.on(DISMISS_GOOGLE_ADD));
        } else if (ADIFRAME.isVisibleFor(actor)) {
           // System.out.println("if del ad_frame");
            actor.attemptsTo(Switch.toFrame("ad_iframe"));
            actor.attemptsTo(Click.on(DISMISS_GOOGLE_ADD));
        }

    }

    public static GoTo products(WebDriver driver) {
        return instrumented(GoTo.class, driver);

    }


}
