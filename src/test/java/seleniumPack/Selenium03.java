package seleniumPack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium03 {
    @Test
    public static void web() throws InterruptedException {

        //set the browser driver,i am using Chrome web browser.
        WebDriverManager.chromedriver().setup();
        //WebDriver is a data type and it also called class,creating an object.
        //driver is a Reference variable,new is a memory,ChromeDriver() it is constructor.
        // instantiating WebDriver
         WebDriver driver = new ChromeDriver();
        //to opean a browser using Ger() method.
        driver.get("http://leafground.com/pages/checkbox.html");
        //i will be using xpath by finding WebElement
        WebElement input1 = driver.findElement(By.xpath("//section[@class='innerblock']/div[1]//input[1]"));
        WebElement input2 = driver.findElement(By.xpath("//section[@class='innerblock']/div[1]//input[2]"));
        WebElement input3 = driver.findElement(By.xpath("//section[@class='innerblock']/div[1]//input[3]"));
        WebElement input4 = driver.findElement(By.xpath("//section[@class='innerblock']/div[1]//input[4]"));
        WebElement input5 = driver.findElement(By.xpath("//section[@class='innerblock']/div[1]//input[5]"));

        input1.click();
        System.out.println("checkeing input1"+input1);
        input2.click();
        System.out.println("checkeing input2"+input2);
        input3.click();
        System.out.println("checkeing input3"+input3);
        input4.click();
        System.out.println("checkeing input4"+input4);
        input5.click();
        System.out.println("checkeing input5"+input5);

        WebElement checkbox =driver.findElement(By.xpath("//section[@class='innerblock']/div[2]//input"));
        System.out.println("click checkbox"+checkbox.isSelected());

        WebElement unselectBox=driver.findElement(By.xpath("//section[@class='innerblock']/div[3]//input[1]"));
        System.out.println("unclick selectbox"+unselectBox.isSelected());
        //checking Confirm Selenium is checked or unchecked
        WebElement selectBox=driver.findElement(By.xpath("//section[@class='innerblock']/div[3]//input[2]"));
        System.out.println("click selectbox"+selectBox.isSelected());

        WebElement selectCheckBox1=driver.findElement(By.xpath("//section[@class='innerblock']/div[4]//input[1]"));
        selectCheckBox1.click();
        System.out.println("click select Checkbox1"+selectCheckBox1.isSelected());
        WebElement selectCheckBox2=driver.findElement(By.xpath("//section[@class='innerblock']/div[4]//input[2]"));
        selectCheckBox2.click();
        System.out.println("click select checkbox2"+selectCheckBox2.isSelected());
        WebElement selectCheckBox3=driver.findElement(By.xpath("//section[@class='innerblock']/div[4]//input[3]"));
        selectCheckBox3.click();
        System.out.println("click select checkbox3"+selectCheckBox3.isSelected());
        WebElement selectCheckBox4=driver.findElement(By.xpath("//section[@class='innerblock']/div[4]//input[4]"));
        selectCheckBox4.click();
        System.out.println("click select checkbox4"+selectCheckBox4.isSelected());
        WebElement selectCheckBox5=driver.findElement(By.xpath("//section[@class='innerblock']/div[4]//input[5]"));
        selectCheckBox5.click();
        System.out.println("click selet checkbox5"+selectCheckBox5.isSelected());
        WebElement selectCheckBox6=driver.findElement(By.xpath("//section[@class='innerblock']/div[4]//input[6]"));
        selectCheckBox6.click();
        System.out.println("click selet checkbox6"+selectCheckBox6.isSelected());

        Thread.sleep(5000);
        driver.quit();

    }
}