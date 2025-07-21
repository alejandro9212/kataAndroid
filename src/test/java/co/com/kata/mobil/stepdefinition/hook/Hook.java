package co.com.kata.mobil.stepdefinition.hook;



import co.com.kata.mobil.hook.OpenEmulater;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hook {

@Managed(driver = "Appium")
    public static WebDriver driver;

/*private static boolean beforeAll = true;*/

    @Before
    public void setTheStage () {
        OnStage.setTheStage(new OnlineCast());
    }
    //private AppiumDriver driver;
    @Given("{string} abrir la connexion del emulador")
    public void abrirLaConnexionDelEmulador (String actor) {

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


/*@Before(order = 1)
    public void setUp(){
    if (beforeAll){
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run () {
                driver.quit();
                driver = null;
            }
        });

        beforeAll = false;
            }
       }*/

    /*@Before(order = 2)
    public void PrepareStage(){

       OnStage.setTheStage(OnlineCast.whereEveryoneCan(BrowseTheWeb.with(getProxiedDriver())));
    }*/


 /*@After
 public void logOut(){
    try{
        AppiumDriver facade = getProxiedDriver();
        facade.close();

    } catch (Exception e) {
        Logger.getAnonymousLogger().log(Level.WARNING,"could not close driver,appiumDriver not foun",e);
    }
 }*/







}




