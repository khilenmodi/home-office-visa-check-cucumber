package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import io.cucumber.java.en.And;

public class SelectNationalitySteps {


    @And("Select a Nationality {string}")
    public void selectANationality(String Nationality) {
        new SelectNationalityPage().setSelectNationality(Nationality);
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        new SelectNationalityPage().setClickOnContinueButton();
    }


}


