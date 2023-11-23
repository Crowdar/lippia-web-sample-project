@MiCuenta
Feature: Mi Cuenta

  Background:
    Given El cliente se encutra en la home page de practice.automationtesting.in
    And Se dirige al Login
    When El cliente ingresa su usuario germancorreoprueba@gmail.com y password 123456crowdar e ingresa a su cuenta

  @Detalles
  Scenario: El cliente ingresa a detalles
    And Se dirige a los detalles de su cuenta
    Then El cliente ve los detalles de su cuenta

  @Logout
  Scenario: El cliente sale de su cuenta
    And Clickea en Sign Out para salir del sitio
    Then El cliente esta fuera de su cuenta

