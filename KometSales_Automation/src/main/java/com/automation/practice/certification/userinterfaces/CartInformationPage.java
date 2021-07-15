package com.automation.practice.certification.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartInformationPage extends PageObject {

    public static final Target CART_CONFIRMATION_MESSAGE = Target.the("Cart confirmation message").
            located(By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']//h2"));

    public static final Target BTN_PROCEED_TO_CHECKOUT = Target.the("Proceed to check out button").
            located(By.xpath("//a[@class='btn btn-default button button-medium']"));
}
