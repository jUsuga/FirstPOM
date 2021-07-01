package com.demoqa.tests.stepdefinitions;

import com.demoqa.automation.steps.FormularioSteps;
import com.demoqa.automation.steps.ValidacionesSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class ValidacionesStepDefinitions {
    @Steps
    FormularioSteps formularioSteps;
    @Steps
    ValidacionesSteps validacionesSteps;

    @Given("^the data entered in the demoqa form is successful$")
    public void theDataEnteredInTheDemoqaFormIsSuccessful() {
        formularioSteps.openBrouser();
    }


    @When("^the form is successful, the data is taken and comparad with data from Excel$")
    public void theFormIsSuccessfulTheDataIsTakenAndComparadWithDataFromExcel() throws IOException, InterruptedException {
        formularioSteps.registerWithExcel();
    }

    @Then("^validate that la comparison was a success$")
    public void validateThatLaComparisonWasASuccess() throws IOException {
        validacionesSteps.validation();
    }
}
