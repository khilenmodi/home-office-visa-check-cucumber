package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(id = "response")
    WebElement selectNationality;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickOnContinueButton;

    public void setSelectNationality(String Nationality){
        selectByVisibleTextFromDropDown(selectNationality,Nationality);
    }

    public void setClickOnContinueButton(){
        clickOnElement(clickOnContinueButton);
    }
}
