package august.enums;

// predefined constants
public class EnumType {

    public enum Pay {
        PAY_FIRST_PARK_LATER,
        PAY_LATER_PARK_FIRST;
    }

    public enum ParkStatus{
        EMPTY,
        FULL;
    }

    public static void main(String[] args) {
        Pay payOption1 = Pay.PAY_FIRST_PARK_LATER;
        Pay payOption2 = Pay.PAY_LATER_PARK_FIRST;
        System.out.println(payOption1);
        System.out.println(payOption2);
    }
}
