import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "\\Users\\ADMIN\\Desktop\\Academic Compilations\\Linkedin Learning\\Ex_Files_Selenium_EssT\\Ex_Files_Selenium_EssT\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage form_page = new FormPage();
        ConfirmationPage confirmation_page = new ConfirmationPage();

        form_page.submitForm(driver);
        confirmation_page.waitForAlertBanner(driver);
        assertEquals("The form was successfully submitted!", confirmation_page.getAlertBannerText(driver));

        driver.quit();
    }
}
