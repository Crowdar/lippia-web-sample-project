Feature: As a potential client i need to search in google to find a web site

  @GoogleSearch @CrowdarAcademy
  Scenario: Show results for "Crowdar Academy" on Google search engine.
    Given The client is on google page
    When The client search for word Crowdar Academy
    Then The client verify that results are shown properly

  @GoogleSearch @Calidad
  Scenario: Show results for "Calidad" on Google search engine.
    Given The client is on google page
    When The client search for word Calidad
    Then The client verify that results are shown properly

  @GoogleSearch @Software
  Scenario: Show results for "Software" on Google search engine.
    Given The client is on google page
    When The client search for word Software
    Then The client verify that results are shown properly

  @GoogleSearch @Testing
  Scenario: Show results for "Testing" on Google search engine.
    Given The client is on google page
    When The client search for word Testing
    Then The client verify that results are shown properly


  @Smoke @GoogleSearch
  Scenario Outline: Show results for <keyword> on Google search engine.
    Given The client is on google page
    When The client search for word <keyword>
    Then The client verify that results are shown properly

    @CrowdarAcademy
    Examples:
      | keyword         |
      | Crowdar Academy |

    @Calidad
    Examples:
      | keyword |
      | Calidad |

    @Software
    Examples:
      | keyword  |
      | Software |

    @Testing
    Examples:
      | keyword |
      | Testing |