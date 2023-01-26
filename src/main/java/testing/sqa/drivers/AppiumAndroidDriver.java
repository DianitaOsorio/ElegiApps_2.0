package testing.sqa.drivers;


import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAndroidDriver {

    public static AppiumDriver<MobileElement> driver;

    public static AppiumAndroidDriver yourBrowser(){
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName","SM-G610M");
            capabilities.setCapability("udid","52039125ee3064fb");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("appPackage","movistar.android.app");
            capabilities.setCapability("appActivity",".MainActivity");
            capabilities.setCapability("noReset","true");
            capabilities.setCapability("platformVersion","8.1.0");
            capabilities.setCapability("enableMultiWindows", true);
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return new AppiumAndroidDriver();
    }

    public AppiumDriver<MobileElement> onDriver(){
        return driver;
    }

}
