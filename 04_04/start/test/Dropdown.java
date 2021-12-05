import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "\\Users\\ADMIN\\Desktop\\Academic Compilations\\Linkedin Learning\\Ex_Files_Selenium_EssT\\Ex_Files_Selenium_EssT\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        // Automate here:
        WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
        Thread.sleep(2000);
        dropdown.click();

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        Thread.sleep(2000);
        autocomplete.click();

        Thread.sleep(2000);
        driver.quit();
    }
}
