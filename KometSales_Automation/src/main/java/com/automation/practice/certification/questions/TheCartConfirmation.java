package com.automation.practice.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.automation.practice.certification.userinterfaces.CartInformationPage.CART_CONFIRMATION_MESSAGE;

public class TheCartConfirmation implements Question<String> {

    public static TheCartConfirmation message() {
        return new TheCartConfirmation();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CART_CONFIRMATION_MESSAGE).viewedBy(actor).asString();
    }
}
