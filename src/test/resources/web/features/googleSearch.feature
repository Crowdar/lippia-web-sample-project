Feature: As a potential client i need to search in google to find a web site

  @Smoke
  Scenario: The client search by "crowdar"
    Given The client is in google page
    When The client search for word crowdar
    Then The client verify that results are shown properly

  @Smoke
  Scenario: The client search by "A utomation"
    Given The client is in google page
    When The client search for word Automation
    Then The client verify that results are shown properly

  @Smoke
  Scenario: The client search by "Docker"
    Given The client is in google page
    When The client search for word Docker
    Then The client verify that results are shown properly

  @Smoke
  Scenario: The client search by "Lippia"
    Given The client is in google page
    When The client search for word Lippia
    Then The client verify that results are shown properly