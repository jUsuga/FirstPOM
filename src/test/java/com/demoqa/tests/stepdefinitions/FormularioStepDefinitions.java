package com.demoqa.tests.stepdefinitions;

import com.demoqa.automation.steps.FormularioSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class FormularioStepDefinitions {

    @Steps
    FormularioSteps formularioStep;

    @Given("^on the page of demoqa$")
    public void onThePageOfDemoqa() {

        formularioStep.openBrouser();

    }


    @When("^enter all your dada in form$")
    public void enterAllYourDadaInForm() throws InterruptedException, IOException {

       // formularioStep.darClick();
        formularioStep.registerWithExcel();

    }

    @Then("^you should see a table with data$")
    public void youShouldSeeATableWithData() {

    }
}
