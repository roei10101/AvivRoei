package avivRoei;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] listSellers = new String[1];

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
                    //addSeller(seller,listSellers);


                    break;
                case 2:
                    System.out.println("בחרת באפשרות השנייה.");
                    // הוסף קוד כאן לביצוע פעולה מסוימת
                    break;
                case 3:
                    System.out.println("בחרת באפשרות השלישית.");
                    // הוסף קוד כאן לביצוע פעולה מסוימת
                    break;
                case 4:
                    System.out.println("בחרת באפשרות הרביעית.");
                    // הוסף קוד כאן לביצוע פעולה מסוימת
                    break;
                case 5:
                    System.out.println("בחרת באפשרות החמישית.");
                    // הוסף קוד כאן לביצוע פעולה מסוימת
                    break;
                case 6:
                    System.out.println("בחרת באפשרות השישית.");
                    // הוסף קוד כאן לביצוע פעולה מסוימת
                    break;
                case 7:
                    System.out.println("בחרת באפשרות השביעית.");
                    // הוסף קוד כאן לביצוע פעולה מסוימת
                    break;

                default:
                    System.out.println("אפשרות לא חוקית, נסה שנית.");
                    break;
            }

            System.out.println(); // הדפס שורה ריקה לצורך אסתטיקה
        } while (choice != 0);

        scanner.close();
    }
    public static void addSeller(String sellerName, String[] listSellers){
        int lastPlace = 0;
        for (int i = 0;i < listSellers.length;i++)
            if (sellerName == listSellers[i]) {
                System.out.println("the name is been taken");
                if(listSellers[i] == null) {
                    if(i > lastPlace) {
                        lastPlace = i;
                    }
                }
            }
            else
            {
                if (lastPlace == 0) {
                    listSellers = Arrays.copyOf(listSellers,listSellers.length*2);
                    System.out.println(listSellers);
                }

            }

    }

}