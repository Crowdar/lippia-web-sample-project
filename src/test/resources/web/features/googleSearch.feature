Feature: As a potential client i need to search in google to find a web site

  @Smoke
  Scenario Outline: The client search by <search_for>
    Given The client is on google page
    When The client search for word <search_for>
    Then The client verify that results are shown properly

    Examples:
      | search_for |
      | crowdar    |
      | Automation |
      | Docker     |
      | Lippia     |
      | High       |
