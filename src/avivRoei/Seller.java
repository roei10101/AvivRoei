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

    public ArrayList<Product> getProducts() {
        return products;
    }

    // Add product to seller
    public void addProduct(Product product) {
        products.add(product);
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Seller{");
        sb.append("username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", products=");
        for (Product product : products) {
            sb.append("\n\t").append(product);
        }
        sb.append('}');
        return sb.toString();
    }


}
