package august.threading.bank;

public class Deposit implements Runnable{
    private Double amount;
    private Transaction objT;

    public Deposit(Transaction objT, Double amount){
        this.objT = objT;
        this.amount = amount;
    }

    @Override
    public void run(){
        objT.depositTransactionService(amount);
    }
}
