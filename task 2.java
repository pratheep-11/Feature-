package datatypes;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        int[][] transactions = {{5001, 10}, {6001, 5}, {5004, -8}, {5002, 3}};
        List<String> errors = new ArrayList<>();
        List<String> validTransactions = new ArrayList<>();

        for (int[] transaction : transactions) {
            int itemId = transaction[0];
            int quantity = transaction[1];

            if (itemId < 5001 || itemId > 5005) {
                errors.add("Invalid ID: " + itemId);
            } else if (quantity <= 0) {
                errors.add("Negative quantity: (" + itemId + ", " + quantity + ")");
            } else {
                validTransactions.add("(" + itemId + ", " + quantity + ")");
            }
        }

        System.out.println("Valid transactions: " + validTransactions);
        System.out.println("Errors found: " + errors);
    }
