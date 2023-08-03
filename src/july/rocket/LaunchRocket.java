package july.rocket;

import java.util.Scanner;


public class LaunchRocket {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter oxygen status: ");
        boolean isOxy = Boolean.parseBoolean(input.nextLine());

        System.out.print("Enter network status: ");
        boolean isNetwork = Boolean.parseBoolean(input.nextLine());

        System.out.print("Enter weather status: ");
        boolean isWeatherOK = Boolean.parseBoolean(input.nextLine());

        System.out.print("Enter fuel status: ");
        boolean isFuelOK = Boolean.parseBoolean(input.nextLine());

        RocketCheck oxy = new OxygenCheck(isOxy);
        RocketCheck networkCheck = new NetworkCheck(isNetwork);
        RocketCheck weatherCheck = new WeatherCheck(isWeatherOK);
        RocketCheck fuelCheck = new FuelCheck(isFuelOK);

        if (isAllChecksPassed(oxy, networkCheck, weatherCheck, fuelCheck)) {
            System.out.println("All checks passed. Countdown initiated. Launching the rocket in:");
            Countdown.start(5);
            Launched.launch();
        } else {
            System.out.println("Rocket launch aborted!");
        }
    }

    private static boolean isAllChecksPassed(RocketCheck... checks) {
        for (RocketCheck check : checks) {
            if (!check.isCheckPassed()) {
                System.out.println(check.getCheckDescription() + " failed.");
                return false;
            }
        }
        return true;
    }
}