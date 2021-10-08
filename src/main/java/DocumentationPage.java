import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocumentationPage {
    private WebDriver webDriver;

    private final By docButton = By.xpath("//a[contains(@href, '/documentation') and contains(@class, 'nav-link')]");
    private final By pythonButton = By.xpath("//a[contains(@class, 'tab-Python')]");

    public DocumentationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOndocButton(){
        webDriver.findElement(docButton).click();
    }

    public void clickOnpythonButton(){
        webDriver.findElement(pythonButton).click();
    }

}
