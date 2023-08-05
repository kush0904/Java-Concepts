package august.enums;

enum Days{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class WeekDays {

    public static void main(String[] args) {
        Days today = Days.FRIDAY;

        System.out.println("Today is " + today);
        System.out.println("Length of enum: " + Days.values().length);
    }
}
