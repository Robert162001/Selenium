import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import po.DocumentationPage;
import po.SeleniumDevHomePage;
import po.SeleniumIde;
import utils.PageUtils;

public class Proiect {
    static String browser;
    static WebDriver driver;
    private SeleniumDevHomePage seleniumDevHomePage;
    private DocumentationPage documentationPage;

    public static void main(String[] args) {
        setBrowser();
        setBrowserConfig();
        RunTest();
    }

    public static void setBrowser() {
        browser = "Chrome";
    }

    public static void setBrowserConfig() {
        System.setProperty("webdriver.chrome.driver", "/home/robert/mybin/chromedriver");
        driver = new ChromeDriver();
    }

    public static void RunTest() {
        SeleniumDevHomePage seleniumDevHomePage = new SeleniumDevHomePage(driver);

        driver.manage().window().maximize();
        seleniumDevHomePage.navigateTo();
        SeleniumIde seleniumIde = seleniumDevHomePage.clickOnReadMeButton(1);
        PageUtils.scrollPage(driver);
        seleniumDevHomePage.navigateTo();
        DocumentationPage documentationPage = seleniumDevHomePage.clickOnDocumentationLink();
        documentationPage.clickOnPythonButton();

        driver.quit();
    }
}