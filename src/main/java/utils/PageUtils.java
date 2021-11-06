package utils;

import org.openqa.selenium.*;

public class PageUtils {
    private PageUtils(){}
    public static void scrollPage(WebDriver webDriver) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0, 4000)");
    }
}
