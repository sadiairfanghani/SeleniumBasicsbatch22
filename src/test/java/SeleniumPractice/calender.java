package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class calender {
    public static void main(String[] args) {

        // declare the instance
        WebDriver driver = new ChromeDriver();
       // maximize the window
        driver.manage().window().maximize();
        //take me to the url
        driver.get("https://www.syntaxprojects.com/jquery-date-picker-demo-homework.php");

        driver.findElement(By.id("from_date")).click();
        boolean notfound = true;
        while(notfound) {
            WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));

            String getCurrentMonth = month.getText();

            if (getCurrentMonth.equals("July")) {
                //select date
                List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for(WebElement date:allDates){
                    if(date.getText().equals("17")){
                        date.click();
                    }
                }
                notfound=false;
            }
            else {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }
        }
    }
}



