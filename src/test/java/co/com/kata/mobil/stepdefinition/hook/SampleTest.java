package co.com.kata.mobil.stepdefinition.hook;

import co.com.kata.mobil.task.logintask.ClickMenu;
import co.com.kata.mobil.utils.StarEmulatAppium;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static co.com.kata.mobil.utils.Constants.ACTOR;

public class SampleTest {
    //@Before
    public void setTheStage () {

    }

    //@BeforeEach
    public void configAppium(){

        StarEmulatAppium starEmulatAppium = new StarEmulatAppium();
        starEmulatAppium.configApp();


        }
    @Test
    void sampleTestSerenity(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR).attemptsTo(
                ClickMenu.clickHamb()
        );
    }
}
