package august.threading.bank;

public class Transaction {

    Account account;
    public Transaction(){
        account=new Account();
    }
    synchronized public void depositTransactionService(Double amount){
        System.out.println("Before Deposit : " + account.getBalance());

        Double balance = account.getBalance() + amount;

        account.setBalance(balance);


        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("After Deposit : " + account.getBalance());
    }

    synchronized public void withdrawalTransactionService(Double amount){
        System.out.println("Before Withdrawal : " + account.getBalance());

        double balance = account.getBalance() - amount;

        account.setBalance(balance);

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("After Withdrawal : " + account.getBalance());
    }
}
