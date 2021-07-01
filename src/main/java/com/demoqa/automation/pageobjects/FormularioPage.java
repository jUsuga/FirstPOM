package com.demoqa.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

@DefaultUrl("https://demoqa.com")
public class FormularioPage extends PageObject {


   public By forms = By.xpath("//h5[contains(text(),'Forms')]");
   public By practiceForm = By.xpath("//*/span[text()='Practice Form']");
   public By firstName = By.id("firstName");
   public By lestName = By.id("lastName");
   public By email = By.id("userEmail");
   public By gender = By.id("gender-radio-1");
   public By mobile = By.id("userNumber");
   public By hobbies = By.id("hobbies-checkbox-1");
    public By hobbies1 = By.id("hobbies-checkbox-3");
   public By pintures = By.id("uploadPicture");
   public By address = By.id("currentAddress");
   public By city   = By.id("state");
   public By select = By.xpath("//*/div[text()='Uttar Pradesh']");
   public By city1  = By.id("city");
   public By select1 = By.xpath("//*/div[text()='Lucknow']");
   public By submit = By.id("submit");

    public void setFirstName(String string){
        getDriver().findElement(firstName).sendKeys(string);
    }
    public  void  setLestName(String string){
        getDriver().findElement(lestName).sendKeys(string);
    }
    public  void  setEmail(String string){
        getDriver().findElement(email).sendKeys(string);
    }
    public  void  setMobile(String string){
        getDriver().findElement(mobile).sendKeys(string);
    }
    public  void  setAddress(String string){
        getDriver().findElement(address).sendKeys(string);
    }
    public void clickCity(){
        getDriver().findElement(city).click();
    }
    public void clickCity1(){
        getDriver().findElement(city1).click();
    }



}
