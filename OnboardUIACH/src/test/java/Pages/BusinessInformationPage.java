package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import utilities.SeleniumUtils;

public class BusinessInformationPage extends SeleniumUtils {

    @FindBy(xpath="//div[@class='headline']/div")
    public WebElementFacade txt_Headline;

    @FindBy(id="address_line1")
    public WebElementFacade txt_Address;

    @FindBy(id="address_line2")
    public WebElementFacade txt_Addressline2;

    @FindBy(id="city")
    public WebElementFacade txt_City;

    @FindBy(xpath="//div[@id='react-select-2--value']")
    public WebElementFacade cmb_State;

    @FindBy(xpath="//div[@id='react-select-2--value']//input")
    public WebElementFacade cmb_State_value;

    @FindBy(id="postal_code")
    public WebElementFacade txt_postCode;

    @FindBy(id="website_url")
    public WebElementFacade txt_website_url;

    @FindBy(xpath="//div[@class='circle filled'][@title='Business information']")
    public WebElementFacade businessInfoCompleted;

    @FindBy(xpath="//button[@class='button next-button']")
    public WebElementFacade btnNext;

    public String sStatesDiv = "//div[@class='Select-menu-outer']/*[1]";

    SeleniumUtils oSeleniumUtils;


    public void verifyHeaderText(String sExpectedValue) throws InterruptedException {
        Thread.sleep(4000);
        String sActualValue = get_TextFrom_Webelement(txt_Headline);
        Assert.assertEquals(sExpectedValue,sActualValue);
        oSeleniumUtils.highlightElement(txt_Headline);
        oSeleniumUtils.removehighlightElement(txt_Headline);

    }

    public void EnterBusinessInformationDetails(String address, String address_line2, String city, String state, String zip_code, String website_url) throws InterruptedException {
        Enter_given_Text_Element(txt_Address,address);
        Enter_given_Text_Element(txt_Addressline2,address_line2);
        Enter_given_Text_Element(txt_City,city);
        clickGivenElement(cmb_State);
        Enter_given_Text_Element(cmb_State_value,state);
        Thread.sleep(2000);
        clickGivenXpath(sStatesDiv);
        clickGivenElement(cmb_State);
        Enter_given_Text_Element(txt_postCode,zip_code);
        Enter_given_Text_Element(txt_website_url,website_url);
    }

    public void verifyBusinessInfoCircle() {
        isElementDisplayed(businessInfoCompleted);
    }

    public void verifyNextButton() {
        Assert.assertTrue("Next button status enabled ",isElementEnabled(btnNext));
    }
}
