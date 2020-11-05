package nhsbsa.services;

import org.openqa.selenium.By;

public class GlaucomaPage extends Utils {

    By _haveGlaucomaNo = By.xpath("//label[@id='label-no']");
    By _haveGlaucomaPageNext = By.xpath("//input[@id='next-button']");

    //Do you or a family member have glaucoma? =  No
    public void clickOnHaveGlaucomaNoBtn() {
        clickOnElement(_haveGlaucomaNo);
    }

    // click next btn
    public void clickOnHaveGlaucomaPageNextBtn() {
        clickOnElement(_haveGlaucomaPageNext);
    }


}
