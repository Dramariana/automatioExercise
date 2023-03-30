package co.com.automationExercise.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationExerciseProducts extends PageObject {

    public static final Target PRODUCT_BUTTON= Target.the("product_button").located(By.xpath("//i[@class='material-icons card_travel']"));
    public static final Target SEARCH_PRODUCT= Target.the("search_products").located(By.id("search_product"));

    public static final Target SEARCH_BUTTON= Target.the("search_button").located(By.id("submit_search"));

    public static final Target PRODUCT_LIST= Target.the("search_products").located(By.xpath("//div[@class='productinfo text-center']/p"));
}
