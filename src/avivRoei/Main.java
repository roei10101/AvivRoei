/*
aviv fadlun - 324186279
roei duenyas - 212214514
*/
package avivRoei;
import java.lang.*;
import java.util.Scanner;



public class Main {


    public static void main(String[] args) {
        menu();
    }


    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        int choice;

        do {
            System.out.println("==== menu ====");
            System.out.println("0. exit");
            System.out.println("1. add seller");
            System.out.println("2. add buyer");
            System.out.println("3. add product");
            System.out.println("4. add product to buyer");
            System.out.println("5. pay order");
            System.out.println("6. buyer info");
            System.out.println("7. seller info");
            System.out.print("choose option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("exit");
                    break;
                case 1:
                    addSeller(manager, scanner);
                    break;
                case 2:
                    addBuyer(manager, scanner);
                    break;
                case 3:
                    addProductToSeller(manager, scanner);
                    break;
                case 4:
                    addProductToBuyerCart(manager, scanner);

                    break;
                case 5:
                    checkoutBuyerCart(manager, scanner);
                    break;
                case 6:
                    manager.displayBuyers();
                    break;
                case 7:
                    manager.displaySellers();
                    break;

                default:
                    System.out.println("Not good Try again");
                    break;
            }
            System.out.println();
        } while (choice != 0);
        scanner.close();
    }

    private static void addSeller(Manager manager, Scanner scanner) {
        while (true) {
            System.out.print("Enter seller username: ");
            String sellerUsername = scanner.next();
            System.out.print("Enter seller password: ");
            String sellerPassword = scanner.next();
            if (manager.addSeller(sellerUsername, sellerPassword)) {
                System.out.println("Seller added successfully.");
                break;
            } else {
                System.out.println("Username already taken. Please enter a different username.");
            }
        }
    }
    private static void addBuyer(Manager manager,Scanner scanner) {
        while (true) {
            System.out.print("Enter buyer username: ");
            String buyerUsername = scanner.next();
            System.out.print("Enter buyer password: ");
            String buyerPassword = scanner.next();
            System.out.print("Enter buyer address: ");
            String buyerAddress = scanner.next();
            if (manager.addBuyer(buyerUsername, buyerPassword,buyerAddress)) {
                System.out.println("Buyer added successfully.");
                break;
            } else {
                System.out.println("Username already taken. Please enter a different username.");
            }
        }
    }
    private static void addProductToSeller(Manager manager, Scanner scanner) {
        System.out.print("Enter seller username: ");
        String sellerUsername = scanner.next();
        System.out.print("Enter product name: ");
        String productName = scanner.next();
        System.out.print("Enter product price: ");
        double productPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        if (manager.addProductToSeller(sellerUsername, productName, productPrice)) {
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Seller not found.");
        }
    }
    private static void addProductToBuyerCart(Manager manager, Scanner scanner) {
        System.out.print("Enter buyer username: ");
        String buyerUsername = scanner.next();
        System.out.print("Enter seller username: ");
        String sellerUsername = scanner.next();
        manager.displaySellerProducts(sellerUsername);
        System.out.print("Enter product name: ");
        String productName = scanner.next();
        if (manager.addProductToBuyerCart(buyerUsername, sellerUsername, productName)) {
            System.out.println("Product added to cart successfully.");
        } else {
            System.out.println("Buyer, seller, or product not found.");
        }
    }
    private static void checkoutBuyerCart(Manager manager, Scanner scanner) {
        System.out.print("Enter buyer username: ");
        String buyerUsername = scanner.next();
        System.out.print("Enter seller username: ");
        String sellerUsername = scanner.next();
        manager.checkoutBuyerCart(buyerUsername, sellerUsername);
    }

}

