package nhsbsa.services;

import org.openqa.selenium.By;

public class WarPensioner extends Utils {

    By _injuryCausedByArmedForces = By.xpath("//label[@id='label-no']");
    By _warPensionerPageNext = By.xpath("//input[@id='next-button']");

    //Do you have an injury or illness caused by serving in the armed forces? = No
    public void clickOnNoInjuryCausedByArmedFores() {
        clickOnElement(_injuryCausedByArmedForces);
    }

    //click next btn
    public void clickOnWarPensionerPageNext() {
        clickOnElement(_warPensionerPageNext);
    }
}
