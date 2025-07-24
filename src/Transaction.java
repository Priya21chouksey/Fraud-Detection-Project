public class Transaction {
    private String transactionId;
    private String sender;
    private String receiver;
    private double amount;
    private String timestamp;
    private String location; 

    public Transaction(String transactionId, String sender, String receiver, double amount, String timestamp, String location) {
        this.transactionId = transactionId;
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.timestamp = timestamp;
        this.location = location;
    }

    public String getTransactionId() { return transactionId; }
    public String getSender() { return sender; }
    public String getReceiver() { return receiver; }
    public double getAmount() { return amount; }
    public String getTimestamp() { return timestamp; }
    public String getLocation() { return location; }

    @Override
    public String toString() {
        return transactionId + "," + sender + "," + receiver + "," + amount + "," + timestamp + "," + location;
    }
}

