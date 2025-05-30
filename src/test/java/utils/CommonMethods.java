package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class CommonMethods {

    public static WebDriver driver;
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

    public static void closeBrowser(){
        driver.quit();
    }

}
