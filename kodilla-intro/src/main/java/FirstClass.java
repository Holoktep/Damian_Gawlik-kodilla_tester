public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 500, 2022);
        System.out.println(" notebook weight " + notebook.weight + " price " + notebook.price + " year " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 700, 2016);
        System.out.println(" heavynotebook weight " + heavyNotebook.weight + " price " + heavyNotebook.price + " year " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();


        Notebook oldNotebook = new Notebook(1600, 1200, 2012);
        System.out.println(" oldnotebook weight " + oldNotebook.weight + " price " + oldNotebook.price + " year " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();



    }
}