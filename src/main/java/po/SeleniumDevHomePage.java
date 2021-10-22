package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SeleniumDevHomePage extends BasePage {
    private WebDriver webDriver;
    private SeleniumIde seleniumIde;

    public SeleniumDevHomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //Page Locators
    private final String homePageUrl = "https://www.selenium.dev";
    private final By readMeButtons = By.xpath("//a[contains(@class, 'selenium-button') and contains(text(), 'Read more')]");
    private final By docButton = By.xpath("//a[contains(@href, '/documentation') and contains(@class, 'nav-link')]");
    private final By aboutButton = By.xpath("//a[contains(@class, 'nav-link dropdown-toggle') and contains(text(), 'About')]");
    private final By sponsorsButton=By.xpath("//a[contains(@href, '/sponsors') and contains(@class, 'dropdown-item')]");

    public void navigateTo() {
        webDriver.navigate().to(homePageUrl);
    }

    public SeleniumIde clickOnReadMeButton(int whichButton) {
        if (whichButton > 3) {
            throw new IllegalArgumentException("Sunt doar 3 butoane ba");
        }
        webDriver.findElements(readMeButtons).get(whichButton).click();
        return new SeleniumIde(webDriver);
    }

    public DocumentationPage clickOnDocumentationLink() {
        clickWhenReady(webDriver, docButton);
        return new DocumentationPage(webDriver);
    }




}
