package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.DurationOfStayPage;
import io.cucumber.java.en.And;

public class DurationOfStaySteps {



    @And("Select intendent to stay for {string}")
    public void selectIntendentToStayForLongerThanMonths(String more) {
                new DurationOfStayPage().selectLengthOfStay(more);
    }

    @And("Click next step button")
    public void clickNextStepButton()throws InterruptedException {
        Thread.sleep(3000);
        new DurationOfStayPage().clickNextStepButton();
    }


}
