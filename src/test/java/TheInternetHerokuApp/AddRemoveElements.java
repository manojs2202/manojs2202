package TheInternetHerokuApp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AddRemoveElements {
    //public and static is modifier
    //String is data type
    //this is basi url and it return type string
    public static String basiUrl="https://the-internet.herokuapp.com/";
    //WebDriver is an interface and all the methods are implemented by respective driver
    //which are declared in Webdriver interface
    public static WebDriver driver;
    //BeforeTest it is a annotation
    @BeforeTest
    public static void ClickElements(){
        //It will set the Chrome browser
        WebDriverManager.chromedriver().setup();
        //driver is a reference variable,new is a allocating memory
        driver=new ChromeDriver();
        //get is used to send tha url
        driver.get(basiUrl);
    }
    }


