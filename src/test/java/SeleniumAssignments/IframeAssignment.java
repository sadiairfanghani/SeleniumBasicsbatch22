package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //  maximize the window
        driver.manage().window().maximize();

        //take me to the url
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");
        // Select Age Checkbox:
        // Select the **Age** checkbox.
        // Switch focus to age iframe
        driver.switchTo().frame(1);
        driver.switchTo().frame("checkboxIframe");
        WebElement ageCheckbox= driver.findElement(By.xpath("//input[@value=\"Option-1\"]"));
        ageCheckbox.click();
        // wait
        Thread.sleep(1000);
        System.out.println("Age Checkbox Selected");
        //Select City:
        // Select any city from the dropdown.
        driver.switchTo().defaultContent();
        WebElement iframeElementcity= driver.findElement(By.xpath("//iframe[@id='dropdownIframe']"));
        driver.switchTo().frame(iframeElementcity);
        WebElement DD = driver.findElement(By.xpath("//select [@id='cities']"));
        Select sel=new Select(DD);
        sel.selectByIndex(1);
        System.out.println("City is Selected");
        Thread.sleep(1000);

        // Enter Username:
        // enter your username in the **Username** field
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement userName= driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("SyntaxB22");
        System.out.println("Username entered in the field");
    }
}
