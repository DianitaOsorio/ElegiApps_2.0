//package testing.sqa.utils;
//
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.PerformsTouchActions;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.touch.WaitOptions;
//import io.appium.java_client.touch.offset.PointOption;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import java.awt.*;
//import java.sql.DriverManager;
//import java.time.Duration;
//
//public class Util {
//
//        public static void scrollDown(){
//            DriverManager AppDriver = null;
//            Dimension dimension = AppDriver.getDriver().manage().window().getSize();
//            int scrollStart = (int) (dimension.getHeight() * 0.5);
//            int scrollEnd = (int) (dimension.getHeight() * 0.2);
//
//            new TouchAction((PerformsTouchActions) AppDriver.getDriver())
//                    .press(PointOption.point(0, scrollStart))
//                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//                    .moveTo(PointOption.point(0, scrollEnd))
//                    .release().perform();
//        }
//
//        public static void scrollNClick(By listItems, String Text){
//            boolean flag = false;
//
//            while(true){
//                DriverManager AppDriver = null;
//                for(WebElement el: AppDriver.getDriver().findElements(listItems)){
//                    if(el.getAttribute("text").equals(Text)){
//                        el.click();
//                        flag=true;
//                        break;
//                    }
//                }
//                if(flag)
//                    break;
//                else
//                    scrollDown();
//            }
//        }
//
//        public static void scrollNClick(WebElement el){
//            int retry = 0;
//            while(retry <= 5){
//                try{
//                    el.click();
//                    break;
//                }catch (org.openqa.selenium.NoSuchElementException e){
//                    scrollDown();
//                    retry++;
//                }
//            }
//        }
//
//        public static void scrollIntoView(String Text){
//            DriverManager AppDriver;
//            ((AndroidDriver<MobileElement>) AppDriver.getDriver()).findElementByAndroidUIAutomator(
//                    "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + Text + "\").instance(0))").click();
//        }
//    }
//}
