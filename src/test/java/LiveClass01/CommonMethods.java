package LiveClass01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;
import utils.configReader;

import java.io.IOException;
import java.time.Duration;

import static utils.CommonMethods.driver;

public class CommonMethods {
    public static void openBrowserAndLaunchApplication() throws IOException {

        String browserName = configReader.read(Constants.CONFIG_FILE_PATH, "browser");
        switch (browserName){
            case "Chrome":
                driver = new ChromeDriver();
                break;

            case "FireFox":
                driver=new FirefoxDriver();
                break;

            case "Edge":
                driver=new EdgeDriver();
                break;

            default:
                throw new RuntimeException("Invalid Browser Name");
        }

//        maximize the window
        driver.manage().window().maximize();
//take me to the url
        String url = configReader.read(Constants.CONFIG_FILE_PATH, "url");
        driver.get(url);
    }

    public static void closeBrowser() {
        driver.quit();
    }


    public static void sendText(String text, WebElement element) {
        element.clear();
        element.sendKeys(text);
    }

    public static WebDriverWait getwait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        return wait;
    }

    public static void waitForElementToBeClickable(WebElement element) {
        getwait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void click(WebElement element) {
        waitForElementToBeClickable(element);
        element.click();
    }


    public static void selectFromDropDown(String value, WebElement element) {
        Select sel = new Select(element);
        sel.selectByValue(value);
    }

    public static void selectFromDropDown(WebElement element, String text) {
        Select sel = new Select(element);
        sel.selectByVisibleText(text);
    }


    public static void selectFromDropDown(WebElement element, int index) {
        Select sel = new Select(element);
        sel.selectByIndex(index);

    }
}
