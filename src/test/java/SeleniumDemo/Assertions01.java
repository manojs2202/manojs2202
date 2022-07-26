package SeleniumDemo;

import SeleniumAssertions.EditAssertions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Assertions01 {
    public static String baseUrl = "http://www.leafground.com/pages/Edit.html";
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseUrl);
    }
    @Test
   public void box01(){
        EditAssertions email=new EditAssertions(driver);
        email.searchBox("manojkumar@gmail.com");
    }
    @Test
    public void box02(){
        EditAssertions name=new EditAssertions(driver);
        name.pressTabBox("manoj"+ Keys.TAB);
    }
    @Test
    public void box03(){
        EditAssertions attribute=new EditAssertions(driver);
        attribute.getText("value");

    }
    @Test
    public void box04(){
        EditAssertions clearTheText=new EditAssertions(driver);
        clearTheText.clearText();
    }
    @AfterTest
    public void endTask(){
        driver.quit();
    }
}
