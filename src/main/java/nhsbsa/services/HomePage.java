package nhsbsa.services;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    By _startBtn = By.xpath("//input[@id=\"next-button\"]");

    //Check what help you could get to pay for NHS costs
    //click start btn to answer questions
    public void clickOnStartBtn() {
        clickOnElement(_startBtn);
    }

}
