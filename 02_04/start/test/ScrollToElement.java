import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "\\Users\\ADMIN\\Desktop\\Academic Compilations\\Linkedin Learning\\Ex_Files_Selenium_EssT\\Ex_Files_Selenium_EssT\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        Thread.sleep(1000);
        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);      // Instance of Actions class to use driver
        actions.moveToElement(name);                // Scroll down until it finds target WebElement
        Thread.sleep(1000);
        name.sendKeys("Bien Carlo Halili");

        Thread.sleep(1000);
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");

        Thread.sleep(1000);

        driver.quit();
    }
}
