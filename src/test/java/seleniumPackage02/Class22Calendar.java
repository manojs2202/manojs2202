package seleniumPackage02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class22Calendar {
    public static String basiUrl="http://www.leafground.com/pages/Calendar.html";
    public static WebDriver driver;
    @BeforeTest
    public static void calendar() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(basiUrl);
    }
    @Test
    public static void datePick() throws InterruptedException {
        By datePickerOR = By.xpath("//input[@id='datepicker']");
        WebElement datePicker=driver.findElement(datePickerOR);
        datePicker.click();
        Thread.sleep(1000);
        String month =driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();

        By nextMonthOR;
        WebElement nextMonth;

        while (!month.equals("December")){
            month=driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
            nextMonthOR=By.xpath("//a[@title='Next']");
            nextMonth=driver.findElement(nextMonthOR);
            if(month.equals("November")){
                break;
            }
            Thread.sleep(2000);
            nextMonth.click();
            driver.quit();

        }
    }
}
