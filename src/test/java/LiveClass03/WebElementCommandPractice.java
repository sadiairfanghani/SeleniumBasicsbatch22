package LiveClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandPractice {
    public static void main(String[] args) {
        //declare the instance
        WebDriver driver=new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();

        //goto facebook.com
        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");

        //Mystery Message:Retrieve the value of the attribute `title`
        WebElement MysteryMessage= driver.findElement(By.id("//*[@title=Hover over me to reveal the secert]"));
        String message =MysteryMessage.getAttribute("title");
        System.out.println("Print the message on the console :" + message);

        //Option Box:
        // If "Checkbox 1" is enabled, click on it.
        WebElement checkbox1 = driver.findElement(By.id("//input[@name=CheckboxFirst]"));
        checkbox1.isEnabled();
        checkbox1.click();
        System.out.println("Checkbox 1 clicked.");

        // Ensure that "Checkbox 2" is disabled.
        WebElement checkbox2 = driver.findElement(By.id("//input[@name=disabledCheckbox]"));
        checkbox2.isEnabled();
        System.out.println("Checkbox 2 is disabled");

        //Input Field: clear the text in the input box
        WebElement inputBox = driver.findElement(By.xpath("//input[@id='inputField']"));
        inputBox.clear();
        // send the text here is the custom text entered
        inputBox.sendKeys("here is the custom text entered");
        System.out.println("Custom text entered in the input field.");




        //checkbox for the meal preference "Musical Festival,"
        WebElement MFBtn1= driver.findElement(By.xpath("//input[@value='music_festival']"));
        boolean RadioBtn1=MFBtn1.isSelected();
        MFBtn1.click();
        RadioBtn1=MFBtn1.isSelected();
        System.out.println("Radio Button meal preference Selection is : " + RadioBtn1);





    }
}
