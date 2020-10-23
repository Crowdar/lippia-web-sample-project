Feature: As a potential client i need to search in google to find a web site comentario

  @SmokeScenario
  Scenario: The client search by "crowdar"
    Given The client is in google page
    When The client search for word crowdar
    Then The client verify that results are shown properly

  @SmokeScenario
  Scenario: The client search by "automation"
    Given The client is in google page
    When The client search for word automation
    Then The client verify that results are shown properly

  @SmokeScenario
  Scenario: The client search by "docker"
    Given The client is in google page
    When The client search for word docker
    Then The client verify that results are shown properly
	
  @SmokeScenario
  Scenario: The client search by "vagrant"
    Given The client is in google page
    When The client search for word vagrant
    Then The client verify that results are shown properly 
