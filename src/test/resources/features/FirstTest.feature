Feature: This is first test feature

  @positive_case
  Scenario: First single scenario
    Given Start with valid data input
    When It's processing
    Then Output should be equal expected result

  @negative_case
  Scenario: Second single scenario
    Given Other input with invalid data
    When It's processing
    Then Output should not be equal expected result
