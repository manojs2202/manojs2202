package TestNg_JAVA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditBox {
    public static String baseUrl = "http://www.leafground.com/pages/Edit.html";
    public static WebDriver driver;

    @Test
    public static void box1() {
        By pathbox1 = By.xpath("//*[@id='email']");
        WebElement email = driver.findElement(pathbox1);
        email.sendKeys("manojkumar@gmail.com");

    }

    @Test
    public static void box2() {
        By pathbox2 = By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input");
        WebElement pressTab = driver.findElement(pathbox2);
        pressTab.sendKeys("manoj" + Keys.TAB);
    }

    @Test
    public static void box3() {
        By pathbox3 = By.xpath("//input[@value='TestLeaf']");
        WebElement textEntered = driver.findElement(pathbox3);
        String getValue = textEntered.getAttribute("name");
        System.out.println(getValue);
    }

    @Test
    public static void box4() {
        By pathbox4 = By.xpath("//html/body/div/div/div[3]/section/div[4]/div/div/input");
        WebElement clearTheText = driver.findElement(pathbox4);
        clearTheText.clear();
    }

    @Test
    public static void box5() {
        By pathBox5 = By.xpath("//div[@id='contentblock']//div[5]//input");
        WebElement disabled = driver.findElement(pathBox5);
        boolean editFieldIsDisabled = disabled.isEnabled();
        System.out.println("edit field is disabled" + editFieldIsDisabled);
    }
    @BeforeMethod
    public static void orange() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
    @AfterMethod
    public static void end(){
        driver.quit();
    }
}
