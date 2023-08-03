package august.time;

public class TimeTable {

    private int time;

    private static final int EXPECTED_ACTIVITIES = 10; //Total Activities : 25

    public TimeTable() {
        String[] activities = new String[25];
    }
    public void morningTimeTable(int time) {

        class Morning{
            public void wakeUp(int time) {
                System.out.println("WakeUp Time : " + time);
            }
            public String[] getActivitiesStrings() {

                return new String[EXPECTED_ACTIVITIES];
            }
        }

        Morning objM=new Morning();
        objM.wakeUp(time);

    }



    public static void main(String[] args) {

        TimeTable obj=new TimeTable();
        int time=5;
        obj.morningTimeTable(time);
    }

}