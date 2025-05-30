package SeleniumPractice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
//        maximize the window
        driver.manage().window().maximize();
//take me to the url
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

// Cast the driver to TakesScreenshot
        TakesScreenshot ss=(TakesScreenshot) driver;
        //TakesScreenshot scrShot = (TakesScreenshot) driver;

//        takes the screenshot
        //File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
       File screenshot = ss.getScreenshotAs(OutputType.FILE);

// Copy the screenshot to desired location using copyFile method
       // FileUtils.copyFile(srcFile, new File("ss/screenshot.png"));
        FileUtils.copyFile(screenshot,new File("screenshot/image.png"));


    }
}
