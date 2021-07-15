package com.automation.practice.certification.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class HomePage extends PageObject {

    public static final Target BTN_SIGN_IN_OPTION = Target.the("Sign In option").
            located(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=my-account']"));

    public static final Target VIEW_MORE_PRODUCT = Target.the("View more about product").
            locatedBy(("//div[@class='product-container']//span[contains(text(),'{0}')]//ancestor::div[@class='right-block']//a"));
}
