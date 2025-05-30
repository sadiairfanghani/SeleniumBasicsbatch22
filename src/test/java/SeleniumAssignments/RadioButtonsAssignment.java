package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonsAssignment {
    public static void main(String[] args) throws InterruptedException {
        // object
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        // navigate the browser
        driver.navigate().to("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        //Choose Your Favorite Beverage:
        // Select the Juice radio button from the list of favorite beverages.
        WebElement JuiceRB = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[3]/input"));
        JuiceRB.click();
        boolean Btn1 = JuiceRB.isSelected();
        System.out.println("Juice radio button from the list of favorite beverages is Selected " + Btn1);

        //Preferred Working Environment:
        // Retrieve all radio buttons in the Preferred Working Environment section.
        List<WebElement> workingEnvs = driver.findElements(By.xpath("  //input[@name='working_enviroment']"));

        // Traverse through the list of radio buttons in code and select the Hybrid option.
        for (WebElement env : workingEnvs) {
            String option = env.getAttribute("value");
            if (option.equals("hybrid")) {
                env.click();
                System.out.println("Hybrid option is clicked ");

                //Choose Your Favorite Season:
                // If the Spring radio button is disabled, click on the "Enable Buttons" .
                WebElement spring = driver.findElement(By.xpath("//input[@value='spring']"));
                boolean springEnabled = spring.isEnabled();
                WebElement enableButton = driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
                Thread.sleep(2000);

                // Ensure that the Spring option is now enabled, then select it.
                if (!springEnabled){
                    enableButton.click();
                    spring.click();
                    System.out.println("Is Spring button enabled: " + springEnabled);
                    System.out.println(" Spring Button is clicked ");
                }
                // By default, the Winter radio button is hidden. Ensure, through code, that it is not displayed initially. Then click on the "Show Buttons" button.
                // Verify that the Winter option is displayed after clicking and is available for selection

                WebElement winter = driver.findElement(By.xpath("//input[@value='winter']"));
                boolean winterDisplayed = winter.isDisplayed();
                System.out.println("Is Winter button displayed: " + winterDisplayed);
                WebElement showButton = driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
                if (!winterDisplayed) {
                    showButton.click();
                }
                winterDisplayed = winter.isDisplayed();
                System.out.println("Is Winter button displayed: " + winterDisplayed);

                //Choose Your Favorite Meal:
                //Select the Lunch radio button from the list of favorite meals.

                WebElement LunchBtb= driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[4]/div[2]/div/label[2]/input"));
                LunchBtb.click();
                System.out.println("Lunch radio button is Selected");

            }
        }
    }
}
