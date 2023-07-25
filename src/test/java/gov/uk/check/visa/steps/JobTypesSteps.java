package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.WorkTypePage;
import io.cucumber.java.en.And;

public class JobTypesSteps {



    @And("Select have planning to work for {string}")
    public void selectHavePlanningToWorkForHealthAndCareProfessional(String jobs) {
        new WorkTypePage().selectJob(jobs);
    }

    @And("Click Continue")
    public void clickContinue() {
        new WorkTypePage().setSelectContinue();
    }


}
