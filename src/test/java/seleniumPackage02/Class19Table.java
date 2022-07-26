package seleniumPackage02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.jws.soap.InitParam;
import java.util.List;

public class Class19Table {
    public static String basiUrl="http://www.leafground.com/pages/table.html";
    public static WebDriver driver;
    @BeforeTest
    public static void BeforeTable(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(basiUrl);
        driver.manage().window().maximize();
    }
    @Test
    public static void table(){
        By colomsSize=By.tagName("th");
       List<WebElement> cols=driver.findElements(colomsSize);
        System.out.println("number of cols"+ cols.size());

        By colmSized =By.xpath("//table/tbody/tr[2]/td");
        List<WebElement> colms=driver.findElements(colmSized);
        System.out.println("number of colmsized"+ colms.size());

        By rowSize=By.tagName("tr");
        List<WebElement> row =driver.findElements(rowSize);
        System.out.println("number of rowsize"+row.size());
    }
    @AfterTest
    public static void endTask(){

        driver.quit();
    }
}
