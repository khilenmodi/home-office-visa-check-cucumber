package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.FamilyImmigrationStatusPage;
import io.cucumber.java.en.And;

public class ImmigrationStatusSteps {
    @And("Select state My partner of family member have uk immigration status {string}")
    public void selectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes() throws InterruptedException{
        Thread.sleep(3000);
        new FamilyImmigrationStatusPage().setSelectYes();
    }


    @And("Set Click To Continue")
    public void setClickToContinue() {
        new FamilyImmigrationStatusPage().setClickToContinue();
    }
}
