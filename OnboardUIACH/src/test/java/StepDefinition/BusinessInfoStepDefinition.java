package StepDefinition;

import Steps.BusinessInfoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;


public class BusinessInfoStepDefinition {

    @Managed
    WebDriver driver;

    @Steps
    BusinessInfoSteps businessInfoSteps;

    @Then("user should be able to see the {string}")
    public void user_should_be_able_to_see_the(String sValue) throws InterruptedException {
        businessInfoSteps.verifyHeaderText(sValue);
    }



    @Then("user enter the business information details")
    public void user_enter_the_business_information_details(List<Map<String,String>> values) throws InterruptedException {
        for (Map<String, String> value : values) {
            String address = StringUtils.defaultString(value.get("address"));
            String address_line2 = StringUtils.defaultString(value.get("address_line2"));
            String city = StringUtils.defaultString(value.get("city"));
            String state = StringUtils.defaultString(value.get("state"));
            String zip_code = StringUtils.defaultString(value.get("zip_code"));
            String website_url = StringUtils.defaultString(value.get("website_url"));
            businessInfoSteps.EnterBusinessInformationDetails(address,address_line2,city,state,zip_code,website_url);
        }
    }

    @Then("Next button should be enabled")
    public void Next_button_should_be_enabled() {
        businessInfoSteps.verifyNextButton();
    }

    @Then("Business information circle should be filled")
    public void business_information_circle_should_be_filled() {
      businessInfoSteps.verifyBusinessInfoCircel();
    }


}
