package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarWithNavigationAssignment {
    public static void main(String[] args) {
        // declare the instance
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        //take me to the url
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");
        //Select "From" and "To" Dates**:
        //Select the **From** date and the **To** date in the jQuery date picker.
        //  The code logic should be **dynamic**, meaning it should work with any selected dates without requiring any changes to the core logic.
        // The selection should not rely on hard-coded date values and should be adaptable if the date range changes.

        driver.findElement(By.id("from_date")).click();
        boolean notfound = true;
        while(notfound) {
            WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));

            String getCurrentMonth = month.getText();

            if (getCurrentMonth.equals("June")) {
                //select date
                List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for(WebElement date:allDates){
                    if(date.getText().equals("2")){
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
