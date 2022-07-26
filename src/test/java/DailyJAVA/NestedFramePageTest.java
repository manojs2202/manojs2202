//package DailyJAVA;
//
//import org.testng.annotations.BeforeMethod;
//
//public class NestedFramePageTest {
//
//        private DailyJAVA.NestedFramePageTest nestedFramePage;
//
//        @BeforeMethod
//        public void setUp() {
//            driver.get("http://the-internet.herokuapp.com/nested_frames");
//            nestedFramePage = new NestedFramePageTest(driver, wait, actions);
//        }
//
//        @Test
//        public void switchFrameTopLeft() {
//            nestedFramePage.switchToFrameTopLeft();
//            assertEquals(nestedFramePage.getText(), "LEFT");
//        }
//
//        @Test
//        public void switchToMiddleFrame() {
//            nestedFramePage.switchToFrameMiddle();
//            assertEquals(nestedFramePage.getText(), "MIDDLE");
//        }
//
//        @Test
//        public void switchToFrameRight() {
//            nestedFramePage.switchToFrameRight();
//            assertEquals(nestedFramePage.getText(), "RIGHT");
//        }
//
//        @Test
//        public void switchToFrameBottom() {
//            nestedFramePage.switchToFrameBottom();
//            assertEquals(nestedFramePage.getText(), "BOTTOM");
//        }
//    }
//}
