package com.demoqa.automation.steps;

import com.demoqa.automation.models.Data;
import com.demoqa.automation.models.FileUpload;
import com.demoqa.automation.pageobjects.FormularioPage;
import com.demoqa.automation.utils.Excel;
import com.demoqa.automation.utils.JavaScript;
import com.demoqa.automation.utils.Time;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FormularioSteps {
    Data data = new Data();
    FormularioPage formularioPage= new FormularioPage();
    Time time = new Time();
    Excel excel = new Excel();

    @Step
    public void openBrouser(){
        formularioPage.open();
    }

    @Step
    public  void registerWithExcel() throws IOException, InterruptedException {
        formularioPage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        JavaScript.clickJS(formularioPage.getDriver(), formularioPage.forms);
        JavaScript.clickJS(formularioPage.getDriver(), formularioPage.practiceForm);
        formularioPage.setFirstName(excel.getCellValue(data.getFilepath(),data.getSheetName(),1,0));
        formularioPage.setLestName(excel.getCellValue(data.getFilepath(),data.getSheetName(),1,1));
        time.wait(2000);
        formularioPage.setEmail(excel.getCellValue(data.getFilepath(), data.getSheetName(), 1,2));
        JavaScript.clickJS(formularioPage.getDriver(), formularioPage.gender);
        time.wait(2000);
        formularioPage.setMobile(excel.getCellValue(data.getFilepath(), data.getSheetName(), 1,3));
        JavaScript.clickJS(formularioPage.getDriver(), formularioPage.hobbies);
        JavaScript.clickJS(formularioPage.getDriver(), formularioPage.hobbies1);
        FileUpload.clickFILE(formularioPage.getDriver(), formularioPage.pintures);
        time.wait(2000);
        formularioPage.setAddress(excel.getCellValue(data.getFilepath(), data.getSheetName(), 1,4));
        formularioPage.clickCity();
        JavaScript.clickJS(formularioPage.getDriver(), formularioPage.select);
        formularioPage.clickCity1();
        JavaScript.clickJS(formularioPage.getDriver(), formularioPage.select1);
        time.wait(2000);
        JavaScript.clickJS(formularioPage.getDriver(), formularioPage.submit);
        time.wait(2000);
    }
}
