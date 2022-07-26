package LearningTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
//        for(int i=0;i<5;i++) {
            WebDriver driver;
            driver = new ChromeDriver();
            driver.get("https://restfulapi.net/");
//            driver.findElement();
            driver.manage().window().minimize();
            Thread.sleep(5000);
            driver.quit();
//        }
    }
}
