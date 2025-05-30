package LiveClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagnameLocator {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");

        List<WebElement> allTags = driver.findElements(By.tagName("a"));

//         is to get the link out from each webelement in the list
        for(WebElement tag:allTags){
            String link = tag.getAttribute("href");
            System.out.println(link);
        }

    }
}