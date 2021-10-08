import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Proiect {
    static String browser;
    static WebDriver driver;
    private SeleniumDevHomePage seleniumDevHomePage;
    private ReadMePage readMePage;
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

    public static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // just waiting a bit
        }
    }

    public static void RunTest() {
        SeleniumDevHomePage seleniumDevHomePage = new SeleniumDevHomePage(driver);
        ReadMePage readMePage = new ReadMePage(driver);
        DocumentationPage documentationPage = new DocumentationPage(driver);

        driver.manage().window().maximize();
        seleniumDevHomePage.navigateTo();
        sleep();
        seleniumDevHomePage.clickOnReadMeButton(1);
        sleep();
        readMePage.Scroll();
        sleep();
        seleniumDevHomePage.navigateTo();
        sleep();
        documentationPage.clickOndocButton();
        sleep();
        documentationPage.clickOnpythonButton();
        sleep();

        driver.quit();
    }
}