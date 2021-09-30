import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Proiect {
    static String browser;
    static WebDriver driver;
    static WebElement butonReadMeUnu;

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
        driver.get("homePageUrl");
        butonReadMeUnu = driver.findElement(By.xpath("(//a[contains(@class, 'selenium-button') and contains(text(), 'Read more')])[1]"));
        butonReadMeUnu.click();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            // just waiting a bit
        }
        driver.quit();
    }
}