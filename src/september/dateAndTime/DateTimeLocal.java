package september.dateAndTime;


import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeLocal {

    private LocalDateTime dt;

    public DateTimeLocal(){
        System.out.println("Local date time");
        dt = LocalDateTime.now();
    }

    public void showLocalDateTime(){
        System.out.println("Local Date Time: " + dt);
    }

    public void showLocalDate(){
        System.out.println("Local Date: " + dt.toLocalDate());
    }

    public void showLocalTime(){
        System.out.println("Local Time: " + dt.toLocalTime());
    }

    public void showLocalDateTimeOf(){
        LocalDateTime localTime = LocalDateTime.of(2022, Month.APRIL, 9, 6,4,34);
        System.out.println("Local Date Time Of: " + localTime);
    }

    public void showLocalDateInFormat(){
        String localDate = dt.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Local Date In Format: " + localDate);
    }

    public void showLocalTimeInFormat(){
        String localTime = dt.format(DateTimeFormatter.ISO_TIME);
        System.out.println("Local Time In Format: " + localTime);
    }

    public static void main(String[] args) {
        DateTimeLocal obj = new DateTimeLocal();
        obj.showLocalDateTime();
        obj.showLocalDate();
        obj.showLocalTime();
        obj.showLocalDateTimeOf();
        obj.showLocalDateInFormat();
        obj.showLocalTimeInFormat();
    }
}
