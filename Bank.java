enum AccountTypeEnum { SAVINGS, CHECKING }

public class Bank {
    final String RoutingNumber;
    // this balance will track the overall balance stored at the bank
    private static double BankBalance;
    private double Balance;
    AccountTypeEnum AccountType;
    String AuthorizedUser;

    public Bank() {
        AccountType = AccountTypeEnum.CHECKING;
        AuthorizedUser= "";
        RoutingNumber = "asldfhoaisjdf";
    }

    public Bank(String incAuthorizedUser) {
        AccountType = AccountTypeEnum.CHECKING;
        this.AuthorizedUser = incAuthorizedUser;
        RoutingNumber = "asldfhoaisjdf";
    }
    
    public Bank(String incAuthorizedUser, double balance) {
        AccountType = AccountTypeEnum.CHECKING;
        this.AuthorizedUser = incAuthorizedUser;
        BankBalance += balance;
        Balance = balance;
        RoutingNumber = "asldfhoaisjdf";
    }

    public double GetBalance(){
        return Balance;
    }

    public static double GetBankBalance() {
        return BankBalance;
    }

    public double Deposit(double amount){
        BankBalance += amount;
        return Balance += amount;
    }

    public double Withdrawal(double amount){
        double updatedBalance = Balance - amount;
        double rtnBalance = 0;

        if(updatedBalance >=0){
            Balance -= amount;
            BankBalance -= amount;
            rtnBalance = updatedBalance;
        } else {
            double zeroBalance = 0;
            Balance = zeroBalance;
            BankBalance -= Balance;
            rtnBalance = zeroBalance;
        }

        //System.out.println(zeroBalance);
        return rtnBalance;
    }

    public static double ConvertUSDToAUD(double usd) {

        return BankBalance * 1.56;
    }
}