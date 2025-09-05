package co.com.androi.automation.stepdefinition;

import co.com.androi.automation.hook.CustomAndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class Hook {

    private WebDriver driver;

    @Before
    public void setUpMobile() {
        OnStage.setTheStage(new OnlineCast());
        // Inicializa el driver personalizado
        driver = new CustomAndroidDriver().newDriver();
    }

    @Given("{string} abre el el servidor android y app")
    public void abreElElServidorAndroidYApp(String actorName) {
        // Asigna el driver al actor
        OnStage.theActorCalled(actorName).can(
                BrowseTheWeb.with(driver)
        );
    }
}