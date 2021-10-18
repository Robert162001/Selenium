package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DocumentationPage extends BasePage {
    private WebDriver webDriver;

    private final By javaButton = By.xpath("//a[contains(@class, 'nav-link tab-Java')]");
    private final By pythonButton = By.xpath("//a[contains(@class, 'nav-link tab-Python')]");
    private final By cSharpButton = By.xpath("//a[contains(@class, 'nav-link tab-CSharp')]");
    private final By rubyButton = By.xpath("//a[contains(@class, 'nav-link tab-Ruby')]");
    private final By javaScriptButton = By.xpath("//a[contains(@class, 'nav-link tab-JavaScript')]");
    private final By kotlinButton = By.xpath("//a[contains(@class, 'nav-link tab-Kotlin')]");

    public boolean isButtonActive(Tabs tab) {
        boolean isButtonActive;
        switch (tab) {
            case PYTHON:
                isButtonActive = webDriver.findElement(pythonButton).getAttribute("aria-selected").equalsIgnoreCase("true");
                break;


            default:
                throw new IllegalArgumentException(tab + " does not exist");
        }
        return isButtonActive;
    }

    public enum Tabs {
        PYTHON, JAVA
    }

    public DocumentationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickOnJavaButton() {
        clickWhenReady(webDriver, javaButton);
    }

    public void clickOnPythonButton() {
        clickWhenReady(webDriver, pythonButton);
    }

    public void clickOncSharpButton() {
        clickWhenReady(webDriver, cSharpButton);
    }

    public void clickOnRubyButton() {
        clickWhenReady(webDriver, rubyButton);
    }

    public void clickOnJavaScriptButton() {
        clickWhenReady(webDriver, javaScriptButton);
    }

    public void clickOnKotlinButton() {
        clickWhenReady(webDriver, kotlinButton);
    }

}
