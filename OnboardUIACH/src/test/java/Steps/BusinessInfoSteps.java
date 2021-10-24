package Steps;

import Pages.BusinessInformationPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


public class BusinessInfoSteps {
    @Page
    BusinessInformationPage businessInformationPage;

    @Step
    public void verifyHeaderText(String sValue) throws InterruptedException {
        businessInformationPage.verifyHeaderText(sValue);
    }

    @Step
    public void EnterBusinessInformationDetails(String address, String address_line2, String city, String state, String zip_code, String website_url) throws InterruptedException {
        businessInformationPage.EnterBusinessInformationDetails(address,address_line2,city,state,zip_code,website_url);
    }

    @Step
    public void verifyBusinessInfoCircel() {
        businessInformationPage.verifyBusinessInfoCircle();
    }

    @Step
    public void verifyNextButton() {
        businessInformationPage.verifyNextButton();
    }
}
