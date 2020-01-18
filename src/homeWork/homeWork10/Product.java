package homeWork.homeWork10;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int price;

    Product(int id, String name, int price) {
        setId(id);
        setName(name);
        setPrice(price);
    }

    Product() {
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product " + getName() + ". Product id " + getId()
                + ". Product price " + getPrice();
    }

    @Override
    public int compareTo(Product o) {
        int compareQuantity = o.getPrice();
        return this.price - compareQuantity;
    }
}

