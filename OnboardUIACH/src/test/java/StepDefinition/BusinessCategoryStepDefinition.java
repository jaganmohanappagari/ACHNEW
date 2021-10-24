package StepDefinition;

import Steps.BusinessCategorySteps;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;


public class BusinessCategoryStepDefinition {

    @Steps
    BusinessCategorySteps businessCategorySteps;

    @Then("user enter the business category details")
    public void user_enter_the_business_category_details(List<Map<String,String>> values) throws InterruptedException {
        for (Map<String, String> value : values) {
            String business_name = StringUtils.defaultString(value.get("business_name"));
            String legal_business_name = StringUtils.defaultString(value.get("legal_business_name"));
            String entity_type = StringUtils.defaultString(value.get("entity_type"));
            String registration_location = StringUtils.defaultString(value.get("registration_location"));
            String business_number = StringUtils.defaultString(value.get("business_number"));
            String business_start_date = StringUtils.defaultString(value.get("business_start_date"));
            String anual_sales = StringUtils.defaultString(value.get("anual_sales"));
            String bank_acc_name = StringUtils.defaultString(value.get("bank_acc_name"));
            String bank_routing = StringUtils.defaultString(value.get("bank_routing"));
            String bank_acc = StringUtils.defaultString(value.get("bank_acc"));
            String ach_frequency = StringUtils.defaultString(value.get("ach_frequency"));
            String ach_avg_amount = StringUtils.defaultString(value.get("ach_avg_amount"));
            String ach_max_amount = StringUtils.defaultString(value.get("ach_max_amount"));

            businessCategorySteps.EnterBusinessCategoryDetails(business_name,legal_business_name,entity_type,
                    registration_location,business_number,business_start_date,anual_sales,bank_acc_name,
                    bank_routing,bank_acc,ach_frequency,ach_avg_amount,ach_max_amount);
        }
    }

    @Then("Business category circle should be filled")
    public void business_category_circle_should_be_filled() {
        businessCategorySteps.verifyBusinessCategoryCircel();
    }
}
