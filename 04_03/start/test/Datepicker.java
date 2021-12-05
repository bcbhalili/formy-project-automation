import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "\\Users\\ADMIN\\Desktop\\Academic Compilations\\Linkedin Learning\\Ex_Files_Selenium_EssT\\Ex_Files_Selenium_EssT\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        // Automate here:
        WebElement date_field = driver.findElement(By.id("datepicker"));
        Thread.sleep(3000);
        date_field.sendKeys("03/03/2020");
        Thread.sleep(3000);
        date_field.sendKeys((Keys.RETURN));

        Thread.sleep(3000);
        driver.quit();
    }
}