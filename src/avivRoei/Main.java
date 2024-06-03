package avivRoei;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
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

                    System.out.println("Enter the seller name");
                    String seller = scanner.next();
                    System.out.println(addEntity(sellers, sellerCount, seller));



                    break;
                case 2:
                    System.out.println("Enter the buyer name");
                    String buyer = scanner.next();
                    System.out.println(addEntity(buyers, buyerCount, buyer));
                    break;
                case 3:
                    addToSeller();
                    break;
                case 4:
                    addProductBuyer();
                    break;
                case 5:
                    chooseBuyer();
                    break;
                case 6:
                    System.out.println("Buyers:");
                    printEntities(buyers, buyerCount);
                    break;
                case 7:
                    System.out.println("Sellers:");
                    printEntities(sellers, sellerCount);
                    break;

                default:
                    System.out.println("Not good Try again");
                    break;
            }

            System.out.println();
        } while (choice != 0);

        scanner.close();
    }


    private static String[] sellers = new String[2];
    private static int sellerCount;
    private static String[] buyers = new String[2];
    private static int buyerCount;






    public static String addEntity(String[] array, int count, String name) {


        if (isNameTaken(array, count, name)) {
            System.out.println("The name is already taken");
            Scanner scanner = new Scanner(System.in);
            System.out.println("choose another name");
            String newName = scanner.next();
            return addEntity(array, count, newName);

        }

        if (count >= array.length) {
            array = expandArray(array);
        }

        array[count] = name;
        if (array == sellers) {
            sellerCount++;
        } else {
            buyerCount++;
        }
        return "Name added successfully";
    }

    private static boolean isNameTaken(String[] array, int count, String name) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    private static String[] expandArray(String[] array) {
        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    public static void printEntities(String[] propertiesList, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(propertiesList[i]);
        }
    }
    private static void addToSeller() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the seller name:");
        String sellerName = scanner.next();
        System.out.println("enter the object name:");
        String objectName = scanner.next();
        System.out.println("enter the object price:");
        String objectPrice = scanner.next();
        System.out.println("enter the object category:");
        String objectCategory = scanner.next();
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
