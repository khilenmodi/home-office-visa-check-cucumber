package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage(){
        PageFactory.initElements(driver,this);
    }


    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement verifyResult;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement verifyResult1;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement verifyResult2;

    public String setVerifyResult(){
        return getTextFromElement(verifyResult);
    }

    public String setVerifyResult1(){
        return getTextFromElement(verifyResult1);
    }
    public String setVerifyResult2(){
        return getTextFromElement(verifyResult2);
    }
}

