public class AdvCalculator {
    public double calculate() {
        String userSelected = UserDialogs.getUserSelection();
        int a = UserDialogs.getValue();
        int b = UserDialogs.getValue();
        double result = 0;
        switch (userSelected) {          // [1]
            case "ADD": result = a + b;
            case "SUB": result = a - b;
            case "DIV": result = a / b;
            case "MUL": result = a * b;
        }
        return result;
    }
}