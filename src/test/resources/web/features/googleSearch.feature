@Search
Feature: As a potential client i need to search in google to find a web site

  @Smoke
  Scenario Outline: The client search by <Word>
    Given The client is on google page
    When The client search for word <Word>
    Then The client verify that results are shown properly
    @FirstIteration
    Examples:
       |Word             |
       |Crowdar          |
       |Automation       |
       |Docker           |
       |Lippia           |
    @SecondIteration
    Examples:
      |Word             |
      |Crowdar Academy  |
      |Calidad          |
      |Software         |
      |Testing          |