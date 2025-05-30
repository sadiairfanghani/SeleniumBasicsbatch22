package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaits {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        maximize the window
        driver.manage().window().maximize();
//take me to the url
        driver.get("https://syntaxprojects.com/synchronization-waits.php");


//        click on the first button
//        get the text and print it on the screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement b1 = driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        b1.click();

        WebElement text1 = driver.findElement(By.xpath("//p[contains(text(),'Hello, ')]"));
        System.out.println(text1.getText());


    }
}
