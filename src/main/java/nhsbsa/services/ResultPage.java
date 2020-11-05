package nhsbsa.services;

import org.openqa.selenium.By;

public class ResultPage extends Utils {

    By _youGetHelpWithNHSCost = By.xpath("//h1[@id='result-heading']");

    //you can get final result,
    // showing what help you could get to pay for NHS costs, you get for free.
    // and Assertion
    public String youGetHelpWithNHSCostMessage() {
        return getText(_youGetHelpWithNHSCost);
    }
}
