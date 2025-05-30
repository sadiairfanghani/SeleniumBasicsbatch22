package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
  //        maximize the window
        driver.manage().window().maximize();
  //take me to the url
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");

        //1. **Button Click and Checkbox Selection**: Click on the button labeled **"Click me"**.
        WebElement B1= driver.findElement(By.xpath("//button[@id=\"show_text_synchronize_three\"]"));
        B1.click();

        // Use an appropriate wait method to wait until the checkbox options appear.
        // global wait , implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Once the checkboxes are visible, select **Option 1** from the list of checkboxes.
        WebElement Checkbox= driver.findElement(By.xpath("//input[@value=\"Option-1\"]"));
        Checkbox.click();
        System.out.println("Option 1 is Selected ");


    }
}
