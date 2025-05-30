package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandsAssignment {
    public static void main(String[] args) throws InterruptedException {

        // object
        WebDriver driver=new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();

        // navigate the browser to google and print the title and url
        driver.navigate().to("https://syntaxprojects.com/selenium_commands_selector-homework.php");

        //Retrieve Attribute and Print the the text in console

        WebElement TextElement= driver.findElement(By.xpath("//div[@id='textattr']"));
        String text= TextElement.getText();
        System.out.println("The text in the webelement is : " + text);

        //Choose the checkbox for the meal preference "Musical Festival," ensuring the checkbox is enabled before clicking on it
        // Check the checkbox of "MUSIC FESTIVAL" is enabled before clicking
        WebElement Btn1Enable= driver.findElement(By.xpath("//input[@value='music_festival']"));
        boolean radioBtn1 = Btn1Enable.isEnabled();
        System.out.println("Musical Festival button is enabled before clicking on : " + radioBtn1);
        if (radioBtn1){
            Btn1Enable.click();
        }
        //Ensure that the option for "Tech Talk" is disabled
        WebElement techTalk = driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean stateOfTechTalk = techTalk.isEnabled();
            System.out.println("If Tech Talk option button is enabled : " + stateOfTechTalk);

        //Click on "Show More Options"
        //  ensure the "Art Exhibition" option is displayed, then click on it
        WebElement showMoreBtn = driver.findElement(By.xpath("//button[text()='Show More Options']"));
        showMoreBtn.click();

        // Wait for new options to appear
        Thread.sleep(1000);

        // Click on the Art Exhibition Button
        WebElement ArtExhiBtn= driver.findElement(By.xpath("//input[@value='art_exhibition']"));
        boolean ArtEx=ArtExhiBtn.isDisplayed();
        if (ArtEx){
            ArtExhiBtn.click();
            System.out.println("Art Exhibition Button is clicked ");
        }
        //Mystery Message:Retrieve the value of the attribute `title`
        WebElement MysteryMessage = driver.findElement(By.xpath("//div[@id='hidden_message']"));
        String attribute = MysteryMessage.getAttribute("title");
        System.out.println("Print Mystery Message :" + attribute);

        //Option Box:
        // If "Checkbox 1" is enabled, click on it.
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='CheckboxFirst']"));
        checkbox1.isEnabled();
        checkbox1.click();
        System.out.println("Checkbox 1 clicked.");

        // Ensure that "Checkbox 2" is disabled.
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='disabledCheckbox']"));
        checkbox2.isEnabled();
        System.out.println("Checkbox 2 is disabled");

        //Input Field: clear the text in the input box
        WebElement inputBox = driver.findElement(By.xpath("//input[@id='inputField']"));
        inputBox.clear();
        // send the text here is the custom text entered
        inputBox.sendKeys("here is the custom text entered");
        System.out.println("Custom text entered in the input field.");



    }
}