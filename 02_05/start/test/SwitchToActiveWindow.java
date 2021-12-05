import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "\\Users\\ADMIN\\Desktop\\Academic Compilations\\Linkedin Learning\\Ex_Files_Selenium_EssT\\Ex_Files_Selenium_EssT\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        // Automate here:
        WebElement new_tab = driver.findElement(By.id("new-tab-button"));
        Thread.sleep(3000);
        new_tab.click();    // At this point, two tabs are now opened in the test browser

        // Create a variable for the name of original handle
        String original = driver.getWindowHandle();

        // Use looping for the two tabs present in the test browser
        for (String h: driver.getWindowHandles()) {
            Thread.sleep(3000);
            driver.switchTo().window(h);        // Switch to newly opened tab
        }

        // Switch to original tab
        Thread.sleep(3000);
        driver.switchTo().window(original);

        Thread.sleep(3000);
        driver.quit();
    }
}
