package july.rocket;

public class Countdown {
    public static void start(int durationInSeconds) throws InterruptedException {
        for (int i = durationInSeconds; i >= 1; i--) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}

