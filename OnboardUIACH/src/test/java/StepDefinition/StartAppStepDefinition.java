package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import Steps.StartAppSteps;
import java.util.List;
import java.util.Map;


public class StartAppStepDefinition {

    @Managed
    WebDriver driver;

    @Steps
    StartAppSteps startAppSteps;

    @Given("user launch the given test boarding application")
    public void user_launch_the_given_test_boarding_application(List<Map<String,String>> values) {
        for(Map<String,String>value: values){
            String sURL = StringUtils.defaultString(value.get("URL"));
            startAppSteps.LaunchApplication(sURL);
        }
    }

    @Then("bambora log should be displayed")
    public void bambora_log_should_be_displayed() {
        startAppSteps.verifyBamboraLogo();
    }

    @Then("Then Begin Application button should be {string}")
    public void then_begin_application_button_should_be(String btnStatus) {
        startAppSteps.verifyBeginApplicationBtn(btnStatus);
    }

    @When("selects consent application as {string}")
    public void selects_consent_application_as(String yes_OR_no) {
        startAppSteps.selectConsetApplication(yes_OR_no);
    }

    @Then("click on {string}")
    public void click_on(String sValue) {
        startAppSteps.clickOnGivenValue(sValue);
    }




}
