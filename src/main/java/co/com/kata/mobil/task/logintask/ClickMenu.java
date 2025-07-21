package co.com.kata.mobil.task.logintask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.kata.mobil.ui.login.LoginUi.HAMBUR_MENU;
import static co.com.kata.mobil.ui.login.LoginUi.HAMBUR_MENU2;
import static co.com.kata.mobil.utils.Constants.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ClickMenu implements Task {
    @Override
    public <T extends Actor> void performAs (T actor) {
        OnStage.setTheStage(new OnlineCast());
        actor.attemptsTo(
                WaitUntil.the(HAMBUR_MENU,isVisible()).forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(HAMBUR_MENU)
        );
    }

    public static ClickMenu clickHamb () {

        return Tasks.instrumented(ClickMenu.class);
    }
}
