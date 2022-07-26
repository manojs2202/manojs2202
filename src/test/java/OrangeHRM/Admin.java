package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Admin {
    public static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    public static WebDriver driver;
    @BeforeMethod
    public static void orangeHRM() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
    @Test
    public static void userManagement(){
        By admin = By.xpath("//*[@id='menu_admin_viewAdminModule']");


        WebElement clickAdmin=driver.findElement(admin);

        clickAdmin.click();
    }
}
