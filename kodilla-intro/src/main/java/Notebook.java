import static java.sql.DriverManager.println;

public class Notebook {
    int weight;
    int price;
    int year;
    int priceandyear;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
        this.priceandyear = priceandyear;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println(" This price is good ");
        } else {
            System.out.println(" This notebook is expensive ");


        }
    }
    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println(" This notebook is light ");
        } else if (this.weight >= 1000 && this.weight <= 1900) {
            System.out.println(" This notebook is heavy ");
        } else {
            System.out.println(" This notebook is very heavy ");
        }
    }


    public void checkYear() {
        if (this.year < 2021) {
            System.out.println(" This notebook is not that old ");
        } else if (this.year >= 2013 && this.year <= 2015) {
            System.out.println(" This notebook is little old ");
        } else {
            System.out.println(" This notebook is old ");
        }
    }

    public void checkPriceAndYear() {
        if (this.price > 400 && this.year > 2020) {
            System.out.println("This notebook is good");
        } else if (this.price > 600 && this.year > 2015) {
            System.out.println(" This notebook is bad ");
        } else {
            System.out.println(" This notebook is not that bad ");

        }
    }
}