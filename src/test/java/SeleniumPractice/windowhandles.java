package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowhandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        maximize the window
        driver.manage().window().maximize();
//take me to the url
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");

        WebElement B1 = driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        WebElement B2 = driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));
        B1.click();
        B2.click();

        String mainPageWH = driver.getWindowHandle();
        System.out.println(" the window handle of the main page is " + mainPageWH);


        Set<String> allHandles = driver.getWindowHandles();

        for (String handle : allHandles) {
            driver.switchTo().window(handle);
            if (driver.getCurrentUrl().equals("https://syntaxprojects.com/b1-page.php")) {
                WebElement textMsg = driver.findElement(By.xpath("//h2"));
                System.out.println(textMsg.getText());
            }
        }
    }
}
