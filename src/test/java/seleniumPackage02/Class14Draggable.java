package seleniumPackage02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Class14Draggable {
    @Test
    public static void drag() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/drag.html");

        /*By is a class, draggablepath this is a Reference variable,i am providing xpath in this
        variable.*/
        By draggablepath= By.xpath("//div[@id='draggable']");
        //i am giving findElement.
        WebElement draggale=driver.findElement(draggablepath);
        //now i am creating Actions by action variable and passing tha driver.
        Actions action=new Actions(driver);
        //in this action wich element to click we provid that element to pass tha parameter.
        action.clickAndHold(draggale).moveByOffset(151, 51).build().perform();
        Thread.sleep(5000);
        driver.quit();
    }
}
