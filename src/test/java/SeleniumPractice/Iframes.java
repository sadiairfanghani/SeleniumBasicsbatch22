package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframes {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
//        maximize the window
        driver.manage().window().maximize();
//take me to the url
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");

        driver.switchTo().frame(1);
        driver.switchTo().frame("checkboxIframe");

        WebElement checkbox = driver.findElement(By.xpath("//input[@class='cb1-element']"));
        checkbox.click();
        // driver.switchTo().parentFrame();
        // or

        driver.switchTo().defaultContent();
        WebElement iframeWebElement = driver.findElement(By.xpath("//iframe[@id='dropdownIframe']"));
        driver.switchTo().frame(iframeWebElement);

        WebElement dd = driver.findElement(By.xpath("//select [@id='cities']"));
        Select sel=new Select(dd);
        sel.selectByIndex(2);






    }
}
