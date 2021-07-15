package com.automation.practice.certification.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductDetail extends PageObject {

    public static final Target SELECT_SIZE = Target.the("Size list").
            located(By.xpath("//select[@class='form-control attribute_select no-print']"));

    public static final Target SELECT_COLOUR = Target.the("Colour options").
            locatedBy(("//div[@class='attribute_list']//a[@name='{0}']"));

    public static final Target BTN_ADD_TO_CART = Target.the("Add product to cart button").
            located(By.id("add_to_cart"));
}
