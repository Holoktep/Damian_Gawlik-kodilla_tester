package wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
            wallet.setLastMessage("Withdrawal successful");
        } else {
            cashSlot.dispense(0);
            wallet.setLastMessage("You do not have enough money in your wallet");
        }
    }
}