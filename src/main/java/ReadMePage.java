import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReadMePage {
    private WebDriver webDriver;

    public ReadMePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void Scroll(){
        JavascriptExecutor js=(JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0, 1000)");
    }
}
