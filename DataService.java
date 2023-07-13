package ECommerce.Java FRaud Detection;

@Service
public class DataService {
    private List<Transaction> transactions;

    public DataService() {
        // Initialize the dataset with sample transactions
        transactions = new ArrayList<>();

        Transaction transaction1 = new Transaction("CUST001", 100.0, "Online Purchase");
        Transaction transaction2 = new Transaction("CUST002", 500.0, "Store Visit");
        Transaction transaction3 = new Transaction("CUST001", 200.0, "Online Purchase");

        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }

    public List<Transaction> getTransactionsByCustomerId(String customerId) {
        List<Transaction> filteredTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getCustomerId().equals(customerId)) {
                filteredTransactions.add(transaction);
            }
        }
        return filteredTransactions;
    }

    // Other methods for data processing or manipulation
}

