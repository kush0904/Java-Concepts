package september.dateAndTime;

import java.time.LocalDate;

public class DateLocal {

    private LocalDate date;
    public DateLocal(){
        System.out.println("Local Date");
        date = LocalDate.now();
    }

    public void showTodayDate(){
        System.out.println("Today: " + date);
    }

    public void showCurrentYear(){
        System.out.println("Year: " + date.getYear());
    }

    public void showCurrentMonth(){
        System.out.println("Current Month: " + date.getMonth());
    }

    public void showCurrentMonthValue(){
        System.out.println("Current Month Value: " + date.getMonthValue());
    }

    public void showDayOfTheWeek(){
        System.out.println("Day of the week: " + date.getDayOfWeek());
    }

    public void showNextDate(){
        System.out.println("Next Date: " + date.plusDays(1));
    }

    public void showPreviousDate(){
        System.out.println("Previous Date: " + date.plusDays(-1));
    }

    public void showNextMonth(){
        System.out.println("Next Month: " + date.plusMonths(1));
    }

    public void showPreviousMonth(){
        System.out.println("Previous Month: " + date.plusMonths(-1));
    }

    public void isLeapYear(){
        if(date.isLeapYear()){
            System.out.println("This year is a leap year");
        }
        else{
            System.out.println("This year is not a leap year");
        }
    }




    public static void main(String[] args) {
        DateLocal obj = new DateLocal();
        obj.showTodayDate();
        obj.showCurrentYear();
        obj.showCurrentMonth();
        obj.showCurrentMonthValue();
        obj.showDayOfTheWeek();
        obj.showNextDate();
        obj.showPreviousDate();
        obj.showNextMonth();
        obj.showPreviousMonth();
        obj.isLeapYear();
    }
}
