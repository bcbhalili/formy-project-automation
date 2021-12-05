import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        // Sets the location to the chromedriver
        System.setProperty("webdriver.chrome.driver", "\\Users\\ADMIN\\Desktop\\Academic Compilations\\Linkedin Learning\\Ex_Files_Selenium_EssT\\Ex_Files_Selenium_EssT\\chromedriver_win32\\chromedriver.exe");

        // Create instance of WebDriver by naming it driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the test application
        driver.get("https://formy-project.herokuapp.com/keypress");

        // Add steps for automation here:

        // Create instance of text field in the site to find id "name"
        WebElement name = driver.findElement(By.id("name"));
        name.click();                           // Click the field to get ready typing
        name.sendKeys("Bien Carlo Halili");    // Type the field

        // Create instance of button element to find id "button"
        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}
