package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

    public static void main(String[] args) throws InterruptedException {
        //declare the instance
        WebDriver driver=new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();

        //goto facebook.com
        driver.get("https:/fb.com");
        // navigate to syntaxprojects website
        driver.navigate().to("https://syntaxprojects.com/");

        // go back to fb
        driver.navigate().back();

        //go forward to syntax projects.com
        driver.navigate().forward();

        //slow down the code to observe

        Thread.sleep(2000);

        // refresh
        driver.navigate().refresh();

        // closing the browser
        driver.close();

    }
}
