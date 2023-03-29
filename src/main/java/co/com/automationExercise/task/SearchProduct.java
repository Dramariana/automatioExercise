package co.com.automationExercise.task;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.*;
import org.openqa.selenium.By;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchProduct implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> productsList = BrowseTheWeb.as(actor).findAll(By.xpath("//div[@class='productinfo text-center']/p"));

        for (int i = 0; i < productsList.size(); i++) {
            System.out.printf("producto #"+(i+1)+": "+productsList.get(i).getText());
            
        }

    }

    public static SearchProduct AutomationExercise() {
        return instrumented(SearchProduct.class);

    }
}
