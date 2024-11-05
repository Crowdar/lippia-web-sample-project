@Login @Regression @TestFabi
Feature: Login

  Background:

    Given The user is on the Clockify homepage
    And navigates to the 'Log In' section

  @LoginSuccess
  Scenario: Successfully log in manually
    When The user selects the 'Log in manually' option
    And Enters 'test.register@yopmail.fr' in the 'Enter email' field
    And Enters '123456' in the 'Enter password' field
    And Presses the 'Log In' button
    Then The user successfully logs into the Clockify dashboard

  @LoginFailed
  Scenario Outline: Log in with invalid email and correct password
    When The user selects the 'Log in manually' option
    And Enters '<email>' in the 'Enter email' field
    And Enters '<password>' in the 'Enter password' field
    And Presses the 'Log In' button
    Then An alert '<alert>' is displayed indicating that the email is invalid

    Examples:
      | email                   | password | alert                     |
      | test.registeryopmail.fr  | 123456   | Email format is not valid |
      | test.                    | 123456   | Email format is not valid |

  @LogOut
  Scenario: Successfully log out
    When The user selects the 'Log in manually' option
    And Enters 'test.register@yopmail.fr' in the 'Enter email' field
    And Enters '123456' in the 'Enter password' field
    And Presses the 'Log In' button
    And Presses the 'Log Out' button
    Then The user is on the Clockify homepage