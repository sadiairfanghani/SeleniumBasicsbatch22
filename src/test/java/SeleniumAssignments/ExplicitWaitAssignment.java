package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //  maximize the window
        driver.manage().window().maximize();

        //take me to the url
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");

        //**Change Text**:
        //Click on the button **"Click me to change text!"
        WebElement ClickBTN= driver.findElement(By.xpath("//button[@id=\"changetext_button\"]"));
        ClickBTN.click();
        // Wait until the text changes to **"Ssyntaxtechs"**, then print the text **"Ssyntaxtechs"** on the console
        //wait until the text is change
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id=\"headingtext\"]"),"Ssyntaxtechs"));
        WebElement textChange= driver.findElement(By.xpath("//h2[@id=\"headingtext\"]"));
        System.out.println(textChange.getText());


        //Enable Button**: Click on the button **"Click me to enable button"**.
        WebElement EnableBTN= driver.findElement(By.xpath("//button[@id=\"enable_button\"]"));
        EnableBTN.click();
        //   Wait for the button to be enabled, and once it's enabled, click on it
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/div/button")));
        WebElement Enableclick= driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/div/button"));
        Enableclick.click();
        System.out.println("Button is Enabled and Clicked ");

        //Checkbox Checked Based on Click**: Click on the button **"Click me to check the checkbox"**.
        WebElement ClickMe= driver.findElement(By.xpath("//button[@id=\"checkbox_button\"]"));
        ClickMe.click();
        // Wait for the checkbox to be checked, then print the status of **isSelected** on the console to verify if the checkbox is enabled.
        wait.until((ExpectedConditions.elementToBeSelected(By.xpath("//input[@id=\"checkbox\"]"))));
        WebElement Checkbox= driver.findElement(By.xpath("//input[@id=\"checkbox\"]"));
        Checkbox.isSelected();
        System.out.println("the checkbox is selected " +Checkbox.isEnabled());


    }
}
