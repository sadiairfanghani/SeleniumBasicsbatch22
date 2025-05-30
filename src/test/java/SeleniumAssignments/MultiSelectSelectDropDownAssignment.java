package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectSelectDropDownAssignment {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance
        WebDriver driver=new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        //take me to the url
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");

        //Select List Demo:
        // Use the **Select** class to select the option **"Pear"** from the dropdown.
        //  You can use any method from the **Select** class (e.g., `selectByVisibleText`, `selectByValue`, `selectByIndex`)
        WebElement DD= driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
        Select Sel=new Select(DD);
        Thread.sleep(2000);
        Sel.selectByValue("Pear");
        System.out.println("select the option Pear is selected ");
        //   - Use the **getAllOptions** method to retrieve all options from the dropdown and print them on the console
        List<WebElement> allOption=Sel.getOptions();
        for (WebElement option:allOption){
            System.out.println(option.getText());
        }
        //Select Multiple Options:First, verify that the **Select** dropdown is multi-select by checking the Dropdown’s properties.
        //Using the **Select** class, make the selections:**Traveling,cooking,gardening**
        WebElement MSDD= driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select sel=new Select(MSDD);
        boolean Multi=sel.isMultiple();
        System.out.println("The drop down is Multi Select  " +Multi);
        sel.selectByIndex(1);
        sel.selectByVisibleText("Cooking");
        sel.selectByValue("Gardening");

        // Click the **"Get All Selected"** button and print the result on the console.
        List<WebElement> getall=sel.getAllSelectedOptions();
        for (WebElement allselected:getall){
            System.out.println(allselected.getText());
        }

        //After a delay of 5 seconds, deselect the **Traveling** option using the **Select** class.
        Thread.sleep(5000);
        sel.deselectByIndex(1);
        System.out.println("Traveling is Deselected");
        // Click the **"Get All Selected"** button again and print the result on the console
        List<WebElement> Getall=sel.getAllSelectedOptions();
        for (WebElement allselected:Getall){
            System.out.println(allselected.getText());
        }


    }

}
