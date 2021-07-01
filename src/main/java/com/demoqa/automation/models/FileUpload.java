package com.demoqa.automation.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

public class FileUpload {
    public static void clickFILE(WebDriver driver, By by){
        WebElement element = driver.findElement(by);
        ((RemoteWebElement) element).setFileDetector(new LocalFileDetector());
        element.sendKeys("resources\\clase1.txt");
    }
}
