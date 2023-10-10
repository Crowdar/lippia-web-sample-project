@MiCuenta
Feature: El cliente se encuentra en su cuenta

  Background:
    Given El cliente se encuentra en el login
    When El cliente ingresa usuario germancorreoprueba@gmail.com y password 123456crowdar

  @Dashboard
  Scenario: El cliente ingresa a su Dashboard
    And El cliente clickea sobre My Account
    Then El cliente ve su Dashborad

  @Ordenes
  Scenario: El cliente ingresa a ver sus Ordenes
    And El cliente se dirije a su Ordenes
    Then El cliente ve sus Ordenes

  @Logout
  Scenario: El cliente sale de su cuenta
    And El cliente clickea en Logout
    Then El cliente esta fuera de su cuenta

