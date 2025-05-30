package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //        maximize the window
        driver.manage().window().maximize();
       //take me to the url
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");


        WebElement alertBtn = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alertBtn.click();
        Thread.sleep(2000);
        Alert alertHandler = driver.switchTo().alert();
        alertHandler.accept();

        WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();
        Thread.sleep(2000);
        alertHandler.dismiss();


    }
}
