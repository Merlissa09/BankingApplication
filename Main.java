public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.Deposit(500);
        bank1.Deposit(50);
        bank1.Deposit(10);
        double currentBalance = bank1.GetBalance();
        System.out.println(currentBalance);
        bank1.Withdrawal(5);
        double balanceAfterWithdrawl = bank1.GetBalance();
        System.out.println(balanceAfterWithdrawl);
    }
}
