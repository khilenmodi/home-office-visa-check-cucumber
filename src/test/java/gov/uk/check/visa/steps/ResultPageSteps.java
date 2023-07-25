package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.ResultPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ResultPageSteps {

    @Then("verify result {string}")
    public void verifyResult(String result) {
        Assert.assertEquals(new ResultPage().setVerifyResult(),result,"You will not need a visa to come to the UK");
    }

    @Then("verify  a result {string}")
    public void verifyAResultYouNeedAVisaToWorkInHealthAndCare(String result) {
        Assert.assertEquals(new ResultPage().setVerifyResult1(),result,"You will need a visa to come to the UK");
    }

    @Then("verify The result {string}")
    public void verifyTheResultYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUK(String result) {
        Assert.assertEquals(new ResultPage().setVerifyResult2(),result,"You’ll need a visa to join your family or partner in the UK");
    }
}
