Feature:  Abrir una aplicacion web

  Yo como alejandro
  Quiero realizar una prueba a la carta de elementos y las subFunciones
  Para comprobar la robuste y control de errores de la aplicacion o pagina web

  Background:
    Given "alejandro" abre el el servidor android y app

  @regression
  Scenario: validacion en la funcion del ID Card Elements
    And  ingresa al boton menu hamburgesa
    When selecciona el boton login
    Then ingresa "usuario" y "contraseña" validas