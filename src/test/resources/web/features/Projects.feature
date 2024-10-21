@Smoke @CreateProject
Feature: Crear Proyecto


  Background:

    Given el usuario ingresa exitosamente al dashboard con el email 'test.register@yopmail.fr' y la contraseña '123456'

  @CreateProject @Fabi
  Scenario Outline: Crear un Proyecto exitosamente
    When hace clic en el botón 'Create Project'
    And hace clic en el botón 'Create new project'
    And ingresa '<nombreBase>' en el campo 'Project name'
    And hace clic en el botón 'Create' Project
    Then se crea exitosamente el nuevo Project con un nombre basado en '<nombreBase>'

    Examples:
      | nombreBase           |
      | Automation Workspace 2s|
