package avivRoei;
import java.util.ArrayList;

public class Manager {
    private ArrayList<Seller> sellers;
    private ArrayList<Buyer> buyers;

    public Manager() {
        sellers = new ArrayList<>();
        buyers = new ArrayList<>();
    }

    public boolean addSeller(String username, String password) {
        if (isUsernameTaken(username)) {
            return false; // Username is already taken
        }
        sellers.add(new Seller(username, password));
        return true;
    }

    public boolean addBuyer(String username, String password, String address) {
        if (isUsernameTaken(username)) {
            return false; // Username is already taken
        }
        buyers.add(new Buyer(username, password, address));
        return true;
    }
    public boolean addProductToSeller(String sellerUsername, String productName, double productPrice) {
        for (Seller seller : sellers) {
            if (seller.getUsername().equals(sellerUsername)) {
                seller.addProduct(new Product(productName, productPrice));
                return true;
            }
        }
        return false; // Seller not found
    }

    private boolean isUsernameTaken(String username) {
        for (Seller seller : sellers) {
            if (seller.getUsername().equals(username)) {
                return true;
            }
        }
        for (Buyer buyer : buyers) {
            if (buyer.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void displaySellers() {
        System.out.println("Sellers:");
        for (Seller seller : sellers) {
            System.out.println(seller);
        }
    }

    public void displayBuyers() {
        System.out.println("Buyers:");
        for (Buyer buyer : buyers) {
            System.out.println(buyer);
        }
    }
}
