package avivRoei;

import java.util.ArrayList;

public class Seller {
    private String username;
    private String password;
    private ArrayList<Product> products;


    // Constructor
    public Seller(String username, String password) {
        this.username = username;
        this.password = password;
        this.products = new ArrayList<>();

    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Add product to seller
    public void addProduct(Product product) {
        products.add(product);
    }

    // toString method
    @Override
    public String toString() {
        return "Seller{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", products=" + products +
                '}';
    }


}
