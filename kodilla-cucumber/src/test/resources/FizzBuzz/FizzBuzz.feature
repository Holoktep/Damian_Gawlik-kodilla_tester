Feature: FizzBuzz game
  In order to return specific strings for certain numbers
  As a developer
  I want to implement the FizzBuzz logic

  Scenario Outline: Check FizzBuzz output for given number
    Given I have the number <number>
    When I evaluate the number
    Then the result should be "<result>"

    Examples:
      | number | result    |
      | 3      | Fizz      |
      | 5      | Buzz      |
      | 15     | FizzBuzz  |
      | 7      | None      |
      | 30     | FizzBuzz  |
      | 9      | Fizz      |
      | 10     | Buzz      |
      | 8      | None      |