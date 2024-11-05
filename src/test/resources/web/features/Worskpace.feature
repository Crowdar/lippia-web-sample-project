@Workspace @Regression @TestFabi
Feature: Workspace

  @CreateWorkspace
  Scenario Outline: Create a workspace Successfully
    Given the user successfully logs into the dashboard with the email 'test.register2@yopmail.fr' and the password '123456'
    When the user accesses the 'Manage workspaces' section
    And clicks on the 'Create new workspace' button
    And enters '<nombreBase>' in the 'Workspace name' field
    And clicks on the 'Create' button
    Then the new workspace is successfully created with a name based on '<nombreBase>'

    Examples:
      | nombreBase                  |
      | Automation Workspace        |


  @EditWorkspace
  Scenario Outline: Edit a workspace name Successfully
    Given the user successfully logs into the dashboard with the email 'test.register@yopmail.fr' and the password '123456'
    When the user accesses the 'Manage workspaces' section
    And clicks on the 'Settings' button
    And enters '<nombreBase>' in the 'Workspace name' field to edit
    Then the workspace name is successfully updated to '<nombreBase>'

    Examples:
      | nombreBase |
      | Lippia web |