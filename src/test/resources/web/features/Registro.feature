@Registro
Feature: El cliente se crea una cuenta

  Background:
    Given El cliente se dirige al registro

  @RegistroExitoso
  Scenario: El cliente se registra exitosamente
    When El cliente registra su email @gmail.com
    And Registra su password 123456$crowdar27
    Then El cliente se registra exitosamente

  @RegistroFallido
  Scenario Outline: El cliente no se puede registrar
    When El cliente ingresa su email <email> y password <password>
    Then El cliente observa el siguiente mensaje <mensaje>

    @RegistroFallidoporEmail
    Examples:
      | email            | password      | mensaje                               |
      | correoprueb@mail | 123456crowdar | Please provide a valid email address. |
    @RegistroFallidoporContraseña
    Examples:
      | email                  | password | mensaje                           |
      | correoprueba@gmail.com |          | Please enter an account password. |

