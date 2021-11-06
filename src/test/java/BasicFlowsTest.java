import org.testng.Assert;
import org.testng.annotations.Test;
import po.DocumentationPage;

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
        documentationPage.clickOnButtons(DocumentationPage.Tabs.PYTHON);
        Assert.assertTrue(documentationPage.isTabActive(PYTHON));
    }

    @Test
    public void clickRandomTest() {
        seleniumDevHomePage.clickOnDocumentationLink();
        documentationPage.clickOnRandomTab();
        Assert.assertTrue(documentationPage.isTabActive(documentationPage.getWhichTabWasClicked()));
    }

    @Test
    public void clickOnSponsorsPageTest() {
        String pageTitle = "Sponsors";
        seleniumDevHomePage.clickOnSponsorsPage();
        Assert.assertTrue(getWebDriver().getCurrentUrl().contains("sponsors/"));
        Assert.assertTrue(getWebDriver().getTitle().contains(pageTitle));
    }

    @Test
    public void countSponsorsTest() {
        seleniumDevHomePage.clickOnSponsorsPage();
        int actual = sponsorsPage.getNumberOfSponsors();
        int expected = 7;
        Assert.assertEquals(expected, actual);
    }


}
