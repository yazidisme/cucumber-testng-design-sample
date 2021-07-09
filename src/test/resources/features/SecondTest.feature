Feature: This is second test feature

  @positive_case
  Scenario Outline: First multiple scenario
    Given Input "<sample>" data
    When It's processing
    Then Output should be equal expected result
    Examples:
      | sample |
      | one    |
      | two    |
