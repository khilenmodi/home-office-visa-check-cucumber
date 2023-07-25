package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.ReasonForTravelPage;
import io.cucumber.java.en.And;

public class VisaCatagorySteps {



    @And("Select  a reason {string}")
    public void selectAReasonWorkAcademicVisitOrBusiness(String reason) {
        new ReasonForTravelPage().selectReasonForVisit(reason);

    }
   

    @And("select Continue button")
    public void selectContinueButton() {
        new ReasonForTravelPage().setClickContinue();
    }



}


