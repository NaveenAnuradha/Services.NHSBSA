package nhsbsa.services;

import org.openqa.selenium.By;

public class DiabetesPage extends Utils {

    By _diabetesNo = By.xpath("//label[@id='label-no']");
    By _diabetesPageNext = By.xpath("//input[@id='next-button']");

    //Do you have diabetes? = No
    public void clickOnDiabetesNoBtn() {
        clickOnElement(_diabetesNo);
    }

    //click next btn
    public void clickOnDiabetesPageNextBtn() {
        clickOnElement(_diabetesPageNext);
    }

}
