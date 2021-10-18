package utils;

import org.openqa.selenium.*;

import java.util.List;
import java.util.Random;

public class PageUtils {

    public static void scrollPage(WebDriver webDriver) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0, 4000)");
    }
}
