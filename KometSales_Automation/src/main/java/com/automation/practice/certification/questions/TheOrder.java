package com.automation.practice.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static com.automation.practice.certification.userinterfaces.ProceedToCheckOutPage.ORDER_CONFIRMATION_MESSAGE;

public class TheOrder implements Question<Boolean> {

    public static TheOrder confirmation() {
        return new TheOrder();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(ORDER_CONFIRMATION_MESSAGE).viewedBy(actor).asBoolean();
    }
}
