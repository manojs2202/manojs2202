package seleniumPackage02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SeleniumClass21WebTable {
    public static String basiUrl="http://www.leafground.com/pages/table.html";
    public static WebDriver driver;
    @BeforeTest
    public static void table() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(basiUrl);
    }
    @Test
    public static void testTable() throws InterruptedException {
        By progressColXpath = By.xpath("//td[2]");
        List<WebElement> progressElements = driver.findElements(progressColXpath);
        List<Integer> pList = new ArrayList<>();
        for (WebElement progressEle : progressElements) {
            String pValue = progressEle.getText();
            String pValueChanged = pValue.replace("%", "");
            pList.add(Integer.parseInt(pValueChanged));
        }
        System.out.println(pList);
        int mivValue = Collections.min(pList);
        System.out.println(mivValue);
        driver.findElement(By.xpath("//*[starts-with(text()," + mivValue + ")]/following::td")).click();

        Thread.sleep(5000);
    }
    @AfterTest
        public static void endTask(){
        driver.quit();
        }

}
