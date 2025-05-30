package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        // declare the instance
        WebDriver driver=new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();


        // navigate to syntax projects
        driver.get("https://syntaxprojects.com/input-form-locator.php");
        // send the first name to the text box

        WebElement firstname=driver.findElement(By.id("first_name"));
        firstname.sendKeys("john");

        //send the last name
        WebElement lastname= driver.findElement(By.name("last_name"));
        lastname.sendKeys("doe");

        // send email


        WebElement email=driver.findElement(By.className("form-control-01"));
        email.sendKeys("john@doe.com");

        // press the button submit

        WebElement submitBtn=driver.findElement(By.tagName("button"));
        submitBtn.click();
// click on the first link

        WebElement link1=driver.findElement(By.linkText("Click Here."));
        link1.click();

        // click on 2nd link

      WebElement  link2= driver.findElement(By.partialLinkText("Link"));
      link2.click();



    }
}
