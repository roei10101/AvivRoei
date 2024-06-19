package avivRoei;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private ArrayList<Product> products;
    private Date orderDate;
    private double totalAmount;
    private String sellerUsername;
    private String buyerUsername;

    // Constructor
    public Order(ArrayList<Product> products, Date orderDate, double totalAmount, String sellerUsername, String buyerUsername) {
        this.products = products;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.sellerUsername = sellerUsername;
        this.buyerUsername = buyerUsername;
    }

    // Getters
    public ArrayList<Product> getProducts() {
        return products;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // toString method
    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", sellerUsername='" + sellerUsername + '\'' +
                ", buyerUsername='" + buyerUsername + '\'' +
                '}';
    }
}
