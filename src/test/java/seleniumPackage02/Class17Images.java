package seleniumPackage02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class17Images {
    public static String basiUrl="http://www.leafground.com/pages/Image.html";
    public static WebDriver driver;
    @BeforeTest
    public static void images(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(basiUrl);
    }
    @Test
    public static void imageDemo1() {
        By pathImage1 = By.xpath("//label[contains(text(),'home page')]/following-sibling::img");
        WebElement image1 = driver.findElement(pathImage1);
        image1.click();
        driver.navigate().back();

    }
    @Test
    public static void imageDemo2() {
        By pathImage2 = By.xpath("//label[contains(text(),'mage?')]/following-sibling::img");
        WebElement image2 = driver.findElement(pathImage2);
        image2.click();
        driver.navigate().back();
    }
    @Test
    public static void imageDemo3() {
        By pathImage3 = By.xpath("//label[contains(text(),'Mouse')]/following-sibling::img");
        WebElement image3 = driver.findElement(pathImage3);
        image3.click();
        driver.navigate().back();
    }
    @AfterTest
    public static void endTask(){
        driver.quit();





    }

}
