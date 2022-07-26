package SeleniumAssertions;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class  EditAssertions {
//    public static String baseUrl = "http://www.leafground.com/pages/Edit.html";
    public static WebDriver driver;
    By xpathEmail= By.xpath("//*[@id='email']");
    By xpathName=By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input");
    By xpathGetText=By.xpath("//input[@value='TestLeaf']");
    By xpatnClear=By.xpath("//input[@value='Clear me!!']");
    By xpathDisabled=By.xpath("//div[@id='contentblock']//div[5]//input");

    public EditAssertions(WebDriver driver) {
        this.driver=driver;
    }
    public void searchBox(String searchInput){
        driver.findElement(xpathEmail).sendKeys(searchInput);

    }
    public void pressTabBox(String name){
        driver.findElement(xpathName).sendKeys(name);
    }
    public String getText(String text){
        WebElement textPrint= driver.findElement(xpathGetText);
        String getValue=textPrint.getAttribute(text);
        System.out.println(getValue);
        return text;
    }
    public void disabled(){
        WebElement disabledBox=driver.findElement(xpathDisabled);
    }
    public void clearText(){
        WebElement clearvalue =driver.findElement(xpatnClear);
        boolean clear=clearvalue.isDisplayed();
        Assert.state(clear, "Is Displayed", false);
        System.out.println(clear);
    }
}
