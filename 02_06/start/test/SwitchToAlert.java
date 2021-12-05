import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "\\Users\\ADMIN\\Desktop\\Academic Compilations\\Linkedin Learning\\Ex_Files_Selenium_EssT\\Ex_Files_Selenium_EssT\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        // Automate here:
        WebElement alert_button = driver.findElement(By.id("alert-button"));
        Thread.sleep(2000);
        alert_button.click();

        // Make an Alert instance named "alert"
        // Make the process focus on the alert box
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();     // Accept by clicking ok

        Thread.sleep(2000);
        driver.quit();
    }
}
