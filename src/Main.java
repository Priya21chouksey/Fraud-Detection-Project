import java.util.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "data/transactions.csv"; 
        String outputFilePath = "output/flagged_transactions.csv";

        List<Transaction> transactions = CSVReader.loadTransactions(filePath);

        if (transactions.isEmpty()) {
            System.out.println("No transactions found or file is missing.");
            return;
        }

        System.out.println("Total transactions loaded: " + transactions.size());

        List<Transaction> flagged = FraudDetector.detectFraud(transactions);

         if (flagged.isEmpty()) {
            System.out.println("No suspicious transactions detected.");
        } else {
            System.out.println("Suspicious Transactions Found: " + flagged.size());
            for (Transaction t : flagged) {
                System.out.println(t);
            }

      CSVWriter.writeTransactions(flagged, outputFilePath);
    }
 }
}
