package com.demoqa.automation.steps;

import com.demoqa.automation.models.Data;
import com.demoqa.automation.pageobjects.ValidacionesPage;
import com.demoqa.automation.utils.Excel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class ValidacionesSteps {
    ValidacionesPage validacionesPage = new ValidacionesPage();
    Data data = new Data();
    Excel excel = new Excel();


    @Step
    public  void validation() throws IOException {
        validacionesPage.validationExampleModal(excel.getCellValue(data.getFilepath(), data.getSheetNameData(),1,0));
        validacionesPage.validationStudentGmail(excel.getCellValue(data.getFilepath(), data.getSheetNameData(),1,1));
        validacionesPage.validationPinture(excel.getCellValue(data.getFilepath(), data.getSheetNameData(),1,2));
    }
}
