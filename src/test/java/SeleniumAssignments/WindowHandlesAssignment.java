package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlesAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        maximize the window
        driver.manage().window().maximize();
//take me to the url
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");

        // get window handle of main page
        String mainPageWH = driver.getWindowHandle();
        System.out.println(" the window handle of the main page is " + mainPageWH);
        // Click on Button B1:
        // Ensure that clicking on the **B1** button opens a new window.
        WebElement B1 = driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        B1.click();
        Thread.sleep(1000);
        // Verify that the text in the window opened by the **B1** button is **"Welcome to B1 page"
        //get all the window handle
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            driver.switchTo().window(handle);
            if (driver.getCurrentUrl().equals("https://syntaxprojects.com/b1-page.php")) {
                WebElement textMsg = driver.findElement(By.xpath("//h2"));
                System.out.println(textMsg.getText());
            }
        }
            Thread.sleep(1000);
            // get window handle of main page
            driver.switchTo().window(mainPageWH);
            System.out.println("The current focus of driver is on window " + driver.getCurrentUrl());

            //Click on Button B2:
            //Ensure that clicking on the **B2** button opens a new window.
            WebElement B2 = driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));
            B2.click();
            Set<String> allHandles2 = driver.getWindowHandles();
            for (String handle2 : allHandles2) {
                driver.switchTo().window(handle2);
                //Verify that the text in the window opened by the **B2** button is **"Welcome to B2 page"**.
                if (driver.getCurrentUrl().equals("https://syntaxprojects.com/b2-page.php")) {
                    WebElement Msg = driver.findElement(By.xpath("//h2"));
                    System.out.println("B2 Page Text: " + Msg.getText());


                }
            }
        }
    }


