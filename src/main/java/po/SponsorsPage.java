package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SponsorsPage extends BasePage {
    private final WebDriver webDriver;

    public SponsorsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public int getNumberOfSponsors() {
        return webDriver.findElements(By.xpath("(//div[contains(@class, 'pt-4')])[1]/div")).size();
    }
}
