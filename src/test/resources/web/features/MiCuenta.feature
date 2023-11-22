@MiCuenta
Feature: Mi Cuenta

  Background:
    Given El cliente se encuentra en el login
    When El cliente ingresa su usuario germancorreoprueba@gmail.com y password 123456crowdar e ingresa a su cuenta

  @Detalles
  Scenario: El cliente ingresa a su Dashboard
    And Se dirige a los detalles de su cuenta
    Then El cliente ve los detalles de su cuenta

  @Logout
  Scenario: El cliente sale de su cuenta
    And El cliente clickea en Logout
    Then El cliente esta fuera de su cuenta

