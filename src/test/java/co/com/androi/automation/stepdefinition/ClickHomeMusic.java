package co.com.androi.automation.stepdefinition;

import co.com.androi.automation.task.login.ClickBtnInicio;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class ClickHomeMusic {


    @Given("ingresa al boton menu hamburgesa")
    public void ingresaAlBotonMenuHamburgesa() {

       OnStage.theActorInTheSpotlight().attemptsTo(
                ClickBtnInicio.clickHamb()
        );

    }
    @When("selecciona el boton login")
    public void seleccionaElBotonLogin() {

    }
    @Then("ingresa {string} y {string} validas")
    public void ingresaYValidas(String string, String string2) {

    }


}
