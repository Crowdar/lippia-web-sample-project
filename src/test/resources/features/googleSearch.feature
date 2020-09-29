Feature: As a potential client i need to search in google to find a web site

  @Smoke
  Scenario Outline: The client search by "<word>"
    Given The client is in google page
    When The client search for word <word>
    Then The client verify that results are shown properly

  Examples:
  | word           | 
  | crowdar        |
  | automation     |
  | docker         |
  | vagrant        |

