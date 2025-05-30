package LiveClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement input = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"));

        input.sendKeys("hello");

    }
}
