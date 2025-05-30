package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSAssignment {
    public static void main(String[] args) {
        // declare the instance
        WebDriver driver=new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();

        // navigate to www.syntax projects.com/locator-homework.php
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        //fill in all the text boxes in the form using*CSS selectors,return only one element
        // input and set values
        // user ID
        WebElement useID= driver.findElement(By.cssSelector("input#UserID"));
        useID.sendKeys("SI123");

        // User Name
        WebElement UserName= driver.findElement(By.cssSelector("input#UserName"));
        UserName.sendKeys("Sadia ");

        // Intro to Lecture
        WebElement Lecture= driver.findElement(By.cssSelector("input[name*=LectureIntro"));
        Lecture.sendKeys("Understand CSS selectors,locate elements in Selenium based on CSS attributes ");

        // FeedBack from Ray
        WebElement FeedbackRay= driver.findElement(By.cssSelector("input#FeedbackFromRay"));
        FeedbackRay.sendKeys("Her Understanding is good, improving with Time ");

        // FeedBack from Ducky
        WebElement FeedbackDucky= driver.findElement(By.cssSelector("input#FeedbackfromDucky"));
        FeedbackDucky.sendKeys("Need More Hard Work ");

        // Client ID
        WebElement ClientID= driver.findElement(By.cssSelector("input[name*=ClientID"));
        ClientID.sendKeys("M1314");

        // Email
        WebElement Email= driver.findElement(By.cssSelector("input[name*=email"));
        Email.sendKeys("sadia123@yaho.com");

        // Course Topic
        WebElement CourseTopic= driver.findElement(By.cssSelector("input[name*=CourseTopic"));
        CourseTopic.sendKeys("Selenium");


    }
}
