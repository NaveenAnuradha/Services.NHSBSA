package nhsbsa.services;

import org.openqa.selenium.By;

public class SavingsPage extends Utils {

    By _doYouHaveSavingsNoBtn = By.xpath("//label[@id='label-no']");
    By _savingsPageNext = By.xpath("//input[@id='next-button']");

    //Do you have more than £16,000 in savings, investments or property? = No
    public void clickOnDoYouHaveSavingsNoBtn() {
        clickOnElement(_doYouHaveSavingsNoBtn);
    }

    //click next btn
    public void clickOnSavingsPageNextBtn() {
        clickOnElement(_savingsPageNext);
    }
}
