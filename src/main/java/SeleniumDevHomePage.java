import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;


public class SeleniumDevHomePage {
    private WebDriver webDriver;

    //Page Locators
    private final String homePageUrl = "https://www.selenium.dev";
    private final List<By> readMeButtons = Arrays.asList(By.xpath("(//a[contains(@class, 'selenium-button') and contains(text(), 'Read more')])"));

    public SeleniumDevHomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOnReadMeButton(int whichButton) {
        if (whichButton > 3) {
            throw new IllegalArgumentException("Sunt doar 3 butoane ba");
        }
        webDriver.findElement(readMeButtons.get(whichButton)).click();
    }

    public void navigateTo() {
        webDriver.navigate().to(homePageUrl);
    }
}
