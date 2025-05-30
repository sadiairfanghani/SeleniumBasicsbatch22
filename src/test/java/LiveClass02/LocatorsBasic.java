package LiveClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsBasic {
    public  static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/input-form-locator.php");

        WebElement firstNameTextBox = driver.findElement(By.id("first_name"));
        firstNameTextBox.sendKeys("john");

        WebElement lastNameTextBox = driver.findElement(By.name("last_name"));
        lastNameTextBox.sendKeys("Doe");


        WebElement emailTextBox = driver.findElement(By.className("form-control-01"));
        emailTextBox.sendKeys("moazzam94@gmail.com");


        WebElement submitButton = driver.findElement(By.id("submit_button"));
        submitButton.click();

        WebElement clickhere = driver.findElement(By.linkText("Click Here."));

//        WebElement clickhere1 = driver.findElement(By.partialLinkText("Click"));

//        driver.findElement(By.tagName("input"));






    }
}
