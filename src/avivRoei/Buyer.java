package avivRoei;

import java.util.Date;
import java.util.ArrayList;

public class Buyer {
    private String username;
    private String password;
    private String address;
    private ArrayList<Product> cart;
    private ArrayList<Order> orderHistory;



    // Constructor
    public Buyer(String username, String password, String address) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.cart = new ArrayList<>();
        this.orderHistory = new ArrayList<>();
    }

    // Getters

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    // Add product to cart
    public void addToCart(Product product) {
        cart.add(product);
    }

    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. Nothing to checkout.");
            return;
        }
        double total = 0;
        System.out.println("Purchased items:");
        for (Product product : cart) {
            System.out.println(product);
            total += product.getPrice();
        }
        System.out.println("Total amount: $" + total);
        //System.out.println("Seller: " + sellerUsername);
        System.out.println("Buyer: " + username);
        System.out.println("Address: " + address);

        orderHistory.add(new Order(new ArrayList<>(cart), new Date(), total ,username));
        cart.clear();
        System.out.println("Checkout complete. Cart is now empty.");
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Buyer{");
        sb.append("username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", cart=").append(cart);
        sb.append(", orderHistory=").append(orderHistory);
        sb.append('}');
        return sb.toString();
    }


}
