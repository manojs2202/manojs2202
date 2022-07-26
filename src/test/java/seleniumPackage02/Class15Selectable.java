package seleniumPackage02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.util.List;

public class Class15Selectable {
    @Test
    public static void selectable() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/selectable.html");

        By selectablepath=By.xpath("//ol[@id='selectable']/li");
        List<WebElement> selectitems=driver.findElements(selectablepath);
        System.out.println(selectablepath);
        Actions actions =new Actions(driver);
//        actions.clickAndHold(selectitems.get(0))
//                .clickAndHold(selectitems.get(3))
//                .build().perform();
//        Thread.sleep(5000);
//        driver.quit();

            actions.keyDown(Keys.CONTROL).click(selectitems.get(2))
                .keyDown(Keys.CONTROL).click(selectitems.get(4))
                .keyDown(Keys.CONTROL).click(selectitems.get(6))
                .build().perform();
        Thread.sleep(5000);
        driver.quit();
    }
}
