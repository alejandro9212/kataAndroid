package co.com.kata.mobil.ui.login;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class LoginUi {

    //hamburger menu
    public static final Target HAMBUR_MENU = the("Click en el elemento menu hambuegesa")
            .located(AppiumBy.xpath("//android.widget.ImageView[@content-desc='View menu']"));

    public static final Target HAMBUR_MENU2 = the("Click en el elemento menu hambuegesa")
            .located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/menuIV"));
}
