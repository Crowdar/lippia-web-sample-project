@LTM_cb9070ee-d4f9-4815-9432-055c44a9f1f2
Feature: googleSearch

  @Smoke @LIPWEB_000002
  Scenario: The client search by "A utomation"
    Given The client is in google page
    When The client search for word Automation
    Then The client verify that results are shown properly

  @Smoke @LIPWEB_000001
  Scenario: The client search by "crowdar"
    Given The client is in google page
    When The client search for word crowdar
    Then The client verify that results are shown properly

  @Smoke @LIPWEB_000003
  Scenario: The client search by "Docker"
    Given The client is in google page
    When The client search for word Docker
    Then The client verify that results are shown properly

  @Smoke @LIPWEB_000004
  Scenario: The client search by "Lippia"
    Given The client is in google page
    When The client search for word Lippia
    Then The client verify that results are shown properly