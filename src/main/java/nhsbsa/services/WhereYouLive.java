package nhsbsa.services;

import org.openqa.selenium.By;

public class WhereYouLive extends Utils {

    By _WalesBtn = By.xpath("//label[@id=\"label-wales\"]");
    By _whereYouLivePageNext = By.xpath("//input[@id='next-button']");

    //Which country do you live in? = Wales
    public void clickOnWalesBtn() {
        clickOnElement(_WalesBtn);
    }

    //click next btn
    public void clickOnWhereYouLivePageNextBtn() {
        clickOnElement(_whereYouLivePageNext);
    }
}
