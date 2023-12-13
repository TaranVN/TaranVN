import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankSystem bankSystem = new BankSystem(1000);

        while (true) {
            System.out.println("\n1. Показать баланс");
            System.out.println("2. Пополнить счет");
            System.out.println("3. Перевести деньги");
            System.out.println("4. Показать транзакции");
            System.out.println("5. Выйти");

            System.out.print("Выберите операцию: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    BankAccount clientAccount = bankSystem.getClientAccount();
                    System.out.println("Текущий баланс: " + clientAccount.getBalance());
                    break;

                case 2:

                    BankAccount accountDeposit = bankSystem.getClientAccount();
                    System.out.print("Введите сумму для пополнения: ");
                    double depositAmount = scanner.nextDouble();

                    System.out.println("Выберите метод пополнения:");
                    System.out.println("1. По СБП");
                    System.out.println("2. С карты другого банка");
                    System.out.println("3. С баланса телефона");
                    System.out.print("Введите номер метода: ");
                    int depositMethodChoice = scanner.nextInt();

                    String depositMethod;
                    switch (depositMethodChoice) {
                        case 1:
                            depositMethod = "СБП";
                            break;
                        case 2:
                            depositMethod = "С карты другого банка";
                            break;
                        case 3:
                            depositMethod = "С баланса телефона";
                            break;
                        default:
                            System.out.println("Некорректный выбор метода.");
                            continue;
                    }

                    accountDeposit.deposit(depositAmount, depositMethod);
                    System.out.println("Счет успешно пополнен.");
                    break;

                case 3:
                    BankAccount accountSender = bankSystem.getClientAccount();

                    System.out.print("Выберите способ перевода:\n1. По СБП\n2. На карту\nВведите номер способа: ");
                    int transferOption = scanner.nextInt();

                    String recipientDetails = "";
                    if (transferOption == 1) {
                        while (true) {
                            System.out.print("Введите номер получателя (10 цифр): ");
                            recipientDetails = scanner.next();
                            if (recipientDetails.length() == 10) {
                                break;
                            } else {
                                System.out.println("Некорректный номер телефона. Повторите ввод.");
                            }
                        }
                    } else if (transferOption == 2) {
                        while (true) {
                            System.out.print("Введите номер карты получателя (16 цифр): ");
                            recipientDetails = scanner.next();
                            if (recipientDetails.length() == 16) {
                                break;
                            } else {
                                System.out.println("Некорректный номер карты. Повторите ввод.");
                            }
                        }
                    }

                    System.out.print("Введите сумму для перевода: ");
                    double transferAmount = scanner.nextDouble();

                    accountSender.transfer(transferAmount, transferOption, recipientDetails);
                    System.out.println("Текущий баланс: " + accountSender.getBalance());
                    break;

                case 4:

                    BankAccount accountTransactionHistory = bankSystem.getClientAccount();
                    TransactionHistory transactionHistory = accountTransactionHistory.getTransactionHistory();
                    List<Transaction> transactions = transactionHistory.getTransactions();

                    if (transactions.isEmpty()) {
                        System.out.println("У клиента нет транзакций.");
                    } else {
                        System.out.println("Транзакции клиента:");

                        for (Transaction transaction : transactions) {
                            System.out.println(transaction.getDescription() + ": " + transaction.getAmount());
                        }
                    }
                    break;

                case 5:

                    System.out.println("Программа завершена.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Некорректный ввод. Пожалуйста, выберите допустимую операцию.");
            }
        }
    }
}