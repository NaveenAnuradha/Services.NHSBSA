package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nhsbsa.services.*;
import org.testng.Assert;

public class WelshPersonGetHelpWithNhsCostsOtNot {

    HomePage homePage = new HomePage();
    CareHomePage careHomePage = new CareHomePage();
    ClaimBenefits claimBenefits = new ClaimBenefits();
    DateOfBirth dateOfBirth = new DateOfBirth();
    DiabetesPage diabetesPage = new DiabetesPage();
    GlaucomaPage glaucomaPage = new GlaucomaPage();
    Partner partner = new Partner();
    Pregnant pregnant = new Pregnant();
    ResultPage resultPage = new ResultPage();
    SavingsPage savingsPage = new SavingsPage();
    WarPensioner warPensioner = new WarPensioner();
    WhereYouLive whereYouLive = new WhereYouLive();

    @Given("^I am in home page$")
    public void iAmInHomePage() {
    }

    @When("^I click on start btn$")
    public void iClickOnStartBtn() {
        homePage.clickOnStartBtn();
    }

    @And("^I click on Wales btn$")
    public void iClickOnWalesBtn() {
        whereYouLive.clickOnWalesBtn();
    }

    @And("^I click on where you live page next btn$")
    public void iClickOnWhereYouLivePageNextBtn() {
        whereYouLive.clickOnWhereYouLivePageNextBtn();
    }

    @Then("^I am in date of birth page$")
    public void iAmInDateOfBirthPage() {
    }

    @When("^I enter day of birth as \"([^\"]*)\"$")
    public void iEnterDayOfBirthAs(String dayOfBirth) {
        dateOfBirth.typeDayOfBirth(dayOfBirth);
    }

    @And("^I enter month of birth as \"([^\"]*)\"$")
    public void iEnterMonthOfBirthAs(String monthOfBirth) {
        dateOfBirth.typeMonthOfBirth(monthOfBirth);
    }

    @And("^I enter year of birth as \"([^\"]*)\"$")
    public void iEnterYearOfBirthAs(String yearOfBirth) {
        dateOfBirth.typeYearOfBirth(yearOfBirth);
    }

    @And("^click on next btn of date of birth page$")
    public void clickOnNextBtnOfDateOfBirthPage() {
        dateOfBirth.clickOnDobPageNextBtn();
    }

    @Then("^I am in do you live with a partner page$")
    public void iAmInDoYouLiveWithAPartnerPage() {
    }

    @When("^I click on no partner$")
    public void iClickOnNoPartner() {
        partner.clickOnPartnerNoBtn();
    }


    @And("^I click on next btn of a partner page$")
    public void iClickOnNextBtnOfAPartnerPage() {
        partner.clickOnPartnerNextBtn();
    }

    @Then("^I can see Do you claim any benefits or tax credits\\? page$")
    public void iCanSeeDoYouClaimAnyBenefitsOrTaxCreditsPage() {
    }

    @When("^I click on no claim benefits$")
    public void iClickOnNoClaimBenefits() {
        claimBenefits.clickOnBenefitNoBtn();
    }

    @And("^I click on next btn of claim any benefits page$")
    public void iClickOnNextBtnOfClaimAnyBenefitsPage() {
        claimBenefits.clickOnBenefitsPageNextBtn();
    }

    @Then("^I can see are you pregnant page$")
    public void iCanSeeAreYouPregnantPage() {
    }

    @When("^I click on no pregnancy btn$")
    public void iClickOnNoPregnancyBtn() {
        pregnant.clickOnPregnantNoBtn();
    }

    @And("^I click on pregnant page next btn$")
    public void iClickOnPregnantPageNextBtn() {
        pregnant.clickOnPregnantNextBtn();
    }

    @Then("^I can see do you have an injury caused by armed forces page$")
    public void iCanSeeDoYouHaveAnInjuryCausedByArmedForcesPage() {
    }

    @When("^I click on no injury caused armed forces btn$")
    public void iClickOnNoInjuryCausedArmedForcesBtn() {
        warPensioner.clickOnNoInjuryCausedByArmedFores();
    }

    @And("^I click on injury caused by armed forced page next btn$")
    public void iClickOnInjuryCausedByArmedForcedPageNextBtn() {
        warPensioner.clickOnWarPensionerPageNext();
    }

    @Then("^I can see do you have diabetes page$")
    public void iCanSeeDoYouHaveDiabetesPage() {
    }

    @When("^I click on no diabetes btn$")
    public void iClickOnNoDiabetesBtn() {
        diabetesPage.clickOnDiabetesNoBtn();
    }

    @And("^I click on diabetes page next btn$")
    public void iClickOnDiabetesPageNextBtn() {
        diabetesPage.clickOnDiabetesPageNextBtn();
    }

    @Then("^I can see do you or family member have glaucoma page$")
    public void iCanSeeDoYouOrFamilyMemberHaveGlaucomaPage() {
    }

    @When("^I click on have glaucoma no btn$")
    public void iClickOnHaveGlaucomaNoBtn() {
        glaucomaPage.clickOnHaveGlaucomaNoBtn();
    }

    @And("^I click on have glaucoma page next btn$")
    public void iClickOnHaveGlaucomaPageNextBtn() {
        glaucomaPage.clickOnHaveGlaucomaPageNextBtn();
    }

    @Then("^I can see do you live in a care home page$")
    public void iCanSeeDoYouLiveInACareHomePage() {
    }

    @When("^I click on live in care home no btn$")
    public void iClickOnLiveInCareHomeNoBtn() {
        careHomePage.clickOnLiveInCareHomeNoBtn();
    }

    @And("^click on live in a care home page next btn$")
    public void clickOnLiveInACareHomePageNextBtn() {
        careHomePage.clickOnLiveInCareHomePageNextBtn();
    }

    @Then("^I can see do you have savings page$")
    public void iCanSeeDoYouHaveSavingsPage() {
    }

    @When("^I click on savings no btn$")
    public void iClickOnSavingsNoBtn() {
        savingsPage.clickOnDoYouHaveSavingsNoBtn();
    }

    @And("^click on savings page next btn$")
    public void clickOnSavingsPageNextBtn() {
        savingsPage.clickOnSavingsPageNextBtn();
    }


    @Then("^I can see \"([^\"]*)\"$")
    public void iCanSee(String message) {
        Assert.assertTrue(resultPage.youGetHelpWithNHSCostMessage().contains(message), "Unable to see You get help with NHS costs");
    }
}
