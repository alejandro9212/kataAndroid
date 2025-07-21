
Feature: automatizacion android

  Background:
  Given "Alejandro" abrir la connexion del emulador

  @login
  Scenario: inicio de sesion fallido
    Given El usuario abre la aplicación
    When  ingresa sus credenciales correctas
    Then  debe mostrar una confirmación indicando que fue exitoso.

