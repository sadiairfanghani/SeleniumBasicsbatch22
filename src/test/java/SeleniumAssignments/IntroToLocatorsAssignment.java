package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroToLocatorsAssignment {
    public static void main(String[] args) {
        // declare the instance
        WebDriver driver=new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();

        // navigate to www.syntax projects.com/locator-homework.php
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        // Locators for the form elements and input data
        WebElement fullname= driver.findElement(By.id("fullName"));
        fullname.sendKeys("Jhon Doe");

        WebElement email= driver.findElement(By.name("yourEmail"));
        email.sendKeys("jhondoe123.com");

        WebElement clientname= driver.findElement(By.id("clientNameId"));
        clientname.sendKeys("Jhon doe");

        WebElement clientid= driver.findElement(By.id("ClientId"));
        clientid.sendKeys("444");

        WebElement feedback= driver.findElement(By.id("ClientfeedbackId"));
        feedback.sendKeys("Completed");

        WebElement projectname= driver.findElement(By.id("ProjectNameId"));
        projectname.sendKeys("Syntax Selenium");

        WebElement projectdeadline= driver.findElement(By.id("ProjectTimeId"));
        projectdeadline.sendKeys("Aprill 30");

        WebElement adress= driver.findElement(By.name("CurrentAddress"));
        adress.sendKeys("New York, Long island");

        WebElement Padress= driver.findElement(By.name("PermanentAddress"));
        Padress.sendKeys("New York, Long island");

        // click on the first link

        WebElement link1=driver.findElement(By.linkText("Click Here."));
        link1.click();

        System.out.println(" New tab opened Successfully for the link ");


        // press the button submit
        WebElement submitbtn=driver.findElement(By.tagName("submit"));
        submitbtn.click();

    }
}
