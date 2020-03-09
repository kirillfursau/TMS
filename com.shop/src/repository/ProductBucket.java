package repository;

import model.Product;

import java.util.ArrayList;

public class ProductBucket {
    public static ArrayList<Product> bucket = new ArrayList<>();

    public static void addToBucket(Product product) {
        bucket.add(product);
    }

    public static ArrayList<Product> getBucket() {
        return bucket;
    }
}
