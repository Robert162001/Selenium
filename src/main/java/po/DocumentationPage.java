package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocumentationPage extends BasePage {
    private WebDriver webDriver;

    private final By pythonButton = By.xpath("//a[contains(@class, 'tab-Python')]");

    public DocumentationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOnPythonButton() {
        clickWhenReady(webDriver, pythonButton);
    }

}
