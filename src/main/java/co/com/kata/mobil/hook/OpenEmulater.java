package co.com.kata.mobil.hook;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.net.MalformedURLException;
import java.net.URL;

import static java.lang.System.getProperty;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenEmulater implements Task {
    private AppiumDriver driver;

    @Override
    public <T extends Actor> void performAs (T actor)  {


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
    public static Performable openAppiumMobile () {
        return instrumented(OpenEmulater.class);
    }
    }

