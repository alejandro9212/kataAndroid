package co.com.androi.automation.hook;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CustomAndroidDriver implements DriverSource {

    @Override
    public WebDriver newDriver() {
        String deviceName = System.getProperty("deviceName", "emulator-5554");
        String platformVersion = System.getProperty("platformVersion", "16");
        String appPackage = System.getProperty("appPackage", "com.google.android.apps.youtube.music");
        String appActivity = System.getProperty("appActivity", ".activities.MusicActivity");
        String appWaitActivity = System.getProperty("appWaitActivity", "com.google.android.apps.youtube.music.activities.MusicActivity");
        String appiumServerUrl = System.getProperty("appiumServerUrl", "http://localhost:4723/");

        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName(deviceName)
                .setPlatformVersion(platformVersion)
                .setAppPackage(appPackage)
                .setAppActivity(appActivity)
                .setAppWaitActivity(appWaitActivity)
                .setAutoGrantPermissions(true)
                .setIgnoreHiddenApiPolicyError(true)
                .setNewCommandTimeout(Duration.ofSeconds(30));
                //.setFullReset(false);

        try {
            return new AndroidDriver(new URL(appiumServerUrl), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Error al crear el AndroidDriver", e);
        }
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}