package nhsbsa.services;

import org.openqa.selenium.By;

public class ClaimBenefits extends Utils {

    By _benefitsNo = By.xpath("//label[@id='label-no']");
    By _benefitsPageNext = By.xpath("//input[@id='next-button']");

    // Do you claim any benefits or tax credits? = No
    public void clickOnBenefitNoBtn() {
        clickOnElement(_benefitsNo);
    }

    //click next btn
    public void clickOnBenefitsPageNextBtn() {
        clickOnElement(_benefitsPageNext);
    }
}
