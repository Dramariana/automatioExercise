package co.com.automationExercise.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationExerciseProducts extends PageObject {
    public static final Target ICON = Target.the("icon").located(By.xpath("//img[@alt='Website for automation practice']"));
    public static final Target PRODUCT_BUTTON= Target.the("product_button").located(By.xpath("//i[@class='material-icons card_travel']"));
    public static final Target SEARCH_PRODUCT= Target.the("search_products").located(By.id("search_product"));

}
