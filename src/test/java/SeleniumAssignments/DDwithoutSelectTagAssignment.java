package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DDwithoutSelectTagAssignment {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance
        WebDriver driver=new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        //take me to the url
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        //Choose Your Dream Fruit:
        //Retrieve all options from the "Choose your Dream Fruit" dropdown.
        // Traverse through the list of options, and select **Mango**.
        // Ensure that the selection process is done by iterating through the options and not by directly clicking on the option using Xpath or any direct locator to the item.
        WebElement FruitDD= driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        FruitDD.click();
        Thread.sleep(2000);

        //get list of  options

        List<WebElement> Options=driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));
        for (WebElement option:Options){
            String optiontext=option.getText();
            if (optiontext.equals("Mango")){
                option.click();
                System.out.println("Mango Drop Down working and clicked");
            }
        }

        //Choose Your Favorite Hobby:Retrieve all options from the "Choose your Favorite Hobby" dropdown.
        // Traverse through the list and select **Reading**
        // Ensure that the desired option is selected by iterating through the options, not by directly clicking on it using Xpath or any other direct locator to the item.
        WebElement HobbyDD= driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        HobbyDD.click();
        Thread.sleep(2000);

        //list and select
        List<WebElement> optionlist=driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
        for (WebElement options:optionlist){
            String optionstext=options.getText();
            if (optionstext.equals("Reading")){
                options.click();
                System.out.println("Reading Drop down is Working and Clicked");
            }
        }


    }
}
