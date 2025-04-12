package wallet;

public class Display {
    private String message = "";

    public void showMessage(String message) {
        this.message = message;
    }

    public String getDisplayedMessage() {
        return message;
    }
}
