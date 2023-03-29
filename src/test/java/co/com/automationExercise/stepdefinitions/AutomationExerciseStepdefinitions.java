package co.com.automationExercise.stepdefinitions;

import co.com.automationExercise.task.GoTo;
import co.com.automationExercise.task.SearchProduct;
import co.com.automationExercise.userinterfaces.AutomationExerciseHomePage;
import co.com.automationExercise.userinterfaces.AutomationExerciseProducts;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomationExerciseStepdefinitions {

    public static final int CURRENT_PRODUCT = 0;
    AutomationExerciseHomePage automationExerciseHomePage;
    AutomationExerciseProducts automationExerciseProducts;


    @Managed(driver = "chrome", uniqueSession = true)
    private WebDriver hisBrowser;

    private final Actor user = Actor.named("Mariana");


    @Before

    public void actorCanBrowseTheWeb() {
        user.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();

    }


    @Given("user enters automationExercise site")
    public void userEntersAutomationExerciseSite() {
        user.wasAbleTo(Open.browserOn().the(automationExerciseHomePage));
    }

    @And("user select product button")
    public void userSelectProductButton() {
        user.attemptsTo(GoTo.products());
    }

    @When("user search product")
    public void userSearchProduct() {
        user.attemptsTo(SearchProduct.AutomationExercise());
    }

    @Then("user can view all products related to search")
    public void userCanViewAllProductsRelatedToSearch() {
    }
}
