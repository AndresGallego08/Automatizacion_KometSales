package com.automation.practice.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.automation.practice.certification.userinterfaces.CartInformationPage.BTN_PROCEED_TO_CHECKOUT;
import static com.automation.practice.certification.userinterfaces.ProceedToCheckOutPage.*;


public class CompleteAProduct implements Task {


    public static CompleteAProduct checkOut() {
        return Tasks.instrumented(CompleteAProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PROCEED_TO_CHECKOUT),
                Click.on(BTN_CHECKOUT_SUMMARY),
                Click.on(BTN_CHECKOUT_ADDRESS),
                Click.on(CHECK_AGREE_TERMS),
                Click.on(BTN_CHECKOUT_SHIPPING),
                Click.on(BTN_PAYMENT_METHOD),
                Click.on(BTN_CONFIRM_ORDER)
        );
    }
}