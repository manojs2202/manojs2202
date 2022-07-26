package seleniumPack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium04 {
    @Test
    public static void selectAllCheckBox(){
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
    }
}
