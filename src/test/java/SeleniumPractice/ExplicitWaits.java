package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaits {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        maximize the window
        driver.manage().window().maximize();
//take me to the url
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");


//       locate the aleert btn
        WebElement alertBtn = driver.findElement (By.xpath("//button[@id='show_alert']"));
        alertBtn.click();
//        declaration
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();

//        click on the button to display the other button and click on it once it is displayed


        WebElement B1 = driver.findElement(By.xpath("//button[@id='display_button']"));
        B1.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enabled']")));

        WebElement B2 = driver.findElement(By.xpath("//button[text()='Enabled']"));
        B2.click();


        WebElement buttonCB = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        buttonCB.click();

        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));

        WebElement cb1 = driver.findElement(By.xpath("//input[@id='checkbox']"));

        System.out.println("the checkbox is selected "+ cb1.isSelected());

    }
}
