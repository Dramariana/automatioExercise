package co.com.automationExercise.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationExerciseGoogleVintage extends PageObject {
    public static final Target DISMISS_GOOGLE_ADD = Target.the("dismiss google ad").located(By.xpath("//div[@id='dismiss-button']/div/span"));
    public static final Target GOOGLE_ADD = Target.the("google ad").located(By.cssSelector("ins.adsbygoogle:nth-child(4)\n"));
    public static final Target ADIFRAME = Target.the("google ad").located(By.id("ad_iframe"));
    public static final Target ASWIFT1 = Target.the("google ad").located(By.id("aswift_1"));
    public static final Target ASWIFT4 = Target.the("google ad").located(By.id("aswift_4"));
    public static final Target ASWIFT5 = Target.the("google ad").located(By.id("aswift_5"));
    public static final Target PRODUCT_ICON = Target.the("product icon").located(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a"));

}

