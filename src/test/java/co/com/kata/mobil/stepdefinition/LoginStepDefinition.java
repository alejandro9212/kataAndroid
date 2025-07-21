package co.com.kata.mobil.stepdefinition;

import co.com.kata.mobil.task.logintask.ClickMenu;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.jupiter.api.Test;


import static co.com.kata.mobil.utils.Constants.ACTOR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class LoginStepDefinition {



    @Given("El usuario abre la aplicación")
    public void theUserOpensTheApplication () {
       //OnStage.setTheStage(new OnlineCast());
      OnStage.theActorCalled(ACTOR).attemptsTo(
                ClickMenu.clickHamb()
        );


    }
    @When("ingresa sus credenciales correctas")
    public void enter_your_correct_credentials () {



    }
    @Then("debe mostrar una confirmación indicando que fue exitoso.")
    public void should_display_a_confirmation_indicating_that_it_was_successful () {

    }
}
