package com.demoqa.automation.pageobjects;
import static org.junit.Assert.*;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidacionesPage extends PageObject {
    public By exampleModal = By.id("example-modal-sizes-title-lg");
    public By studentGmail = By.xpath("//*/tr/td[text()='perez.luis@gmail.com']");
    public By pinture = By.xpath("//*/tr/td[text()='clase1.txt']");

    public  void validationExampleModal(String expectedString){
        assertEquals(getDriver().findElement(exampleModal).getText(), expectedString);
    }

    public  void validationStudentGmail(String expectedString){
        assertEquals(getDriver().findElement(studentGmail).getText(), expectedString);
    }
    public  void validationPinture(String expectedString){
        assertEquals(getDriver().findElement(pinture).getText(), expectedString);
    }
}
