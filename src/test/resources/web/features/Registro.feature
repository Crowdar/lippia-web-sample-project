@Registro
Feature: El cliente se crea una cuenta

  Background:
    Given El cliente se dirige al registro


  Scenario Outline: El cliente no se puede registrar
    When El cliente ingresa su email <email> y password <password>
    Then El cliente observa el siguiente mensaje <mensaje>

    @ValoresVacios
    Examples:
      | email | password | mensaje                               |
      |       |          | Please provide a valid email address. |

    @RegistroFallidoporContraseña
    Examples:
      | email                  | password | mensaje                           |
      | correoprueba@gmail.com |          | Please enter an account password. |

