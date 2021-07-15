package com.automation.practice.certification.tasks;

import com.automation.practice.certification.models.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.automation.practice.certification.userinterfaces.HomePage.VIEW_MORE_PRODUCT;
import static com.automation.practice.certification.userinterfaces.ProductDetail.*;

public class AddProduct implements Task {

    private TestData testData;

    public AddProduct(TestData testData) {
        this.testData = testData;
    }

    public static AddProduct toCart(TestData testData) {
        return Tasks.instrumented(AddProduct.class, testData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VIEW_MORE_PRODUCT.of(testData.getDiscount())),
                SelectFromOptions.byVisibleText(testData.getSize()).from(SELECT_SIZE),
                Click.on(SELECT_COLOUR.of(testData.getColour())),
                Click.on(BTN_ADD_TO_CART)
        );
    }
}
