package co.com.androi.automation.task.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.androi.automation.ui.login.LoginUi.*;
import static co.com.androi.automation.utils.Constants.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ClickBtnInicio implements Task {
    @Override
    public <T extends Actor> void performAs (T actor) {
        OnStage.setTheStage(new OnlineCast());
        actor.attemptsTo(
                //WaitUntil.the(BTN_ACCEDER,isVisible()).forNoMoreThan(TIME_SHORT).seconds()
                //Click.on(BTN_ACCEDER),
                WaitUntil.the(LABEL_MUSIC,isVisible()).forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(BTN_RELAX)
        );
    }

    public static ClickBtnInicio clickHamb () {

        return Tasks.instrumented(ClickBtnInicio.class);
    }
}
