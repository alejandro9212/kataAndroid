package co.com.kata.mobil.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class StarEmulatAppium {
    private AppiumDriver driver;
    public  void configApp (){

         UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName("emulator-5554")
                .setPlatformVersion("15")
                .setApp("D:\\katanueve\\kataautomatizacionmobil\\apps\\mda-2.2.0-25.apk")
                .setAppPackage("com.saucelabs.mydemoapp.android")
                .setAppActivity("com.saucelabs.mydemoapp.android.view.activities.SplashActivity")
                .setAutoGrantPermissions(true);


        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Error en URL de Appium: " + e.getMessage(), e);
        }

    }
}
