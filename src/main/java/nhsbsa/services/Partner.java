package nhsbsa.services;

import org.openqa.selenium.By;

public class Partner extends Utils {

    By _partnerNo = By.cssSelector("label#label-no");
    By _partnerPageNext = By.xpath("//input[@id='next-button']");


    //Do you live with a partner?= No
    public void clickOnPartnerNoBtn() {
        clickOnElement(_partnerNo);
    }

    //click next btn
    public void clickOnPartnerNextBtn() {
        clickOnElement(_partnerPageNext);
    }
}
