@Registro
Feature: Registro

  Background:
    Given El cliente se encutra en la home page de practice.automationtesting.in
    And Se dirige al Login

  Scenario Outline: El cliente no se puede registrar
    When Ingresa su email <email> y password <password>
    Then Observa el siguiente mensaje <mensaje>

    @ValoresVacios
    Examples:
      | email | password | mensaje                               |
      |       |          | Please provide a valid email address. |

    @FallidoporContraseña
    Examples:
      | email                  | password | mensaje                           |
      | correoprueba@gmail.com |          | Please enter an account password. |

