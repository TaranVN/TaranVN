class BankSystem {
    private BankAccount clientAccount;

    public BankSystem(double initialBalance) {
        this.clientAccount = new BankAccount(initialBalance);
    }

    public BankAccount getClientAccount() {
        return clientAccount;
    }
}