@Login
Feature: Login

    Background:
        Given El cliente se encuentra en el login

    @DistingueVariaciones @Fallido
    Scenario Outline: El cliente ingresa una variacion de datos a su cuenta
        When El cliente ingresa su usuario <username> y password <password> e ingresa a su cuenta
        Then El cliente ve un <mensaje> de error

        Examples:
            | username                     | password      | mensaje                                   |
            | germancorreoprueba@gmail.com | 123456CrOWdAR | The password you entered for the username |

    @Authenficacion @Exitoso
    Scenario Outline: El cliente ingresa a su cuenta, se deslogea y regresa al home login
        When El cliente ingresa su usuario <username> y password <password> e ingresa a su cuenta
        And El cliente se desloguea
        And El cliente vuelve atras
        Then El cliente se encuentra en el home login

        Examples:
            | username                     | password      |
            | germancorreoprueba@gmail.com | 123456crowdar |


