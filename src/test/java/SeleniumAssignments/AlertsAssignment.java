package SeleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAssignment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //  maximize the window
        driver.manage().window().maximize();
        //take me to the url
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");

        //Birthday Reminder: Click on the "Birthday Reminder" button.
        WebElement clickBtn = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        Thread.sleep(1000);
        clickBtn.click();
        // When the alert appears, accept the alert.
        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        //Delete Confirmation: Click on the **"Delete File"** button.
        //When the confirmation alert appears, **dismiss** the alert.
        WebElement DeleteFileBtn = driver.findElement(By.xpath("//button[@onclick=\"myConfirmFunction()\"]"));
        Thread.sleep(1000);
        DeleteFileBtn.click();
        Thread.sleep(1000);
        alert.dismiss();
        //Print the status of the action (e.g., "File deletion canceled") that appears on the screen, to the console.
        WebElement Statusaction = driver.findElement(By.xpath("//*[@id=\"confirm-demo\"]"));
        Statusaction.getText();
        System.out.println(Statusaction.getText());

        // Name Collection: Click on the **"Enter Your Name"** button.
        //Accept the alert and provide a name.
        WebElement EnterName = driver.findElement(By.xpath("//button[@onclick=\"myPromptFunction()\"]"));
        //Thread.sleep(1000);
        EnterName.click();
        Thread.sleep(1000);
        alert.sendKeys("Sadia");
        alert.accept();
        // Retrieve the name that appears on the screen UI and print it on the console, verifying that the correct name is displayed.

        WebElement Name= driver.findElement(By.xpath("//p[@id=\"prompt-demo\"]"));
        Name.getText();
        System.out.println(Name.getText());

    }
}
