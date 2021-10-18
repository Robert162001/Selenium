import org.testng.Assert;
import org.testng.annotations.Test;

import static po.DocumentationPage.Tabs.JAVA;
import static po.DocumentationPage.Tabs.PYTHON;

public class BasicFlowsTest extends BaseTest {

    @Test
    public void navigateTest() {
        Assert.assertTrue(getWebDriver().getCurrentUrl().contains("https://www.selenium.dev"));
    }

    @Test
    public void clickOnReadTest() {
        String pageTitle = "Selenium IDE · Open source record and playback test automation for the web";
        seleniumDevHomePage.clickOnReadMeButton(1);
        Assert.assertTrue(getWebDriver().getCurrentUrl().contains("selenium-ide/"));
        Assert.assertTrue(getWebDriver().getTitle().contains(pageTitle));
    }

    @Test
    public void clickOnDocumentationTest() {
        String pageTitle = "The Selenium Browser Automation Project";
        seleniumDevHomePage.clickOnDocumentationLink();
        Assert.assertTrue(getWebDriver().getCurrentUrl().contains("documentation/"));
        Assert.assertTrue(getWebDriver().getTitle().contains(pageTitle));

    }

    @Test
    public void clickOnPythonTest() {
        seleniumDevHomePage.clickOnDocumentationLink();
        documentationPage.clickOnPythonButton();
        Assert.assertTrue(documentationPage.isButtonActive(PYTHON));
    }
}
