package nhsbsa.services;

import org.openqa.selenium.By;

public class CareHomePage extends Utils {

    By _liveInCareHomeNoBtn = By.xpath("//label[@id='label-no']");
    By _liveInCareHomeNext = By.cssSelector("input#next-button");

    //Do you live permanently in a care home? =  No
    public void clickOnLiveInCareHomeNoBtn() {
        clickOnElement(_liveInCareHomeNoBtn);
    }

    //click next btn
    public void clickOnLiveInCareHomePageNextBtn() {
        clickOnElement(_liveInCareHomeNext);
    }
}
