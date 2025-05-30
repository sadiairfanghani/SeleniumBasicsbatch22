package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        //take me to the url
        driver.get("https://syntaxprojects.com/keypress.php");

        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        textBox.sendKeys(Keys.ENTER);


    }
}