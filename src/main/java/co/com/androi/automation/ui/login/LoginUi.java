package co.com.androi.automation.ui.login;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class LoginUi {

    //hamburger menu
    public static final Target BTN_ACCEDER = the("Acceder a la app")
            .located(AppiumBy.id("com.google.android.apps.youtube.music:id/sign_in_button"));

    public static final Target LABEL_MUSIC = the("palabra music para visualizar el inicio de la pagina")
            .located(AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"com.google.android.apps.youtube.music:id/toolbar\"]/android.widget.ImageView\n"));

    public static final Target BTN_RELAX  = the("Click en el boton RElax")
            .located(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.youtube.music:id/chip_cloud_chip_text\" and @text=\"Relajación\"]\n"));


}
