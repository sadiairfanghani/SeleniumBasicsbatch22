package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tables {
    public static void main(String[] args) {
        // declare the instance
        WebDriver driver = new ChromeDriver();
//        maximize the window
        driver.manage().window().maximize();
//take me to the url
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //login
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
//       click on Pim
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

//        find the id 116747A


        boolean notFound=true;
        while (notFound) {
            List<WebElement> allIds = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            int count = 1;
            for (WebElement id : allIds) {
                String valueOfId = id.getText();
                if (valueOfId.equals("112208A")) {
                    driver.findElement(By.xpath("//table/tbody/tr[" + count + "]/td[1]")).click();
                    System.out.println("the number of iteration is " + count);
                    notFound = false;
                    break;
                }
                count++;
            }

            //click on next button
            if (notFound) {
                driver.findElement(By.xpath("//a[text()='Next']")).click();
            }


        }

    }
}
