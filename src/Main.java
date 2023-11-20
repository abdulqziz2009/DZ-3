public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(20000);

        try {
            while (true) {
                account.withdraw(6000);
            }
        } catch (LimitException e) {
            System.out.println("Снято " + e.getRemainingAmount() + " сом. На счете осталось " + account.getAmount() + " сом.");
        }
    }
}
