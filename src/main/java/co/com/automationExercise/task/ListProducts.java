package co.com.automationExercise.task;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;

import static co.com.automationExercise.userinterfaces.AutomationExerciseProducts.*;
import static co.com.automationExercise.task.SearchProduct.product;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ListProducts implements Task {
    private String productSearch;

    public ListProducts() {
        productSearch = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> productsList = PRODUCT_LIST.resolveAllFor(actor);

        System.out.println("Cantidad de productos encontrados:" + productsList.size());
        for (int i = 0; i < productsList.size(); i++) {

                System.out.println("producto #" + (i + 1) + ": " + productsList.get(i).getText()
                        + "\u001B[36m contiene la palabra " + productSearch);


        }

    }

    public static ListProducts found() {
        return instrumented(ListProducts.class);

    }
}
