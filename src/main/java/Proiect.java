import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Proiect {
    static String browser;
    static WebDriver driver;
    private SeleniumDevHomePage seleniumDevHomePage;
    private ReadMePage readMePage;

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
        ReadMePage readMePage= new ReadMePage(driver);
        seleniumDevHomePage.navigateTo();
       try {
            Thread.sleep(5000);
        } catch (Exception e) {
           // just waiting a bit
       }
        seleniumDevHomePage.clickOnReadMeButton(2);
        readMePage.Scroll();


        driver.quit();
    }
}