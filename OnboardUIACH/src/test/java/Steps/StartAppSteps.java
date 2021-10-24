package Steps;

import Pages.StartAppPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class StartAppSteps {
    @Page
    StartAppPage startAppPage;

    @Step
    public void LaunchApplication(String sURL) {
        getDriver().manage().window().maximize();
        getDriver().get(sURL);
    }

    @Step
    public void verifyBamboraLogo() {
        startAppPage.verifyBamboraLogo();
    }

    @Step
    public void verifyBeginApplicationBtn(String btnStatus) {
        startAppPage.veifyBenginApplicationBtn(btnStatus);
    }

    @Step
    public void selectConsetApplication(String yes_or_no) {
        startAppPage.selectConsetApplication(yes_or_no);
    }

    @Step
    public void clickOnGivenValue(String sValue) {
        startAppPage.clickOnGivenValue(sValue);
    }
}
