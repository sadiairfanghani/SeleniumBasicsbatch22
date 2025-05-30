package SeleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserAssignment {

    public static void main(String[] args) {
        // object of web driver interface
        WebDriver driver=new FirefoxDriver();

        // navigate to https://www.syntaxprojects.com/
        driver.get("https://www.syntaxprojects.com/");

        //to maximize window
        driver.manage().window().maximize();

        // current url and print
        String url= driver.getCurrentUrl();
        System.out.println("The current url: " +url);

        //title retrieved should be printed on the console and match `Syntax - Website to practice Syntax Automation Platform`.

        String title= driver.getTitle();
        System.out.println(title);

        //browser should close automatically url and title
        driver.close();

    }
}
