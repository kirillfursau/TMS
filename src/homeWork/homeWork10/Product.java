package homeWork.homeWork10;

public class Product {
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
    public boolean equals(Object product) {
        if (product == this) {
            return true;
        }
        if (product == null || product.getClass() != this.getClass()) {
            return false;
        }
        Product guest = (Product) product;
        return id == guest.getId();
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getId();
        return result;
    }
}

