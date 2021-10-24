package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import utilities.SeleniumUtils;

public class BusinessCategoryPage extends SeleniumUtils {

    @FindBy(xpath="//div[@class='headline']/div")
    public WebElementFacade txt_Headline;

    @FindBy(id="dba_name")
    public WebElementFacade txt_businessName;

    @FindBy(id="company_name")
    public WebElementFacade txt_legalbusinessName;

    @FindBy(xpath="//div[@id='react-select-3--value']")
    public WebElementFacade cmb_EntityType;

    @FindBy(xpath="//div[@id='react-select-3--value']//input")
    public WebElementFacade txt_EntityType_value;

    @FindBy(id="registration_location")
    public WebElementFacade txt_reg_location;

    @FindBy(id="business_number")
    public WebElementFacade txt_business_number;

    @FindBy(id="start_date")
    public WebElementFacade txt_start_date;

    @FindBy(id="annual_sales")
    public WebElementFacade txt_annual_sales;

    @FindBy(id="owner_name")
    public WebElementFacade txt_owner_name;

    @FindBy(id="routing_number")
    public WebElementFacade txt_routing_number;

    @FindBy(id="account_number")
    public WebElementFacade txt_account_number;

    @FindBy(xpath="//div[@id='react-select-4--value']")
    public WebElementFacade cmb_ACHFrequency;

    @FindBy(xpath="//div[@id='react-select-4--value']//input")
    public WebElementFacade txt_ACHFrequency_value;

    @FindBy(id="average_amount")
    public WebElementFacade txt_average_amount;

    @FindBy(id="maximum_amount")
    public WebElementFacade txt_maximum_amount;

    @FindBy(xpath="//div[@class='circle filled'][@title='Business category']")
    public WebElementFacade businessCategoryCompleted;

    @FindBy(xpath="//button[@class='button next-button']")
    public WebElementFacade btnNext;

    public String sEntityTypeDiv = "//div[@class='Select-menu-outer']/*[1]";

    SeleniumUtils oSeleniumUtils;

    public void EnterBusinessCategoryDetails(String business_name, String legal_business_name, String entity_type,
                                             String registration_location, String business_number, String business_start_date,
                                             String anual_sales, String bank_acc_name, String bank_routing, String bank_acc,
                                             String ach_frequency, String ach_avg_amount, String ach_max_amount) throws InterruptedException {
        Enter_given_Text_Element(txt_businessName,business_name);
        Enter_given_Text_Element(txt_legalbusinessName,legal_business_name);
        clickGivenElement(cmb_EntityType);
        Enter_given_Text_Element(txt_EntityType_value,entity_type);
        Thread.sleep(2000);
        clickGivenXpath(sEntityTypeDiv);
        Enter_given_Text_Element(txt_reg_location,registration_location);
        Enter_given_Text_Element(txt_business_number,business_number);
        Enter_given_Text_Element(txt_start_date,business_start_date);
        Enter_given_Text_Element(txt_annual_sales,anual_sales);
        Enter_given_Text_Element(txt_owner_name,bank_acc_name);
        Enter_given_Text_Element(txt_routing_number,bank_routing);
        Enter_given_Text_Element(txt_account_number,bank_acc);
        clickGivenElement(cmb_ACHFrequency);
        Enter_given_Text_Element(txt_ACHFrequency_value,ach_frequency);
        Thread.sleep(2000);
        clickGivenXpath(sEntityTypeDiv);
        Enter_given_Text_Element(txt_average_amount,ach_avg_amount);
        Enter_given_Text_Element(txt_maximum_amount,ach_max_amount);

    }

    public void verifyBusinessCategoryCircle() {
        isElementDisplayed(businessCategoryCompleted);
    }

}
