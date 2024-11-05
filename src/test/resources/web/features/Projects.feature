@Projects @Regression  @TestFabi
Feature: Projects

  Background:
    Given the user successfully logs into the dashboard with the email 'test.register@yopmail.fr' and the password '123456'

  @CreateProject
  Scenario Outline: Create a project successfully
    When clicks on the 'Create Project' button
    And clicks on the 'Create new project' button
    And enters '<nombreBase>' in the 'Project name' field
    And user clicks on the 'Create' button
    Then the new project is successfully created with a name based on '<nombreBase>'
    And an alert 'Project '<nombreBase>' has been created' is displayed

    Examples:
      | nombreBase           |
      | Automation Workspace 1|
