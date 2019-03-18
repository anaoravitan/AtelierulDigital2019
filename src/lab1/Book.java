package lab1;

public class Book {
    private String name;
    int price;

    Book(int price) { //e constructor
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void rentalCost(int numDays) {
        price = numDays * 10;
    }
}
