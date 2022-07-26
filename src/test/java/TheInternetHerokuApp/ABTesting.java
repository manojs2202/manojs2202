package TheInternetHerokuApp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.*;
import java.util.List;

import static DailyJAVA.BrokenLink.verifyLinks;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.testng.Assert.assertEquals;

public class ABTesting {
    //public and static is modifier
    //String is data type
    //this is basi url and it return type string
    public static String basiUrl = "https://the-internet.herokuapp.com/";
    //WebDriver is an interface and all the methods are implemented by respective driver
    //which are declared in Webdriver interface
    public static WebDriver driver;

    //BeforeTest it is a annotation
    @BeforeTest
    //hear i am writing method
    public static void click() {
        //It will set the Chrome browser
        WebDriverManager.chromedriver().setup();
        //driver is a reference variable,new is a allocating memory
        driver = new ChromeDriver();
        //get is used to send tha url
        driver.get(basiUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
    }

    //@Test is a annotation, which converts a java method into testng test method.
    @Test(priority = 1)
    public static void aBClick() {
        //By is a class,box1 is a reference variable
        //xpath is a path of html xpath locator
        By box1 = By.xpath("//a[contains(@href, 'abtest')]");
        //findElement(By.xpath) method is used to identify an element
        WebElement click = driver.findElement(box1);
        click.click();
        //click is used to click the element

    }

    //@Test is a annotation, which converts a java method into testng test method
    @Test(priority = 2)
    public static void addRemoveElements() {
        //By is a class,box1 is a reference variable
        //xpath is a path of html xpath locator
        By box1 = By.xpath("//a[contains(text(),'Remove Elements')]");
        By box2 = By.xpath("//button[contains(text(),'Add Element')]");
        By box3 = By.xpath("//button[contains(text(),'Delete')]");
// inspecting the web element
        driver.findElement(box1).click();
        driver.findElement(box2).click();
        driver.findElement(box3).click();
    }

    //@Test is a annototion ,which converts a java method into testng test method
    @Test(priority = 3)
    //this is the method
    public static void basicURL() {
        //giving user name:password @ URL
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
    }

    //@Test is a annoutotion ,which converts a java method into testng test method
    @Test()
    // now i am creting method
    public static void brokenImages() throws IOException {
        //giving xpath to the broken element
        By box1 = By.xpath("//a[contains(text(),'Broken Images')]");
        //to click the element button
        driver.findElement(box1).click();
        //now i am giving xpath for the broken image
        By brokenImg = By.xpath("//div[@class='example']/img");
        //hear i am giving list of WebElement inside the constructor we give broken image xpath
        List<WebElement> img = driver.findElements(brokenImg);
        //i am taking for loop inside i am giving WebElement interface
        for (WebElement imgs : img) {
            //hear i am giving getAttribute name
            String srcOfImg = imgs.getAttribute("src");
            //inside constructor giving (srcOfImg) variables
            URL url = new URL(srcOfImg);
            //
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(3000);
            connection.connect();
            if (connection.getResponseCode() != 200) {
                System.out.println(connection.getResponseMessage() + ":: it is broken");
            } else {
                System.out.println(connection.getResponseMessage() + ":: not broken");
            }
        }


    }

    //@Test is a annoutotion ,which converts a java method into testng test method
    @Test
    //this is the method
    //method name is Checkboxes
    public static void Checkboxes() {
        //giving xpath to find the element
        By box1 = By.xpath("//a[contains(text(),'Checkboxes')]");
        //to click the element
        driver.findElement(box1).click();
        //i am taking List
        List<WebElement> elements = driver.findElements(By.id("checkboxes"));
        for (WebElement chaked : elements) {
            if (!chaked.isSelected()) {
                chaked.click();
            }
            if (chaked.isSelected()) {
                chaked.click();
            }
        }
    }

    @Test
    public static void contextMenu() {
        //hear i am taking 'a' tag and attribute attribute value
        By box1 = By.xpath("//a[@href='/context_menu']");
        //WebElement is a interface
        WebElement element = driver.findElement(box1);
        //hear i am clicking the element
        element.click();
        //i am enter the link to opean a context page ,inside the page have a box in that
        //box i am taking a xpath
        By box2 = By.xpath("//*[@id='hot-spot']");
        WebElement box3 = driver.findElement(box2);
        //i am taking Action class and action variable,inside the Action class i am  giving driver
        Actions action = new Actions(driver);
        //hear i am clicking right click
        action.contextClick(box3).build().perform();
        //now i am handling alert box
        driver.switchTo().alert().accept();
    }

    @Test
    public static void digestAuthentication() {
        driver.get("http://admin:admin@the-internet.herokuapp.com/digest_auth");
        Set<Cookie> cookies = driver.manage().getCookies();
        int total = cookies.size();
        System.out.println(total);
    }

    @Test
    public static void dragAndDrop() {
        By link = By.xpath("//a[contains(text(),'Drag and Drop')]");
        WebElement a = driver.findElement(link);
        a.click();
        By boxA = By.xpath("//*[@id='column-a']");
        WebElement boxAA = driver.findElement(boxA);

        By boxB = By.xpath("//*[@id='column-b']");
        WebElement baxBB = driver.findElement(boxB);

//      Actions actions=new Actions(driver);
//      Actions dragAndDrop = actions.clickAndHold(boxAA);
//      dragAndDrop.moveToElement(baxBB).release(baxBB).build().perform();

        final String java_script =
                "var src=arguments[0],tgt=arguments[1];" +
                        "var dataTransfer={" +
                        "dropEffect:''," +
                        "effectAllowed:'all'," +
                        "files:[]," +
                        "items:{}," +
                        "types:[]," +
                        "setData:function(format,data){" +
                        "this.items[format]=data;" +
                        "this.types.append(format);" +
                        "}," +
                        "getData:function(format){" +
                        "return this.items[format];}," +
                        "clearData:function(format){}};" +
                        "var emit=function(event,target){var evt=document.createEvent('Event');" +
                        "evt.initEvent(event,true,false);" +
                        "evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('" +
                        "dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit(" +
                        "'drop',tgt);emit('dragend',src);";

        ((JavascriptExecutor) driver).executeScript(java_script, boxAA, baxBB);
    }

    @Test
    public static void horizontalSlider() {
        WebElement click = driver.findElement(By.xpath("//*[@id='content']/ul/li[24]/a"));
        click.click();
        WebElement slider = driver.findElement(By.xpath("//*[@id='content']/div/div/input"));
//            slider.sendKeys(Keys.ARROW_RIGHT);
        //hear the arrow keys to move it right and left useing keys.End
        slider.sendKeys(Keys.END);


    }

    @Test
    public static void dropdownList() {
        WebElement click = driver.findElement(By.xpath(("//a[starts-with(text(),'Drop')]")));
        click.click();
        // Geting the list of selected options
        Select drop = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        //now i am useing selectByIndex
        drop.selectByIndex(2);

    }

    //    @Test
//    public static void dynamicLoading(){
//        WebElement click=driver.findElement(By.xpath("//a[starts-with(text(),'Dynamic Loading')]"));
//        WebElement click1=driver.findElement(By.xpath("//*[@id='content']/div/a[1])"));
//        WebElement click2=driver.findElement(By.xpath("//*[@id='start']/button"));
//
//    }
    @Test
    public static void fileDownload() {
        By file = By.xpath("//a[text()='File Download']");
        driver.findElement(file).click();

        By file1 = By.xpath("//*[@id='content']/div/a[2]");
        driver.findElement(file1).click();
        //hear i am giving download location directory
        String downloadPath = System.getProperty("user.dir") + "\\src\\main\\resources";
//        System.out.println(downloadPath);
        //useing HashMap inside hashMap we have keys and valuse
        HashMap<String, Object> myChromeSettings = new HashMap<>();
        // disabled the popup in chrome browser settings
        myChromeSettings.put("profile.default_content.setting.popups", 0);
        //i am giving my download directory hear
        myChromeSettings.put("download.default_directory", downloadPath);

        //The Chromeoptions Class is a concept in Selenium
        // WebDriver for manipulating various properties of the Chrome driver
        ChromeOptions options = new ChromeOptions();
        //hear i am opeaning web driver settings
        options.setExperimentalOption("prefs", myChromeSettings);
        //inside parameters providing options variables
        driver = new ChromeDriver(options);
    }

    @Test
    public static void fileUpload() throws AWTException {
        //hear i am taking xpath to identify the element
        By click = By.xpath("//a[contains(text(),'File Upload')]");
        //giving click() method
        driver.findElement(click).click();
        //now hear i am identify name
        By btnOR = By.name("file");
        WebElement btn = driver.findElement(btnOR);
//        btn.sendKeys("C:\\Users\\shiva\\Downloads\\258606.jpg");

        //hear i am useing Action class
        Actions actions = new Actions(driver);
        //to perform the actions
        actions.click(btn).build().perform();

        //i am taking fliepath directory
        String fliepath = "C:\\Users\\shiva\\Downloads\\258606.jpg";
        //converts the String file name to a format
        StringSelection selection = new StringSelection(fliepath);
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        clip.setContents(selection, null);

        //this Rodot class is java programe
        //it is performa keybord
        Robot robot = new Robot();
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(1000);
        robot.keyRelease(KeyEvent.VK_ENTER);
        //hear i am clicking the element
        driver.findElement(By.xpath("//*[@id='file-submit']")).click();

    }

    @Test
    public static void keyPress() {
        //clicking element by xpath
        driver.findElement(By.xpath("//a[contains(text(),'Key Presses')]")).click();
        //uesing Actions class
        Actions action = new Actions(driver);
        //hear i am sending keys
        action.sendKeys(Keys.SPACE).build().perform();
        //selecting element by id and geting text
        String text = driver.findElement(By.id("result")).getText();
        System.out.println(text);
        //asserting the expected value
        assertEquals(text, "entered: SPACE");

    }

    @Test
    public static void nestedFrames() {
        driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
        //Navigate to left Frame
//         driver.switchTo().frame(driver.findElement(By.name("frame-bottom"))).

        //return name of current frame
//        WebElement currentFrame = driver.findElement(By.tagName("frame-right"));
        //output name of current frame

    }

    @Test
    public static void multipleWindows() {
        By Where = By.xpath("//button[contains(text(),'Where am I')]");

    }

    @Test
    public static void frames() {
        driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
    }

    @Test
    public static void Frame() {
        driver.findElement(By.linkText("Nested Frames")).click();
        // switch to frame with frame name and identify inside element
        driver.switchTo().frame("frame-bottom");
        WebElement value = driver.findElement(By.cssSelector("body"));
        System.out.println("Bottom frame text: " + value.getText());
        // switch to main page
        driver.switchTo().defaultContent();
    }

    @Test
    public static void notificationMessages() {
        driver.findElement(By.xpath("//a[contains(text(),'Notification Messages')]")).click();
        //hear i am geting the text  from xpath
        WebElement message = driver.findElement(By.xpath("//div[@id='flash-messages']/div"));
        System.out.println(message.getText());
        //hear i am useing for loop to boolean condition
        for (boolean flag = true; flag = false; ) {
            driver.findElement(By.linkText("Click here")).click();
            WebElement notification = driver.findElement(By.xpath("//div[@id='flash-messages']/div"));
            System.out.println(notification.getText());
            WebElement element = driver.findElement(By.xpath("//div[@id='flash-messages']/div"));
            if (element.getText().contains("successful")) {
            }
        }
    }

    @Test
    public static void jQueryUIMenu() {
        driver.findElement(By.xpath("//a[contains(text(),'JQuery UI Menus')]")).click();
        Actions actions = new Actions(driver);

        WebElement click1 = driver.findElement(By.xpath("//a[contains(text(),'Enabled')]"));
        actions.moveToElement(click1).build().perform();

        WebElement click2 = driver.findElement(By.xpath("//a[contains(text(),'Downloads')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(click2));
        actions.moveToElement(click2).build().perform();

        WebElement click3 = driver.findElement(By.xpath("//a[contains(text(),'PDF')]"));
        click3.click();
    }

    @Test
    public static void geolocation() {
        driver.findElement(By.xpath("//a[contains(text(),'Geolocation')]")).click();
        WebElement where = driver.findElement(By.xpath("//button[contains(text(),'Where am I')]"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(where)).click();
        Map<String, Object> params = new HashMap<>();
        params.put("latitude", -0.6739033755307344);
        params.put("longitude", 73.1945889620133);
        params.put("accuracy", 1);

        ((ChromeDriver) driver).executeCdpCommand("Emulation.setGeolocationOverride", params);

        wait.until(ExpectedConditions.elementToBeClickable(where)).click();
        driver.findElement(By.xpath("//a[contains(text(),'See it on Google')]")).click();
    }

    @Test
    public static void multipleWindow() {
        driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
        //After loading the page we store the window handle in a variable
        String firstWindow = driver.getWindowHandle();
        String newWindow = "";
        //then proceed with clicking the new window link
        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(firstWindow)) {
                newWindow = window;
            }
        }
        driver.switchTo().window(firstWindow);
        String win = driver.getTitle();
        assertThat(win, is(not(equalTo("New Window"))));
        System.out.println(win);

        driver.switchTo().window(newWindow);
        String win2 = driver.getTitle();
        assertThat(win2, is(equalTo("New Window")));
        System.out.println(win2);
    }

    @Test
    public static void statusCodes() throws IOException {
        driver.findElement(By.xpath("//a[contains(text(),'Status Codes')]")).click();
        List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href,'status_codes/')]"));
        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            String url = element.getAttribute("href");
            System.out.println(url);

//           String url ="https://the-internet.herokuapp.com/status_codes/200";
            HttpURLConnection cn = (HttpURLConnection) new URL(url)
                    .openConnection();


            String method = cn.getRequestMethod();
            System.out.println("method name :" + method);

            int code = cn.getResponseCode();
            System.out.println("code :" + code);
        }

    }
}