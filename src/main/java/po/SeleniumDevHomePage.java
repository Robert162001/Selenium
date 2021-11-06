package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SeleniumDevHomePage extends BasePage {
    public SeleniumDevHomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final WebDriver webDriver;
    //Page Locators
    private final By readMeButtons = By.xpath("//a[contains(@class, 'selenium-button') and contains(text(), 'Read more')]");
    private final By docButton = By.xpath("//a[contains(@href, '/documentation') and contains(@class, 'nav-link')]");
    private final By aboutButton = By.xpath("//a[contains(@class, 'nav-link dropdown-toggle') and contains(text(), 'About')]");
    private final By sponsorsButton = By.xpath("//a[contains(@href, '/sponsors') and contains(@class, 'dropdown-item')]");
    private static final String HOME_PAGE_URL = "https://www.selenium.dev";

    public void navigateTo() {
        webDriver.navigate().to(HOME_PAGE_URL);
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

    public SponsorsPage clickOnSponsorsPage() {
        clickWhenReady(webDriver, aboutButton);
        clickWhenReady(webDriver, sponsorsButton);
        return new SponsorsPage(webDriver);
    }


}
