package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableUI;
import java.util.List;

public class StaticTableAssignment {
    public static void main(String[] args) {
        // declare the instance
        WebDriver driver = new ChromeDriver();
//        maximize the window
        driver.manage().window().maximize();
//take me to the url
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");

        //Print All Entries with the Country "USA":
        //  Dynamically search the table for entries where the country is "USA"*.
        List <WebElement> CountryUsa= driver.findElements(By.xpath("//*[@id='task-table']/tbody/tr/td[3]"));
        String expCountry="USA";
        for (int i=1;i<CountryUsa.size()+1;i++) {

            WebElement country=driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr["+i+"]/td[3]"));
            String targetcountry= country.getText();
            if (targetcountry.equals(expCountry)){
                //  Print all the rows matching criteria
                System.out.println(i);
                // WebElement row= driver.findElement(By.xpath("//[@id='task-table']/tbody/tr/td[contains(text(),'USA')]"+count));
                System.out.println(country.getText());
            }
        }
      //  Dynamic Logic *: //   Ensure the search and filtering logic is **dynamic** and does not rely on hard-coded xpaths.
         //   The code should be flexible enough to accommodate changes in the country name
        //  If the country name changes (e.g., from "USA" to "Canada"), the same logic should still work, and the output should reflect the correct entries based on the updated country.

        List<WebElement> countries = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        int count = 1;
        for (WebElement country : countries) {
            String countryValue = country.getText();
            if (countryValue.equals("Canada")) {
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" + count + "]"));
                System.out.println(row.getText());
            }
            count++;
        }

        }

    }


