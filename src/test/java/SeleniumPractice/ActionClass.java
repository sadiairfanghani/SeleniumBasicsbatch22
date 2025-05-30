package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        maximize the window
        driver.manage().window().maximize();
//take me to the url
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

        Actions action=new Actions(driver);
        WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        action.moveToElement(hoverBtn).perform();

        WebElement rightClickBtn = driver.findElement(By.id("show_context_menu"));
        action.contextClick(rightClickBtn).perform();


        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement dropLoc=driver.findElement(By.id("droppable"));

//        action.dragAndDrop(draggable,dropLoc).perform();

        action.clickAndHold(draggable).moveToElement(dropLoc).release().build().perform();

        //action.doubleClick(draggable).perform();


    }
}
