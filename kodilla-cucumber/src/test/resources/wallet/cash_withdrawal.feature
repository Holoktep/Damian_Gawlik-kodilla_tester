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

  Scenario: Deposit of -$100
    Given I have $100 in my wallet
    When I attempt to deposit -$100
    Then the deposit should be declined
    And the balance of my wallet should not change

  Scenario: Withdrawal of -$100
    Given I have $100 in my wallet
    When I request -$100
    Then tthe withdrawal should be declined
    And the balance of my wallet should remain unchanged

  Scenario: Deposit of $0
    Given I have $100 in my wallet
    When I attempt to deposit $0
    Then the deposit should be declined
    And my wallet balance should stay the same

  Scenario: Withdrawal of $0
    Given I have $100 in my wallet
    When I request $0
    Then no money should be dispensed
    And my wallet balance should not be affected