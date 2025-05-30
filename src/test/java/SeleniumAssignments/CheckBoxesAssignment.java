package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesAssignment {
    public static void main(String[] args) throws InterruptedException {
        // object
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        // navigate the browser
        driver.navigate().to("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        //Subscribe to Newsletter:
        //Check if the "Subscribe to Newsletter" checkbox is enabled, and then click on it
        WebElement NewsCheckbox = driver.findElement(By.xpath("//input[@id='newsletter']"));
        NewsCheckbox.isEnabled();
        if (NewsCheckbox.isEnabled()) {
            NewsCheckbox.click();
        }
        System.out.println("checkbox is enabled and Clicked ");

        //Select Your Hobbies
        // Retrieve the list of all checkboxes in the **Select Your Hobbies** section.
        List<WebElement> ListCheckboxes = driver.findElements(By.xpath("//input[@class='cb-element']"));
        // Traverse through the list and select the **Reading** and **Cooking** checkboxes.

            WebElement readingCheckbox=driver.findElement(By.xpath("//input[@id='reading']"));
            readingCheckbox.click();
            WebElement CookingCheckbox= driver.findElement(By.xpath("//*[@id='cooking']"));
            CookingCheckbox.click();
        System.out.println("Reading & Cooking CheckBoxes are Enabled and Selected");

            //Select Your Interests:
            // Verify that the **Support** and **Music** checkboxes are not displayed by default.
            WebElement showButton = driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
            // Click on the "Show Checkboxes" button, and then select the **Music** checkbox.

            WebElement sportRB = driver.findElement(By.xpath("//input[@value='Support']"));
            WebElement musicRB = driver.findElement(By.xpath("//input[@value='Music']"));
            if(!sportRB.isDisplayed() &&  !musicRB.isDisplayed()){
            }
//           click on show
                showButton.click();
//           click on the options music and sport
                Thread.sleep(3000);
                musicRB.click();
        System.out.println("Music checkbox is enabled and selected ");

        //Preferences:
        // Verify that the **Receive Notifications** checkbox is disabled
        WebElement ReceiveNotifications= driver.findElement(By.xpath("//*[@id='enabledcheckbox']"));
        System.out.println(" Receive Notifications checkbox is disabled by default.");
        // Click on the "Enable Checkboxes" button,
        //Preferences:
        // Verify that the **Receive Notifications** checkbox is disabled

        WebElement ReceiveNotificationsDS= driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        System.out.println(" Receive Notifications checkbox is disabled by default.");

        // Click on the "Enable Checkboxes" button,
        WebElement EnableRN= driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        ReceiveNotifications.click();
        Thread.sleep(1000);
        WebElement ReceiveNotificationsUpdate= driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));

        //   select the Receive Notifications checkbox
        if (ReceiveNotificationsUpdate.isEnabled()){
            EnableRN.click();
            System.out.println(" Enable Checkboxes button is Enables and Clicked");
        }

    }
        }

