import java.util.*;

public class FraudDetector {
    private static final double AMOUNT_THRESHOLD = 10000.0;

    public static List<Transaction> detectFraud(List<Transaction> transactions) {
        List<Transaction> suspicious = new ArrayList<>();

        for (Transaction t : transactions) {
            if (t.getAmount() > AMOUNT_THRESHOLD) {
                suspicious.add(t);
            }
        }

        return suspicious;
    }
}
