package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Display display = new Display();

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        assertEquals(200, wallet.getBalance(), "Correct wallet balance");
    }

    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        assertEquals(30, cashSlot.getContents());
    }

    @Then("the balance of my wallet should be $170")
    public void the_balance_of_my_wallet_should_be_$170() {
        assertEquals(170, wallet.getBalance(), "Correct wallet balance");
    }

    //__________________________________________________________________________
    @Given("I have deposited $50 in my wallet")
    public void I_have_deposited_$50_in_my_wallet() {
        wallet.deposit(50);
        assertEquals(50, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request $100")
    public void i_request_$100() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 100);
    }

    @Then("the withdrawal should be declined")
    public void the_withdrawal_should_be_declined() {
        assertEquals(0, cashSlot.getContents(), "Cash should not be dispensed");
    }

    //__________________________________________________________________________
    @Given("there is $100 in my wallet")
    public void there_is_$100_in_my_wallet() {
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance(), "Correct wallet balance");
    }

    @When("I withdraw $200")
    public void I_withdraw_$200() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents(), "Cash should not be dispensed");
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void I_should_be_told_that_I_dont_have_enough_money_in_my_wallet() {
        assertEquals("You do not have enough money in your wallet", wallet.getLastMessage());
    }

    //__________________________________________________________________________
    @Given("tthere is $100 in my wallet")
    public void there_is_100_in_my_wallet() {
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance(), "Initial wallet balance should be $100");
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        display.showBalance(wallet);
    }

    @Then("I should see that the balance is $100")
    public void i_should_see_that_the_balance_is_100() {
        assertEquals("Your balance is $100", display.getDisplayedMessage(), "The displayed balance should be $100");
    }

    // Scenario: Deposit of -$100
    @Given("I have $100 in my wallet")
    public void i_have_100_in_my_wallet() {
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance(), "Initial balance should be $100");
    }

    @When("I attempt to deposit -$100")
    public void i_attempt_to_deposit_negative_100() {
        wallet.deposit(-100);
    }

    @Then("the deposit should be declined")
    public void the_deposit_should_be_declined() {
        assertEquals("Invalid deposit amount", wallet.getLastMessage());
    }

    @Then("the balance of my wallet should not change")
    public void the_balance_of_my_wallet_should_not_change() {
        assertEquals(100, wallet.getBalance(), "Balance should remain the same after a failed deposit");
    }

    // Scenario: Withdrawal of -$100
    @When("I request -$100")
    public void i_request_negative_100() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, -100);
    }

    @Then("tthe withdrawal should be declined")
    public void tthe_withdrawal_should_be_declined() {
        assertEquals("Invalid withdrawal amount", wallet.getLastMessage());
    }

    @Then("the balance of my wallet should remain unchanged")
    public void the_balance_of_my_wallet_should_remain_unchanged() {
        assertEquals(100, wallet.getBalance(), "Balance should not change after a failed withdrawal");
    }

    // Scenario: Deposit of $0
    @When("I attempt to deposit $0")
    public void i_attempt_to_deposit_zero() {
        wallet.deposit(0);
    }

    @Then("the deposit should be declined for zero")
    public void the_deposit_should_be_declined_for_zero() {
        assertEquals("Deposit cannot be zero", wallet.getLastMessage());
    }

    @Then("my wallet balance should stay the same")
    public void my_wallet_balance_should_stay_the_same() {
        assertEquals(100, wallet.getBalance(), "Balance should not change after a zero deposit");
    }

    // Scenario: Withdrawal of $0
    @When("I request $0")
    public void i_request_zero() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 0);
    }

    @Then("no money should be dispensed")
    public void no_money_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents(), "No money should be dispensed for $0 withdrawal");
    }

    @Then("my wallet balance should not be affected")
    public void my_wallet_balance_should_not_be_affected() {
        assertEquals(100, wallet.getBalance(), "Balance should remain the same after a $0 withdrawal");
    }
}
