package phpTravels;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class php_Login {
    @Test
    public static void login(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.phptravels.net/login");
        WebElement emailPath=driver.findElement(By.xpath("//input[@type='email']"));
        WebElement passwor=driver.findElement(By.xpath("//input[@type='password']"));
        WebElement select=driver.findElement(By.xpath("//label[@for='rememberchb']"));
        WebElement oktoclick=driver.findElement(By.xpath("//button[@type='submit']"));

        emailPath.sendKeys("manojkumar@gmail.com");
        passwor.sendKeys("NaPassword234");
        select.click();
        oktoclick.submit();


//          driver.quit();
    }
}
