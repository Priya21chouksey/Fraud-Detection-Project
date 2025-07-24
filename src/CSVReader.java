import java.io.*;
import java.util.*;

public class CSVReader {
    public static List<Transaction> loadTransactions(String filePath) {
        List<Transaction> transactions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 6)
                    continue;

                Transaction transaction = new Transaction(
                        data[0], // transactionId
                        data[1], // sender
                        data[2], // receiver
                        Double.parseDouble(data[2]), // amount
                        data[4], // timestamp
                        data[5] // location
                );
                transactions.add(transaction);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return transactions;
    }
}
