package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTableAssignment {
    public static void main(String[] args) {

        // declare the instance
        WebDriver driver = new ChromeDriver();
        //  maximize the window
        driver.manage().window().maximize();
        // take me to the url
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //login
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        // click on Pim
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

        //Look for an Employee ID on Page 3: take any employee id on page 3 manually.
        WebElement NextBtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
        NextBtn.click();
        WebElement NextBtn2 = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
        NextBtn2.click();

        System.out.println(" Next BTN is clicked and employee Id is There on page3");
        //employee id on page 3 manually *112200A*

        //Dynamic Search and Deletion:
        // Write dynamic code logic that goes to the website, searches for the employee ID across multiple pages,
        // once found, selects the checkbox associated with that employee.

        boolean notFound = true;
        while (notFound) {
            List<WebElement> allIds = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            int count = 1;
            for (WebElement id : allIds) {
                String valueOfId = id.getText();
                if (valueOfId.equals("112200A")) {
                    driver.findElement(By.xpath("//table/tbody/tr[" + count + "]/td[1]")).click();
                    System.out.println("the number of iteration is " + count);
                    notFound = false;

                    break;
                }
                count++;

                //Dynamic Logic: The code should be **dynamic**, meaning that it should work even if the employee ID is located on other pages (such as 4, 5, 7, etc.) without changing any part of the logic.
                // The script should be able to navigate across pages dynamically and locate the employee ID without requiring manual input of page numbers.
            }
            //click on next button if the employee ID is located on other pages
            if (notFound) {
                driver.findElement(By.xpath("//a[text()='Next']")).click();

            }

        }
    }
}
