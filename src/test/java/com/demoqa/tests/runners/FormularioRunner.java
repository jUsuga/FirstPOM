package com.demoqa.tests.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Formulario.feature",
                  glue = "com.demoqa.tests.stepdefinitions",
                 snippets = SnippetType.CAMELCASE,
                 tags = "@regresion")
public class FormularioRunner {
}
