package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    public WorkTypePage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'govuk-radios']//label")
    List<WebElement> jobList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement selectContinue;



    public void setSelectContinue(){
        clickOnElement(selectContinue);
    }
    public void selectJob(String reason) {
        // List<WebElement> allOptions = reasonForVisitList;
        for (WebElement options : jobList) {
            if (options.getText().equalsIgnoreCase(reason)) {
                clickOnElement(options);
                break;
            }
        }
    }
}
