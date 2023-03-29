package co.com.automationExercise.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationExerciseGoogleVintage extends PageObject {
    public static final Target GOOGLE_ADD= Target.the("google_add").located(By.id("dismiss-button"));


}
