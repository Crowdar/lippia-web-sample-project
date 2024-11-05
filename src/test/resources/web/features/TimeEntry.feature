@TimeEntry @Regression @TestFabi
Feature: Time Entry

  Background:
    Given the user successfully logs into the dashboard with the email 'test.register03@yopmail.fr' and the password '123456'

   @AddTimeEntry
  Scenario: Add manual work time Successfully
    When selects project 'Automation web' from the time tracker
    And enter start time '09:30'
    And enter end time '18:00'
    And enter a description for the hours to add 'Lippia web automated'
    And enter date '05/11/2024'
    And selects tag 'Lippia web'
    And press the button 'Add'
    Then an alert is displayed 'Time entry has been created'
    And the start time '09:30', end time '18:00', and description 'Lippia web automated' are loaded correctly

  @UpdateTimeEntry
  Scenario: Modify start and end time of a work time
    When select a previously loaded work hour
    And enter new start time '22:30'
    And enter new end time '23:00'
    Then an alert is displayed 'Successfully updated date and time'


  @UpdateDescriptionEntry
  Scenario: Modify description of a work time entry
    When select a previously loaded work hour
    And enter a new description for the hours to add 'test new hours'
    Then an alert is displayed 'Successfully updated description'


  @UpdateTypeBillableEntry
  Scenario: Modify type of a work time entry
    When select a previously loaded work hour
    And change to non-billable
    Then an alert is displayed 'Time entry successfully marked as non-billable'


  @UpdateProjectTimeEntry
  Scenario: Modify project of a work time entry
    When select a previously loaded work hour
    And select a new project 'Lippia Code Web' from the time tracker
    Then an alert is displayed 'Project has been updated'


  @DiscardTimeEntry
  Scenario: Cancel Successfully a work time
    When selects project 'Automation web' from the time tracker
    And press 'Timer Mode' button
    And press the button 'Start'
    And select 'Discard' option
    Then an alert is displayed 'Timer cancelled'

  @DeleteTimeEntry
  Scenario: Delete work time successfully
    When select the options menu of a loaded hour
    And select the delete option
    Then an alert is displayed 'Time entry has been deleted'
