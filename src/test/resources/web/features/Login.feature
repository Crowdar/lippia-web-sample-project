
@Smoke @Login
Feature: Inicio de Sesion


  Background:

    Given El usuario está en la página de inicio de Clockify
    And ingresa a la seccion 'Log In'

@LoginSuccess
  Scenario: Realizar inicio de sesión manualmente exitosamente
    When El usuario selecciona la opción 'Log in manually'
    And Ingresa 'test.register@yopmail.fr' en el campo 'Enter email'
    And Ingresa '123456' en el campo 'Enter password'
    And Presiona el botón 'Log In'
    Then El usuario ingresa exitosamente al dashboard de Clockify

  @LoginFailed
  Scenario Outline: Iniciar sesión con correo inválido y contraseña correcta
    When El usuario selecciona la opción 'Log in manually'
    And Ingresa '<email>' en el campo 'Enter email'
    And Ingresa '<password>' en el campo 'Enter password'
    And Presiona el botón 'Log In'
    Then Se visualiza alerta '<alert>' indicando que el correo es inválido

    Examples:
      | email                   | password | alert                     |
      | test.registeryopmail.fr | 123456   | Email format is not valid |
      | test.                   | 123456   | Email format is not valid |

  @LoginFailed
  Scenario Outline: Iniciar sesión con correo válido y contraseña incorrecta
    When El usuario selecciona la opción 'Log in manually'
    And Ingresa '<email>' en el campo 'Enter email'
    And Ingresa '<password>' en el campo 'Enter password'
    And Presiona el botón 'Log In'
    Then Se visualiza alerta '<alert>' indicando que la contraseña es incorrecta

    Examples:
      | email                    | password | alert                     |
      | Test.Register@yopmail.fr | 12345678 | Invalid email or password |

  @LogOut
  Scenario: Realizar logout exitosamente
    When El usuario selecciona la opción 'Log in manually'
    And Ingresa 'test.register@yopmail.fr' en el campo 'Enter email'
    And Ingresa '123456' en el campo 'Enter password'
    And Presiona el botón 'Log In'
    And Presiona el botón 'Log Out'
    Then El usuario está en la página de inicio de Clockify