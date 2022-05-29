Feature: Addition

  Scenario Outline: Add two numbers
    Given User is on https://testpages.herokuapp.com/calculate.php page
    When User inputs <first input> to first input
    And User inputs <second input> to second input
    And User selects addition
    And User clicks Calculate
    Then The answer should say <answer>

    Examples:
      | first input    | second input | answer |
      | 1              | 2            | 3      |
      | 3              | 4            | 7      |
      | 5              | 6            | 11     |