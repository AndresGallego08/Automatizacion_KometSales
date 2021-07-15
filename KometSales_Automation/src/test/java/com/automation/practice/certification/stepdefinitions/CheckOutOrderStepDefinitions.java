package com.automation.practice.certification.stepdefinitions;

import com.automation.practice.certification.questions.TheOrder;
import com.automation.practice.certification.tasks.CompleteAProduct;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CheckOutOrderStepDefinitions {

    @And("^complete a product checkout$")
    public void completeAProductCheckout() {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteAProduct.checkOut());
    }

    @Then("^he can see the order information$")
    public void heCanSeeTheOrderInformation() {
        theActorInTheSpotlight().should(seeThat(TheOrder.confirmation()));
    }

}
