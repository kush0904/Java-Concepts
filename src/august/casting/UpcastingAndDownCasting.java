package august.casting;


//downcasting and upcasting
abstract class Bank {
    private String bankId;
    private String bankName;
    private String bankLocation;

    private long turnover;

    public Bank(long turnover){
        this.turnover = turnover;
    }

    public abstract void bankId();
    public abstract void bankName();
    public abstract void bankLocation();

    public void turnover(){
        System.out.println("TurnOver : " + turnover);
    }
}

class HDFC extends Bank {
    public HDFC(long turnover){
        super(turnover);
    }

    public void bankId(){
        System.out.println("HD1023");
    }

    public void bankName(){
        System.out.println("HDFC");
    }

    public void bankLocation(){
        System.out.println("Bombay");
    }
}

public class UpcastingAndDownCasting {
    public static void main(String[] args) {
        Bank obj = new HDFC(6000000);

        obj.bankId();
        obj.bankName();
        obj.bankLocation();

        obj.turnover();

        HDFC objHDFC = (HDFC) obj;
    }
}
