package august.threading.bank;

public class Account {
    private static Double balance = (double) 100000;

     public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        Account.balance = balance;
    }
}
