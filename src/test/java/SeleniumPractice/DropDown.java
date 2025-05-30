package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance
        WebDriver driver=new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();

        //goto facebook.com
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");

        //        find the drop down
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));

        Select sel=new Select(dropDown);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByVisibleText("Apple");
        Thread.sleep(2000);
        sel.selectByValue("Banana");

        List<WebElement> allOptions = sel.getOptions();
        for(WebElement option:allOptions){
            System.out.println(option.getText());
        }


        WebElement DD = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select sel1=new Select(DD);
        boolean isMultiSelect = sel1.isMultiple();
        System.out.println("the dropdown is mutliselect "+isMultiSelect);

        sel1.selectByIndex(0);
        sel1.selectByValue("Traveling");
        sel1.selectByVisibleText("Cooking");

        Thread.sleep(2000);

        sel1.deselectByIndex(0);

//select option 2,5,6 and then deselct option 2
        //there is a bug here the button is not giving the results on the ui




    }
}
