package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        maximize the window
        driver.manage().window().maximize();
//take me to the url
        driver.get("https://syntaxprojects.com/upload-image.php");

        WebElement chooseFile = driver.findElement(By.id("image-file"));

        // replace this path any file
        chooseFile.sendKeys("/Users/fahadghani/Desktop//Screenshot 2025-04-05 at 1.38.25 PM.png");

       // WebElement chooseBtn = driver.findElement(By.id("upload-dialog"));
        //chooseBtn.sendKeys("/Users/fahadghani/Desktop");
    }

    }

