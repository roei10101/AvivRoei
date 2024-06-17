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
                    System.out.print("Enter seller username: ");
                    String sellerUsername = scanner.next();
                    System.out.print("Enter seller password: ");
                    String sellerPassword = scanner.next();
                    if (manager.addSeller(sellerUsername, sellerPassword)) {
                        System.out.println("Seller added successfully.");
                    } else {
                        System.out.println("Username already taken.");
                    }
                    break;
                case 2:
                    System.out.print("Enter buyer username: ");
                    String buyerUsername = scanner.next();
                    System.out.print("Enter buyer password: ");
                    String buyerPassword = scanner.next();
                    System.out.print("Enter buyer address: ");
                    String buyerAddress = scanner.next();
                    if (manager.addBuyer(buyerUsername, buyerPassword,buyerAddress)) {
                        System.out.println("Buyer added successfully.");
                    } else {
                        System.out.println("Username already taken.");
                    }
                    break;
                case 3:
                    System.out.print("Enter seller username: ");
                    String sellerForProduct = scanner.next();
                    System.out.print("Enter product name: ");
                    String productName = scanner.next();
                    System.out.print("Enter product price: ");
                    double productPrice = scanner.nextDouble();
                    if (manager.addProductToSeller(sellerForProduct, productName, productPrice)) {
                        System.out.println("Product added successfully.");
                    } else {
                        System.out.println("Seller not found.");
                    }
                    break;
                case 4:
                   addProductBuyer();
                    break;
                case 5:
                    chooseBuyer();
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


        public static void addProductBuyer() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the buyer name:");
            String buyerName = scanner.next();
            System.out.println("enter the seller name you want to buy from:");
            String sellerName = scanner.next();

        }

        public static void chooseBuyer() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the buyer name who want to pay:");
            String buyerName = scanner.next();

        }
    }

