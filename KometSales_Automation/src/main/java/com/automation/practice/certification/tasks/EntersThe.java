package com.automation.practice.certification.tasks;

import com.automation.practice.certification.models.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.automation.practice.certification.userinterfaces.AuthenticationPage.*;
import static com.automation.practice.certification.userinterfaces.HomePage.BTN_SIGN_IN_OPTION;


public class EntersThe implements Task {

    private TestData testData;

    public EntersThe(TestData testData) {
        this.testData = testData;
    }

    public static EntersThe credentials(TestData testData) {
        return Tasks.instrumented(EntersThe.class, testData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_SIGN_IN_OPTION),
                Enter.theValue(testData.getEmailAddress()).into(INPUT_EMAIL_ADDRESS),
                Enter.theValue(testData.getPassword()).into(INPUT_PASSWORD),
                Click.on(BTN_SIGN_IN),
                Click.on(LOGO_HOME)
        );
    }
}
