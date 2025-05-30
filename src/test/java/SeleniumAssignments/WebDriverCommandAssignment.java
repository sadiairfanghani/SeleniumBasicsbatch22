package SeleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommandAssignment {
    public static void main(String[] args) {
        // object
        WebDriver driver=new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();

        // navigate the browser to google and print the title and url
        driver.navigate().to("https://www.google.com/");
        //page title and print
        String googleUrl= driver.getCurrentUrl();
        String googleTitle= driver.getTitle();
        System.out.println("Navigated to:" + googleUrl);
        System.out.println("Page Title:" + googleTitle);

        // Navigate to Syntax Projects  print the title and URL
        driver.navigate().to("https://syntaxprojects.com/");

        // print the title and URL
         String syntaxUrl= driver.getCurrentUrl();
         String syntaxTitle= driver.getTitle();
        System.out.println("Navigated to:" + syntaxUrl);
        System.out.println("Page Title:" + syntaxTitle);

        //navigates back to `www.google.com` using `navigate().back()
        driver.navigate().back();
        System.out.println("Navigated back to Google");

        //Refresh google
        driver.navigate().refresh();
        System.out.println("Refreshed the Google page");

        //close the browser
        driver.close();
















    }
}
