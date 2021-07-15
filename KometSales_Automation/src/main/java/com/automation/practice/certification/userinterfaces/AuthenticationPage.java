package com.automation.practice.certification.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AuthenticationPage extends PageObject {

    public static final Target INPUT_EMAIL_ADDRESS = Target.the("User email address").
            located(By.id("email"));

    public static final Target INPUT_PASSWORD = Target.the("User password").
            located(By.id("passwd"));

    public static final Target BTN_SIGN_IN = Target.the("Sign In button").
            located(By.id("SubmitLogin"));

    public static final Target LOGO_HOME = Target.the("Logo return home page").
            located(By.xpath("//img[@class='logo img-responsive']"));
}
