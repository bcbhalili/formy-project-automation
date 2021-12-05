import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "\\Users\\ADMIN\\Desktop\\Academic Compilations\\Linkedin Learning\\Ex_Files_Selenium_EssT\\Ex_Files_Selenium_EssT\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        // Automate here:
        WebElement radio1 = driver.findElement(By.id("radio-button-1"));
        Thread.sleep(2000);
        radio1.click();

        WebElement radio2 = driver.findElement(By.cssSelector("input[value='option2']"));
        Thread.sleep(2000);
        radio2.click();

        WebElement radio3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        Thread.sleep(2000);
        radio3.click();

        Thread.sleep(2000);
        driver.quit();
    }
}
