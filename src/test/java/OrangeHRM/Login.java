package OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login {
    public static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    public static WebDriver driver;
    @BeforeMethod
    public static void orangeHRM() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
    @Test(priority = 1)
    public static void loginPage()  {
        By pathUser     =By.xpath("//*[@id='txtUsername']");
        By pathPassword =By.xpath("//*[@id='txtPassword']");
        By loginButtion =By.xpath("//*[@name='Submit']");

        WebElement  userName =driver.findElement(pathUser);
        WebElement password  =driver.findElement(pathPassword);
        WebElement login     =driver.findElement(loginButtion);

        userName.sendKeys("Admin");
        password.sendKeys("admin123");
        login.click();
       // Thread.sleep(5000);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));


    }
    @DataProvider(name = "loginPage")
    @Test(priority = 2)
    public static Object[][] admin(){
        By admin        = By.xpath("//*[@id='menu_pim_viewPimModule']/b");
        WebElement clickAdmin=driver.findElement(admin);
        clickAdmin.click();
        return new Object[0][];
    }

}
