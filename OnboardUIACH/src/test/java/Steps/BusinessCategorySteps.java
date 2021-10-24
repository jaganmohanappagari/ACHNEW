package Steps;

import Pages.BusinessCategoryPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class BusinessCategorySteps {

    @Page
    BusinessCategoryPage businessCategoryPagePagePage;

    @Step
    public void EnterBusinessCategoryDetails(String business_name, String legal_business_name, String entity_type, String registration_location, String business_number, String business_start_date, String anual_sales, String bank_acc_name, String bank_routing, String bank_acc, String ach_frequency, String ach_avg_amount, String ach_max_amount) throws InterruptedException {
        businessCategoryPagePagePage.EnterBusinessCategoryDetails(business_name,legal_business_name,entity_type,registration_location,business_number,business_start_date,anual_sales,bank_acc_name,bank_routing,bank_acc,ach_frequency,ach_avg_amount,ach_max_amount);
    }

    @Step
    public void verifyBusinessCategoryCircel() {
        businessCategoryPagePagePage.verifyBusinessCategoryCircle();
    }
}
