package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import utilities.SeleniumUtils;

import static utilities.GenericUtils.Verify;

public class StartAppPage extends SeleniumUtils {

    @FindBy(xpath="//img[@alt='logo']")
    public WebElementFacade logo_bambora;

    @FindBy(xpath="//input[@name='consent'][@value='true']/preceding-sibling::i")
    public WebElementFacade opt_yes;

    @FindBy(xpath="//button[contains(@class,'create-account-button')]")
    public WebElementFacade btn_BeginApplication;

    public String Span_with_text="//span[text()='value']";

    SeleniumUtils oSeleniumUtils;

    public void verifyBamboraLogo() {
       boolean bStatus = oSeleniumUtils.isElementDisplayed(logo_bambora);
       if(!bStatus){
           Assert.assertFalse("logo bambora is not displayed in Start application page",bStatus);
       }
        oSeleniumUtils.highlightElement(logo_bambora);
        oSeleniumUtils.removehighlightElement(logo_bambora);
        Assert.assertTrue("logo bambora is displayed in Start application page",bStatus);
    }

    public void veifyBenginApplicationBtn(String btnStatus) {
        boolean bStatus = false;
        oSeleniumUtils.highlightElement(btn_BeginApplication);
        oSeleniumUtils.removehighlightElement(btn_BeginApplication);
        if(btnStatus.equalsIgnoreCase("disabled")){
            bStatus = oSeleniumUtils.isElementEnabled(btn_BeginApplication);
            if(!bStatus){
                Assert.assertFalse("Begin Application button is in disabled mode",bStatus);
            }else{
                Assert.assertFalse("Begin Application button is in enabled mode",bStatus);
            }
        }else{
            bStatus = oSeleniumUtils.isElementEnabled(btn_BeginApplication);
            if(!bStatus){
                Assert.assertTrue("Begin Application button is in disabled mode", bStatus);
            }else{
                Assert.assertTrue("Begin Application is in enabled mode",bStatus);
            }
        }
    }

    public void selectConsetApplication(String yes_or_no) {
        if(yes_or_no.contains("Yes")){
            clickGivenElement(opt_yes);
        }

    }

    public void clickOnGivenValue(String sValue) {
        clickGivenXpath(StringUtils.replace(Span_with_text, "value", sValue));
    }
}
