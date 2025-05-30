package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpathAssignment {
    public static void main(String[] args) {
        // declare the instance
        WebDriver driver=new ChromeDriver();
        // maximize window
        driver.manage().window().maximize();

        // Navigate to the webpage
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");

        //enter the names of books in reverse order from least favorite to favorite
        //Find and enter The Least favorite book
        WebElement leastFavBook = driver. findElement (By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        leastFavBook.sendKeys("Lord Of The Rings");

         //Find and enter The middle favorite book
        WebElement MiddleFav= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        MiddleFav.sendKeys("Harry Potter");
        //Find and enter The Most favorite book
        WebElement MostFav= driver.findElement(By.xpath("(//div[@class='row col-4-fields'])[1]/input[3]"));
        MostFav.sendKeys("The Alchemist");

        // enter the favorite books
        WebElement FavBook= driver.findElement(By.xpath("(//div[@class='row col-4-fields']) [2]/input[1]"));
        FavBook.sendKeys("The Alchemist");

        WebElement secondFav= driver.findElement(By.xpath("(//div[@class='row col-4-fields']) [2]/input[2]"));
        secondFav.sendKeys("Harry Potter");

        WebElement Leastfav= driver.findElement(By.xpath("(//div[@class='row col-4-fields']) [2]/input[3]"));
        Leastfav.sendKeys(" Lord Of The Rings");


        //Enter the names of grandparent, parent, and child fields using advanced Xpath
        WebElement grandparents= driver.findElement(By.xpath("//div[@id=\"familyTree\"]/child::input[1]"));
        grandparents.sendKeys("Muhammad");

        WebElement Parent= driver.findElement(By.xpath("//div[@id=\"familyTree\"]/child::input[2]"));
        Parent.sendKeys("Sadia");

        WebElement child= driver.findElement(By.xpath("//div[@id=\"familyTree\"]/child::input[3]"));
        child.sendKeys("Amal");



    }
}
