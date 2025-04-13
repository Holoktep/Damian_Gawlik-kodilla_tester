package wallet;

public class Display {
    private String message = "";

    // Metoda do wyświetlania balansu portfela
    public void showBalance(Wallet wallet) {
        this.message = "Your balance is $" + wallet.getBalance();
    }

    public String getDisplayedMessage() {
        return message;
    }
}
