Trabajo final - Kata "Automatización de Pruebas en Aplicaciones Móviles para Android nativos con Appium, Java, Serenity y Cucumber"
Realizado por: 
● Jhon Alejandro tobon arias

pasos con Serenity y Cucumber

Serenity BDD es una biblioteca que facilita la redacción de pruebas de aceptación automatizadas de alta calidad, con potentes funciones de generación de informes y documentación viva. Ofrece un sólido soporte tanto para pruebas web con Selenium como para pruebas de API con RestAssured.

Serenity fomenta un buen diseño de automatización de pruebas y es compatible con varios patrones de diseño, incluidos los clásicos objetos de página, el nuevo enfoque de objetos de página/clases de acción Lean y el patrón Screenplay, más sofisticado y flexible.

La última versión de Serenity es compatible con Cucumber 6.x.



El proyecto inicial

En este proyecto encontramos una automatizacion inicial de android con appium, serenity, screeanplay y cucumber especificando la apertura de la aplicacion web desde una apk.
Encontraremos la estructura de las clases y metodos que ejecutasn los test que corren con junit 5, junto con sus respectivas dependencias.


estructura base

src
  + main
  + test
    + java                        Test runners and supporting code
    + resources
      + features                  Feature files
     + search                  Feature file subdirectories 
             search_by_keyword.feature

    Ejemplo de esenario feature
Feature: automatizacion android

  Background:
  Given "Alejandro" abrir la connexion del emulador

  @login
  Scenario: inicio de sesion fallido
    Given El usuario abre la aplicación
    When  ingresa sus credenciales correctas
    Then  debe mostrar una confirmación indicando que fue exitoso.

Implementacion Screeanplay - Step definitions


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

    
        
