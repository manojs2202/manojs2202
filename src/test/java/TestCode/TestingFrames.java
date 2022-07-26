package TestCode;

import SeleniumAssertions.TestingCode;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestingFrames {
    @Test
public static void frame() throws IOException {
    TestingCode.frame("http://www.leafground.com/pages/frame.html","//*[@id='Click']");
       String xpath=  "//*[@id='Click']";
//       String url= "http://www.leafground.com/pages/frame.html";
}
}
