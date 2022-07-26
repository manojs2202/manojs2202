package selenium_Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditBox01 {
    //this is the basiurl
    public static String basiUrl="http://www.leafground.com/pages/Edit.html";
    public static WebDriver driver;
    @BeforeTest
    public static void editBox(){
        //set the browser driver,i am using Chrome web browser.
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(basiUrl);
    }
    @Test
    public static void box() throws InterruptedException {
        By inbox01=By.xpath("//section[@class='innerblock']/div[1]/div/div/input");
        By inbox02=By.xpath("//section[@class='innerblock']//div[2]//input");
        By inbox03=By.xpath("//input[@value='TestLeaf']");
        By inbox04=By.xpath("//html/body/div/div/div[3]/section/div[4]/div/div/input");
        By inbox05=By.xpath("//div[@id='contentblock']//div[5]//input");

        WebElement box01=driver.findElement(inbox01);
        WebElement box02=driver.findElement(inbox02);
        WebElement box03=driver.findElement(inbox03);
        WebElement box04=driver.findElement(inbox04);
        WebElement box05=driver.findElement(inbox05);

        box01.sendKeys("manoj@gmail.com"+Keys.TAB  );
        box02.clear();
        box02.sendKeys("manoj"+ Keys.TAB);
        Thread.sleep(4000);
        String getValue=box03.getAttribute("name");
        System.out.println(getValue);
        box04.clear();

        boolean editFieldIsDisabled=box05.isEnabled();
        System.out.println("edit field is disabled"+ editFieldIsDisabled);
        Thread.sleep(5000);
    }
    @AfterTest
    public static void endTask(){
        driver.quit();
    }
}
