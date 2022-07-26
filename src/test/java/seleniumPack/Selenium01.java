package seleniumPack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {
    public static void main(String[] args) throws InterruptedException {
        //set the browser driver,i am using Chrome web browser.
        WebDriverManager.chromedriver().setup();

        //WebDriver is a data type and it also called class,creating an object.
        //driver is a Reference variable,new is a memory,ChromeDriver() it is constructor.
         WebDriver driver=new ChromeDriver();

        WebElement inbox1=driver.findElement(By.xpath("//input[@id='email']"));
        WebElement inbox2=driver.findElement(By.xpath("//section[@class='innerblock']/div[2]//input"));
        WebElement inbox3=driver.findElement(By.xpath("//section[@class='innerblock']/div[3]//input"));
        WebElement inbox4=driver.findElement(By.xpath("//div[@id='contentblock']//div[4]//input"));

        driver.get("http://www.leafground.com/pages/Edit.html");

        inbox1.sendKeys("manoj@gmail.com");
        inbox2.sendKeys("Manoj");
        inbox2.sendKeys("kumar");
        inbox3.clear();
        inbox3.sendKeys("My java");
        inbox4.clear();
        inbox4.sendKeys("java test");


        Thread.sleep(10000);
        driver.quit();
        
          


    }
}
