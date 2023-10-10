@Login
Feature: El cliente se encuentra en el login

    Background:
        Given El cliente se dirige al login

    @LoginExitoso
    Scenario: El cliente ingresa a su cuenta
        When El cliente ingresa usuario germancorreoprueba@gmail.com y password 123456crowdar
        Then El cliente se logea exitosamente


    @LoginFallido
    Scenario Outline: El cliente ingresa a su cuenta
        When El cliente ingresa usuario <username> y password <password>
        Then El cliente no puede ingresar a su cuenta

        @LoginFallidoporPasswordIncorrecto
        Examples:
            | username                    | password |
            | germancorreoprueb@gmail.com | 1        |
        @LoginFallidoporInputVacio
        Examples:
            | username                    | password |
            | germancorreoprueb@gmail.com |          |

