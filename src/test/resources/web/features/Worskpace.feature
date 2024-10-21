
@Smoke
Feature: Crear Workspace

  @Smoke
  Scenario Outline: Crear un workspace exitosamente
    Given el usuario ingresa exitosamente al dashboard de Clockify con el email 'test.register2@yopmail.fr' y la contraseña '123456'
    When el usuario accede a la sección 'Manage workspaces'
    And hace clic en el botón 'Create new workspace'
    And ingresa '<nombreBase>' en el campo 'Workspace name'
    And hace clic en el botón 'Create'
    Then se crea exitosamente el nuevo workspace con un nombre basado en '<nombreBase>'

    Examples:
      | nombreBase                  |
      | Automation Workspace        |


  @Smoke
  Scenario Outline: Editar nombre un workspace exitosamente
    Given el usuario ingresa exitosamente al dashboard de Clockify con el email 'test.register@yopmail.fr' y la contraseña '123456'
    When el usuario accede a la sección 'Manage workspaces'
    And hace clic en el botón 'Settings'
    And ingresa '<nombreBase>' en el campo 'Workspace name' para editar
    And hace clic en el navbar
    Then actualiza exitosamente el nombre del workspace

    Examples:
      | nombreBase |
      | edit       |