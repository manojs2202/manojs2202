package DailyJAVA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class EditBoxEdit {
 public static String baseUrl = "http://www.leafground.com/pages/Edit.html";
 public static WebDriver driver;

 @BeforeMethod
 public static void orange() {
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  driver.get(baseUrl);
 }

 @Test
 public static void box1() {
  By pathbox1 = By.xpath("//*[@id='email']");
  WebElement email = driver.findElement(pathbox1);
  //To use send tha values
  email.sendKeys("smk@mmail.com");
   //getTitle use title of tha web page ,return type is String
  String get = driver.getTitle();
  System.out.println(get);
  //it can use clear tha text
  email.clear();










 }
}


