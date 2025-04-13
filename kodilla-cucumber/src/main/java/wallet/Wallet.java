package wallet;

public class Wallet {
    private int balance = 0;
    private String lastMessage = "";

    public Wallet() {}

    public void deposit(int money) {
        if (money <= 0) {
            lastMessage = "Invalid deposit amount";
            return;
        }
        this.balance += money;
        lastMessage = "Deposit successful";
    }

    public int getBalance() {
        return balance;
    }

    public void debit(int money) {
        this.balance -= money;
    }

    public void setLastMessage(String message) {
        this.lastMessage = message;
    }

    public String getLastMessage() {
        return lastMessage;
    }
}