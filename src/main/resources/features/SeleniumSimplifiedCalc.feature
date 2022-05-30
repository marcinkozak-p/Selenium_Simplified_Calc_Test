Feature: Simple calculator operations on two numbers

  Background:
    Given User is on https://testpages.herokuapp.com/calculate.php page

  Scenario Outline: Add two numbers
    When User inputs <first input> to first input
    And User inputs <second input> to second input
    And User selects plus in operations list
    And User clicks Calculate
    Then The answer should say <answer>

    Examples:
      | first input          | second input         | answer               |
      | 1                    | 2                    | 3                    |
      | 3                    | 4                    | 7                    |
      | 5                    | 6                    | 11                   |
      |                      | 2                    | ERR                  |
      | 689                  |                      | ERR                  |
      | 5                    | 6                    | 11                   |
      | one                  | 2                    | ERR                  |
      | 1                    | two                  | ERR                  |
      | 12345678901234567890 | 12345678901234567890 | 24691357802469135780 |
      | 10000000000000002    | 1                    | 10000000000000003    |
      | 0.0000001            | 1                    | 1.0000001            |

  Scenario Outline: Subtract two numbers
    When User inputs <first input> to first input
    And User inputs <second input> to second input
    And User selects minus in operations list
    And User clicks Calculate
    Then The answer should say <answer>

    Examples:
      | first input | second input | answer |
      | 1           | 2            | -1     |
      | 13          | 4            | 9      |
      | 0           | 0            | 0      |
      | -1          | -1           | 0      |
      |             | 2            | ERR    |
      | 689         |              | ERR    |
      | one         | 2            | ERR    |
      | 1           | two          | ERR    |


  Scenario Outline: Multiply two numbers
    When User inputs <first input> to first input
    And User inputs <second input> to second input
    And User selects times in operations list
    And User clicks Calculate
    Then The answer should say <answer>

    Examples:
      | first input          | second input         | answer                                  |
      | 3                    | 0                    | 0                                       |
      | 3                    | 4                    | 12                                      |
      | -1                   | -2                   | 2                                       |
      | -93                  | 0.5                  | -46.5                                   |
      | 1                    | 1                    | 1                                       |
      | 011                  | 003                  | 33                                      |
      | -1                   | 0                    | -0                                      |
      |                      | 2                    | ERR                                     |
      | 689                  |                      | ERR                                     |
      | one                  | 2                    | ERR                                     |
      | 1                    | two                  | ERR                                     |
      | 12345678901234567890 | 12345678901234567890 | 152415787532388367501905199875019052100 |


  Scenario Outline: Divide two numbers
    When User inputs <first input> to first input
    And User inputs <second input> to second input
    And User selects divide in operations list
    And User clicks Calculate
    Then The answer should say <answer>

    Examples:
      | first input | second input | answer    |
      | 12          | 2            | 6         |
      | 1           | 3            | 0.333333  |
      | 2           | 3            | 0.666667  |
      | 5           | 0            | ERR       |
      | 0           | 123          | 0         |
      | -1          | 3            | -0.333333 |
      | 25          | -5           | -5        |
      |             | 2            | ERR       |
      | 689         |              | ERR       |
      | one         | 2            | ERR       |
      | 1           | two          | ERR       |
      | 0.0000005   | 1            | 0.0000005 |
      | 0.000001   | 10            | 0.0000001 |