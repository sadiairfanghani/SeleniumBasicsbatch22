package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecutor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        maximize the window
        driver.manage().window().maximize();
//take me to the url
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
//        go to the webstie and enter the username
//                then hgihlight the username with a boudnary


        WebElement userName = driver.findElement(By.id("txtUsername"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
//        userName.sendKeys("Admin");
        js.executeScript("arguments[0].value='Admin';",userName);

        js.executeScript("arguments[0].style.border='3px solid pink'",userName);



    }
}

