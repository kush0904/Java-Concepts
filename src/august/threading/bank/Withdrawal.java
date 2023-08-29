package august.threading.bank;

    public class Withdrawal implements Runnable{
        private Double amount;
        private Transaction objT;

        public Withdrawal(Transaction objT, Double amount){
            this.objT = objT;
            this.amount = amount;
        }

        @Override
        public void run(){
            objT.withdrawalTransactionService(amount);
        }
    }

