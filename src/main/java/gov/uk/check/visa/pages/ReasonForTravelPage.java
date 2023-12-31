package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public ReasonForTravelPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickContinue;

    public void setClickContinue(){
        clickOnElement(clickContinue);
    }

    public void selectReasonForVisit(String reason) {
        // List<WebElement> allOptions = reasonForVisitList;
        for (WebElement options : reasonForVisitList) {
            if (options.getText().equalsIgnoreCase(reason)) {
                clickOnElement(options);
                break;
            }
        }
    }
}
