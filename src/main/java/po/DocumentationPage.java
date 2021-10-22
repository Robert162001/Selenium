package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.Helpers.generateRandomNumber;

public class DocumentationPage extends BasePage {
    private final WebDriver webDriver;

    public DocumentationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final By javaButton = By.xpath("//a[contains(@id, 'tabs-1-0-tab')]");
    private final By pythonButton = By.xpath("//a[contains(@id, 'tabs-1-1-tab')]");
    private final By cSharpButton = By.xpath("//a[contains(@id, 'tabs-1-2-tab')]");
    private final By rubyButton = By.xpath("//a[contains(@id, 'tabs-1-3-tab')]");
    private final By javaScriptButton = By.xpath("//a[contains(@id, 'tabs-1-4-tab')]");
    private final By kotlinButton = By.xpath("//a[contains(@id, 'tabs-1-5-tab')]");


    public enum Tabs {
        JAVA, PYTHON, CSHARP, RUBY, JAVASCRIPT, KOTLIN
    }

    public boolean isTabActive(Tabs tab) {
        boolean isTabActive;
        switch (tab) {
            case JAVA:
                isTabActive = webDriver.findElement(javaButton).getAttribute("aria-selected").equalsIgnoreCase("true");
                break;
            case PYTHON:
                isTabActive = webDriver.findElement(pythonButton).getAttribute("aria-selected").equalsIgnoreCase("true");
                break;
            case CSHARP:
                isTabActive = webDriver.findElement(cSharpButton).getAttribute("aria-selected").equalsIgnoreCase("true");
                break;
            case RUBY:
                isTabActive = webDriver.findElement(rubyButton).getAttribute("aria-selected").equalsIgnoreCase("true");
                break;
            case JAVASCRIPT:
                isTabActive = webDriver.findElement(javaScriptButton).getAttribute("aria-selected").equalsIgnoreCase("true");
                break;
            case KOTLIN:
                isTabActive = webDriver.findElement(kotlinButton).getAttribute("aria-selected").equalsIgnoreCase("true");
                break;

            default:
                throw new IllegalArgumentException(tab + " does not exist");
        }
        return isTabActive;
    }


    public void clickOnButtons(Tabs tabs) {
        switch (tabs) {
            case JAVA:
                clickWhenReady(webDriver, javaButton);
                break;
            case PYTHON:
                clickWhenReady(webDriver, pythonButton);
                break;
            case CSHARP:
                clickWhenReady(webDriver, cSharpButton);
                break;
            case RUBY:
                clickWhenReady(webDriver, rubyButton);
                break;
            case JAVASCRIPT:
                clickWhenReady(webDriver, javaScriptButton);
                break;
            case KOTLIN:
                clickWhenReady(webDriver, kotlinButton);
                break;

            default:
                throw new IllegalArgumentException(tabs + " does not exist");

        }

    }

    public void clickOnRandomTab() {
        int clickTab = generateRandomNumber(0, 5);
        webDriver.findElement(locatorTab(clickTab)).click();
    }

    public By locatorTab(int tabNumber) {
        return By.xpath("//a[@id='tabs-1-" + tabNumber + "-tab']");
    }
}
