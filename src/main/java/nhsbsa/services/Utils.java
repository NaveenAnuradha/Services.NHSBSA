package nhsbsa.services;

import org.openqa.selenium.By;

public class Utils extends BasePage {

    //reusable method for click on element
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //reusable method for type data
    public static void typeText(By by, String key) {
        driver.findElement(by).sendKeys(key);
    }

    //reusable method for assertion
    public static String getText(By by) {
        return driver.findElement(by).getText();
    }


}
