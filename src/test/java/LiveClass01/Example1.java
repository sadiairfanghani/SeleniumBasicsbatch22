package LiveClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        maximize the window
        driver.manage().window().maximize();
//take me to the url
        driver.get("https://syntaxprojects.com/input-form-locator.php");

// get the title
        String titleOfThePage = driver.getTitle();
//         print it  on the console
        System.out.println("the title of the page is :"+titleOfThePage);
        String currenturl = driver.getCurrentUrl();
        System.out.println(currenturl);
        driver.navigate().to("https://www.facebook.com/");

        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);



    }

}