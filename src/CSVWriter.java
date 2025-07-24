import java.io.*;
import java.util.*;

public class CSVWriter {
    public static void writeTransactions(List<Transaction> transactions, String filePath) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(filePath))) {
            br.write("TransactionID,SupplierName,Amount,Location,Time,Product,DeliveryDays");
            br.newLine();

            for (Transaction t : transactions) {
                br.write(t.toString());
                br.newLine();
            }

            System.out.println("Output CSV written to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
