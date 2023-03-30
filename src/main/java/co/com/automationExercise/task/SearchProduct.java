package co.com.automationExercise.task;

import co.com.automationExercise.exceptions.Exception;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

import java.time.Duration;
import java.util.List;

import static co.com.automationExercise.exceptions.Exception.PAGE_ERROR_MESSAGE;
import static co.com.automationExercise.userinterfaces.AutomationExerciseProducts.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class SearchProduct implements Task {
    public static String product;

    public SearchProduct(String productSearch) {
        product = productSearch;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Switch.toDefaultContext());
        actor.should(seeThat(the(SEARCH_PRODUCT.waitingForNoMoreThan(Duration.ofSeconds(20))), isVisible())
                .orComplainWith(Exception.class, PAGE_ERROR_MESSAGE));

        actor.attemptsTo(Enter.theValue(product).into(SEARCH_PRODUCT).then(Click.on(SEARCH_BUTTON)));

//        List<WebElementFacade> productsList = PRODUCT_LIST.resolveAllFor(actor);
//        for (int i = 0; i < productsList.size(); i++) {
//            System.out.println("producto #" + (i + 1) + ": " + productsList.get(i).getText());
//        }

    }

    public static SearchProduct AutomationExercise(String productSearch) {
        return instrumented(SearchProduct.class, productSearch);

    }
}
