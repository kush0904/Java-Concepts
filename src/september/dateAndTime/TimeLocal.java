package september.dateAndTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeLocal {

    private LocalTime time;
    public TimeLocal(){
        System.out.println("Local Time");
        time = LocalTime.now();
    }

    public void showCurrentTime(){
        System.out.println("Today: " + time);
    }

    public void showCurrentHour(){
        System.out.println("Hour: " + time.getHour());
    }

    public void showCurrentMinute(){
        System.out.println("Current Month: " + time.getMinute());
    }

    public void showCurrentSecond(){
        System.out.println("Current Month Value: " + time.getSecond());
    }

    public void showCurrentNano(){
        System.out.println("Current Nano: " + time.getNano());
    }

    public void showPositiveCounterInHour(){
        System.out.println("Positive CountDown: " + time.plusHours(24));
    }
    public void showNegativeCounterInHour(){
        System.out.println("Negative CountDown: " + time.minusHours(24));
    }

    public void showTimeInAmPm(){
        System.out.println("Formatter(12 Hr): " + DateTimeFormatter.ofPattern("hh:mm").format(LocalTime.now()));
        System.out.println("Formatter(24 Hr): " + DateTimeFormatter.ofPattern("HH:mm").format(LocalTime.now()));
        System.out.println("Formatter(12 Hr am/pm): " + DateTimeFormatter.ofPattern("hh:mm a").format(LocalTime.now()));
    }


    public static void main(String[] args) {
        TimeLocal obj = new TimeLocal();
        obj.showCurrentTime();
        obj.showCurrentHour();
        obj.showCurrentMinute();
        obj.showCurrentSecond();
        obj.showCurrentNano();
        obj.showPositiveCounterInHour();
        obj.showNegativeCounterInHour();
        obj.showTimeInAmPm();
    }
}

