public class LeapYear {
    public static boolean isLeapYear(int year) {
        // Sprawdzanie, czy rok jest przestępny
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Testowanie metody
        int year = 2024;
        System.out.println(year + " is a leap year: " + isLeapYear(year));
    }
}