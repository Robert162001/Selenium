package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SeleniumDevHomePage extends BasePage {
    private WebDriver webDriver;
    private SeleniumIde seleniumIde;

    //Page Locators
    private final String homePageUrl = "https://www.selenium.dev";
    private final By readMeButtons = By.xpath("//a[contains(@class, 'selenium-button') and contains(text(), 'Read more')]");
    private final By docButton = By.xpath("//a[contains(@href, '/documentation') and contains(@class, 'nav-link')]");

    public SeleniumDevHomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public SeleniumIde clickOnReadMeButton(int whichButton) {
        if (whichButton > 3) {
            throw new IllegalArgumentException("Sunt doar 3 butoane ba");
        }
        webDriver.findElements(readMeButtons).get(whichButton).click();
        return new SeleniumIde(webDriver);
    }

    public void navigateTo() {
        webDriver.navigate().to(homePageUrl);
    }

    public DocumentationPage clickOnDocumentationLink() {
        clickWhenReady(webDriver, docButton);
        return new DocumentationPage(webDriver);
    }
}
