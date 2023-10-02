@Home_Menu
Feature: HOME MENU
  @Sliders
  Scenario: Home Page with three sliders only
    Given The user enter the URL "http://practice.automationtesting.in/"
    When the user click on Shop menu button
    And the user click on Home menu button
    Then the user verifies that the Home page has three Sliders only
