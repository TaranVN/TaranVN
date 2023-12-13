import java.util.List;
import java.util.ArrayList;

class TransactionHistory {
    private List<Transaction> transactions;

    public TransactionHistory() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}