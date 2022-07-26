package DailyJAVA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLink {
    public static String baseUrl = "https://www.amazon.com/";
    public static WebDriver driver;
    @BeforeMethod
    public void amazon() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
    @Test
    public static void linkBroken (){
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Num of links are "+ links.size());
        for(int i=0;i<links.size();i++)
        {
            WebElement element=   links.get(i);
            String url= element.getAttribute("href");
            verifyLinks(url);
        }

        driver.quit();
    }
    public static void verifyLinks(String linkUrl)
    {
        try
        {
            URL url =  new URL(linkUrl);

            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()>=400)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
            }

            else{
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
        }catch (Exception e) {
        }
    }
}
