package pratheep;

/*public class Simple {

}*/
import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] itemIDs = {5001, 5002, 5003, 5004, 5005};
        int[] prices = {50, 30, 20, 40, 50};
        double[] revenue = new double[5];

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item ID: ");
            int id = sc.nextInt();
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            int index = -1;
            for (int j = 0; j < 5; j++) {
                if (itemIDs[j] == id) {
                    index = j;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("Invalid item ID. Skipping.");
                continue;
            }

            double price = prices[index];
            if (id == 5004 || id == 5005) {
                price = price * 0.8;
            }

            revenue[index] += price * qty;
        }

        System.out.println("\nTotal Revenue:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Item %d: Rs. %.2f\n", itemIDs[i], revenue[i]);
        }

        sc.close();
    }
}
