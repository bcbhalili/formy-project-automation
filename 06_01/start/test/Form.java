import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "\\Users\\ADMIN\\Desktop\\Academic Compilations\\Linkedin Learning\\Ex_Files_Selenium_EssT\\Ex_Files_Selenium_EssT\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        // Automate here:

        // STEP 1: Fill First name
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("first-name")).sendKeys("Bien Carlo");


        // STEP 2: Fill Last name
        driver.findElement(By.id("last-name")).sendKeys("Halili");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        // STEP 3: Fill Last name
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        // STEP 4: Select "College"
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("radio-button-2")).click();

        // STEP 5: Select "Male"
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("checkbox-1")).click();

        // STEP 6: Select "Option" for years of exp
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("option[value='2']")).click();

        // STEP 7: Select date
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("datepicker")).sendKeys("12/06/2021");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        // STEP 8: Click Submit
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.quit();
    }
}
