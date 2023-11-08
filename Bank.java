enum AccountType { SAVINGS, CHECKING }

public class Bank {

    private double Balance;

    public double GetBalance(){
        return Balance;
    }

    public double Deposit(double amount){
        return Balance += amount;
    }

    public double Withdrawal(double amount){
        return Balance -= amount;
    }
}