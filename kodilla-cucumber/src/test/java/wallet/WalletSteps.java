package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    Display display = new Display();
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
        assertEquals(170,  wallet.getBalance(), "Correct wallet balance");
    }
    //__________________________________________________________________________
    @Given("I have deposited $50 in my wallet")
    public void I_have_deposited_$50_in_my_wallet(){
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
    @Given ("there is $100 in my wallet")
    public void there_is_$100_in_my_wallet(){
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance(), "Correct wallet balance");
    }

    @When("I withdraw $200")
    public void I_withdraw_$200(){
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }

    @Then ("nothing should be dispensed")
    public void nothing_should_be_dispensed(){
        assertEquals(0, cashSlot.getContents(), "Cash should not be dispensed");
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void I_should_be_told_that_I_dont_have_enough_money_in_my_wallet(){
        assertEquals("You do not have enough money in your wallet", wallet.getLastMessage());
    }
    //__________________________________________________________________________
    @Given("tthere is $100 in my wallet")
    public void tthere_is_$100_in_my_wallet() {
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance());
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        display.showMessage("Your balance is $" + wallet.getBalance());
    }

    @Then("I should see that the balance is $100")
    public void i_should_see_that_the_balance_is_$100() {
        assertEquals("Your balance is $100", display.getDisplayedMessage());
    }
}