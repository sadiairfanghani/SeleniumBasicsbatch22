package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathAssignment {
    public static void main(String[] args) {
        // declare the instance
        WebDriver driver=new ChromeDriver();
        // Navigate to the webpage
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");
        // maximize window
        driver.manage().window().maximize();
        // 1. Enter hobbies using XPath
        WebElement hobbiesField = driver.findElement(By.xpath("//input[@name=\"yourHobbies\"]"));
        hobbiesField.sendKeys("Eating Out, Travelling");
        // 2. Click the "Click Here" button and verify message
        WebElement clickHereButton = driver.findElement(By.xpath("//button[text()='Click Here']"));
        clickHereButton.click();
        // 3. Enter favorite movie using XPath
        WebElement FavMovie= driver.findElement(By.xpath("//input[@name=\"favoriteMovies\"]"));
        FavMovie.sendKeys("Avengers End Game");
        // 4. Use contains() to locate and print a specific text element
        WebElement specificTextElement = driver.findElement(By.xpath("//*[contains(text(), 'Lorem ipsum dolor sit amet consectetur adipisicing elit.')]"));
        // Print the text containing "syntax"
        System.out.println("Specific Text: " + specificTextElement.getText() );
        // 5. Enter the city
        WebElement cityField = driver.findElement(By.xpath("//input[@name='yourCity']"));
        cityField.sendKeys("New York");
        // 6. Use indexing technique for entering the email address
        WebElement emailField= driver.findElement(By.xpath("(//input[@type=\"email\"])[1]"));
        emailField.sendKeys("index@email.com");
        // 7. Use operators to enter both client name and client ID

        WebElement clientNameField = driver.findElement(By.xpath("//input[@id='clientName' and @name='clientName']"));
        clientNameField.sendKeys("John Doe");


        WebElement clientId = driver.findElement(By.xpath("//input[@id='clientId' and @name='clientId']"));
        clientId.sendKeys("420");



        // 8. Use any XPath technique to enter street number and house number
       WebElement streetNumberField = driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetNumberField.sendKeys("22");

        WebElement houseNumberField = driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNumberField.sendKeys("B");



    }
}
