package co.com.automationExercise.task;

import io.appium.java_client.gecko.GeckoDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static co.com.automationExercise.userinterfaces.AutomationExerciseHomePage.*;
import static co.com.automationExercise.userinterfaces.AutomationExerciseGoogleVintage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {

    @Override
    public <T extends Actor>  void performAs(T actor) {

        actor.attemptsTo(Click.on(PRODUCT_BUTTON));
        if(GOOGLE_ADD.isVisibleFor(actor)==true) {
            actor.attemptsTo(Click.on(GOOGLE_ADD));
        }

        //actor.wasAbleTo((Performable) GOOGLE_ADD);

    }

    public static GoTo products() {
        return instrumented(GoTo.class);

    }


}
