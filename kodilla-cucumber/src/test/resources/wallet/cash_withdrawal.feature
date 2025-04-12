Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Withdrawal exceeding wallet balance
    Given I have deposited $50 in my wallet
    When I request $100
    Then the withdrawal should be declined