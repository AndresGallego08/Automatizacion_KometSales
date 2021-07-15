package com.automation.practice.certification.stepdefinitions;

import com.automation.practice.certification.models.TestData;
import com.automation.practice.certification.questions.TheCartConfirmation;
import com.automation.practice.certification.tasks.AddProduct;
import com.automation.practice.certification.tasks.EntersThe;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.automation.practice.certification.utils.Constants.AUTOMATION_PRACTICE_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductStepDefinitions {

    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Andres").can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^the user is logged into the automation practice page$")
    public void theUserIsLoggedIntoTheAutomationPracticePage(List<TestData> testDataList) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(AUTOMATION_PRACTICE_URL),
                EntersThe.credentials(testDataList.get(0)));
    }

    @When("^add a product to the cart$")
    public void addAProductToTheCart(List<TestData> testDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProduct.toCart(testDataList.get(0)));
    }

    @Then("^he can see the product information in the cart$")
    public void heCanSeeTheProductInformationInTheCart() {
        theActorInTheSpotlight().should(seeThat(TheCartConfirmation.message()));
    }
}
