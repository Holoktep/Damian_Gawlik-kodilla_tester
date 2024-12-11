public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[]{"Tomek", "Mateusz", "Bartek", "Robert", "Hania"};
        for (String friend : names) {
            System.out.println(friend);
            int numberOfElements = names.length;
            System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");
        }
    }
}

