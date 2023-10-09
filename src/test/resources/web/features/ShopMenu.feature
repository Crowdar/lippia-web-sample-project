@Home_Menu
Feature: HOME MENU
  @Mode
Scenario Outline: Shop <mode> Sorting Functionality
Given The user enter the URL "http://practice.automationtesting.in/"
When the user Click on Shop Menu
And the user click on Sort by <mode> item in Default sorting dropdown
Then the user can view the popular products only

Examples:
| mode |
| Popularity  |
| Average  |
| Newness  |
| Low  |
| High  |
