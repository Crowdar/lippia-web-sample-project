@Search

Feature: As a potential client i need to search in google to find a web site

  @Smoke
  Scenario: The client search by "crowdar"
    Given The client is on google page
    When The client search for word crowdar
    Then The client verify that results are shown properly

  @Smoke
  Scenario: The client search by "Automation"
    Given The client is on google page
    When The client search for word Automation
    Then The client verify that results are shown properly

  @Smoke
  Scenario: The client search by "Docker"
    Given The client is on google page
    When The client search for word Docker
    Then The client verify that results are shown properly

  @Smoke
  Scenario: The client search by "Lippia"
    Given The client is on google page
    When The client search for word Lippia
    Then The client verify that results are shown properly

  @Smoke
  Scenario Outline: The client search by <Word>
    Given The client is on google page
    When The client search for word <Word>
    Then The client verify that results are shown properly
    Examples:
    |Word             |
    |Crowdar Academy  |
    |Calidad          |
    |Software         |
    |Testing          |