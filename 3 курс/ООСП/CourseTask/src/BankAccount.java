class BankAccount {
    private double balance;
    private TransactionHistory transactionHistory;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new TransactionHistory();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount, String depositMethod) {
        balance += amount;
        transactionHistory.addTransaction(new Transaction("Пополнение (" + depositMethod + ")", amount));
        System.out.println("Пополнение (" + depositMethod + "): " + amount);
    }

    public void transfer(double amount, int transferOption, String recipientDetails) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.addTransaction(new Transaction("Перевод", amount));
            System.out.println("Перевод: " + amount + " по способу: " + getTransferOptionDescription(transferOption, recipientDetails));
        } else {
            System.out.println("Недостаточно средств для перевода.");
        }
    }

    private String getTransferOptionDescription(int transferOption, String recipientDetails) {
        switch (transferOption) {
            case 1:
                return "По СБП на номер " + recipientDetails;
            case 2:
                return "На карту с номером " + recipientDetails;
            default:
                return "Неверный способ перевода";
        }
    }

    public TransactionHistory getTransactionHistory() {
        return transactionHistory;
    }
}