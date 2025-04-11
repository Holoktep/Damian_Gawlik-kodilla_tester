package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
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
}