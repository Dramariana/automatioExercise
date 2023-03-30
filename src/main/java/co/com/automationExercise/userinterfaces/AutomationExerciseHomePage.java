package co.com.automationExercise.userinterfaces;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://automationexercise.com/")
public class AutomationExerciseHomePage extends PageObject {

  public static final Target ICON = Target.the("icon").located(By.xpath("//img[@alt='Website for automation practice']"));
    public static final Target PRODUCT_BUTTON= Target.the("product_button").located(By.xpath("//i[@class='material-icons card_travel']"));


}
