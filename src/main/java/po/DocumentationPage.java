package po;

import jdk.dynalink.linker.LinkerServices;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

import static utils.Helpers.generateRandomNumber;

public class DocumentationPage extends BasePage {
    private final WebDriver webDriver;

    public DocumentationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final By javaButton = locatorTab(0);
    private final By pythonButton = locatorTab(1);
    private final By cSharpButton = locatorTab(2);
    private final By rubyButton = locatorTab(3);
    private final By javaScriptButton = locatorTab(4);
    private final By kotlinButton = locatorTab(5);
    private int whichTabWasClicked;

    List<Tabs> tabsList = new ArrayList<>() {{
        add(Tabs.JAVA);
        add(Tabs.PYTHON);
        add(Tabs.CSHARP);
        add(Tabs.RUBY);
        add(Tabs.JAVASCRIPT);
        add(Tabs.KOTLIN);
    }};


    public enum Tabs {
        JAVA, PYTHON, CSHARP, RUBY, JAVASCRIPT, KOTLIN
    }

    public By locatorTab(int tabNumber) {
        return By.xpath("//a[@id='tabs-1-" + tabNumber + "-tab']");
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
        whichTabWasClicked = generateRandomNumber(0, 5);
        webDriver.findElement(locatorTab(whichTabWasClicked)).click();
    }

    public Tabs getWhichTabWasClicked() {
        return tabsList.get(whichTabWasClicked);
    }
}
