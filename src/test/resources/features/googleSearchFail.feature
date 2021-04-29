Feature: Scenario Fail

  @Smoke
  Scenario Outline: The client search "<word>"
    Given The client is in google page
    When The client search for word <word>
    Then The client verify that results are shown properly

  Examples:
  | word           | 
  | ´´´++}}{{[[]]  |

