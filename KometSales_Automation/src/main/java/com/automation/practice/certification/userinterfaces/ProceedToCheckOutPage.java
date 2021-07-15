package com.automation.practice.certification.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProceedToCheckOutPage extends PageObject {

    public static final Target BTN_CHECKOUT_SUMMARY = Target.the("Proceed to check out button on summary page").
            located(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));

    public static final Target BTN_CHECKOUT_ADDRESS = Target.the("Proceed to check out button on address page").
            located(By.xpath("//button[@class='button btn btn-default button-medium']"));

    public static final Target CHECK_AGREE_TERMS = Target.the("Accept terms check box").
            located(By.id("cgv"));

    public static final Target BTN_CHECKOUT_SHIPPING = Target.the("Proceed to check out button on shipping page").
            located(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));

    public static final Target BTN_PAYMENT_METHOD = Target.the("Choose payment method").
            located(By.xpath("//div[@class='col-xs-12 col-md-6']"));

    public static final Target BTN_CONFIRM_ORDER = Target.the("Confirm my order").
            located(By.xpath("//button[@class='button btn btn-default button-medium']"));

    public static final Target ORDER_CONFIRMATION_MESSAGE = Target.the("Order complete successfully").
            located(By.xpath("//h1[contains(text(),'Order confirmation')]"));
}
