import java.util.Scanner;
public class ChoseColor {
    public static String ChoseColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your color: ");
            String name = scanner.nextLine().trim();
            if (name.length() >= 2) {
                return name;
            }
            System.out.println("Color is too short. Try again.");
        }
    }

    public static String getColorSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select color (R-red, S-silver, G-green, B-black):");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "R": return "RED";
                case "S": return "SILVER";
                case "G": return "GREEN";
                case "B": return "BLACK";
                default:
                    System.out.println("Wrong color. Try again.");
            }
        }
    }
}