package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dropDownsSimple {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
//        maximize the window
        driver.manage().window().maximize();
//take me to the url
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php#");

        WebElement DD = driver.findElement(By.xpath("//div[@id='dream_fruits']"));

        DD.click();

        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));


        for (WebElement option : allOptions) {
            if (option.getText().equals("Mango")) {
                option.click();
            }
            ;
        }
    }
}
