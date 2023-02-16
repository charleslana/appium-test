package driver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import propertie.PropertiesOperations;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Driver {

    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        if (driver == null) {
            return createInstance();
        }
        return driver;
    }

    public static AppiumDriver createInstance() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", PropertiesOperations.getPropertyValueByKey("deviceName"));
        cap.setCapability("uuid", PropertiesOperations.getPropertyValueByKey("uuid"));
        cap.setCapability("platformName", PropertiesOperations.getPropertyValueByKey("platformName"));
        cap.setCapability("platformVersion", PropertiesOperations.getPropertyValueByKey("platformVersion"));
        cap.setCapability("appPackage", PropertiesOperations.getPropertyValueByKey("appPackage"));
        cap.setCapability("appActivity", PropertiesOperations.getPropertyValueByKey("appActivity"));
        URL url;
        try {
            url = new URL(PropertiesOperations.getPropertyValueByKey("url"));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver = new AppiumDriver(url, cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    public static void closeApp() {
        driver.quit();
    }
}
