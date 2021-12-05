import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "\\Users\\ADMIN\\Desktop\\Academic Compilations\\Linkedin Learning\\Ex_Files_Selenium_EssT\\Ex_Files_Selenium_EssT\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        // Automate here:
        for (int i = 0; i < 2; i++) {
            WebElement check1 = driver.findElement(By.id("checkbox-1"));
            Thread.sleep(2000);
            check1.click();

            WebElement check2 = driver.findElement(By.id("checkbox-2"));
            Thread.sleep(2000);
            check2.click();

            WebElement check3 = driver.findElement(By.id("checkbox-3"));
            Thread.sleep(2000);
            check3.click();
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
