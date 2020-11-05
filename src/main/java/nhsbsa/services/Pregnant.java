package nhsbsa.services;

import org.openqa.selenium.By;

public class Pregnant extends Utils {

    By _pregnantNo = By.cssSelector("label#label-no");
    By _pregnantPageNext = By.cssSelector("input#next-button");

    //Are you pregnant or have you given birth in the last 12 months? = No
    public void clickOnPregnantNoBtn() {
        clickOnElement(_pregnantNo);
    }

    //click next btn
    public void clickOnPregnantNextBtn() {
        clickOnElement(_pregnantPageNext);
    }
}
