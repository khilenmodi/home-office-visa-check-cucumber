package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.StartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }
    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().setClickStartNow();
    }

}


