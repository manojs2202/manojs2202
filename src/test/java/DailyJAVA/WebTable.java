package DailyJAVA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WebTable {
    public static String baseUrl = "https://www.nationsonline.org/oneworld/country_code_list.htm";
    public static WebDriver driver;

    @BeforeMethod
    public void table() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get(baseUrl);
    }

    @Test
    public void rowAndCol() {
        By row = By.xpath("//*[@id='Country-Codes-A-C']/tbody/tr/td[2]/a[starts-with(text(),'A')]");
        List<WebElement> numOfRow = driver.findElements(row);
        System.out.println("number of rows :" + numOfRow.size());
        int rows = numOfRow.size();
//        for (int roww=0;roww<rows;row++){
//            List<WebElement> colss=numOfRow.findElements(By.xpath("/td"));
//            for(int i=1;i<=colss.size();i++){
//                WebElement cell=rowss.findElement(By.xpath("./td["+i+"]"));
//                System.out.println(cell.getText());
            }
        }
