package nhsbsa.services;

import org.openqa.selenium.By;

public class DateOfBirth extends Utils {

    By _dayOfBirth = By.xpath("//input[@id='dob-day']");
    By _monthOfBirth = By.xpath("//input[@id='dob-month']");
    By _yearOfBirth = By.xpath("//input[@id='dob-year']");
    By _dobPageNext = By.xpath("//input[@id='next-button']");

    //What is your date of birth?
    //enter day of date of birth
    public void typeDayOfBirth(String dayOfBirth) {
        typeText(_dayOfBirth, dayOfBirth);
    }

    //enter month of birth
    public void typeMonthOfBirth(String monthOfBirth) {
        typeText(_monthOfBirth, monthOfBirth);
    }

    //enter year of birth
    public void typeYearOfBirth(String yearOfBirth) {
        typeText(_yearOfBirth, yearOfBirth);
    }

    //click next btn
    public void clickOnDobPageNextBtn() {
        clickOnElement(_dobPageNext);
    }


}
