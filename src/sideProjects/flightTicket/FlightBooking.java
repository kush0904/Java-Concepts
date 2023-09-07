package sideProjects.flightTicket;

import java.util.Scanner;

public class FlightBooking {

    public String ticketNum;
    public String departure ;
    public String arrival;

    public FlightBooking(String ticketNum, String departure, String arrival) {
        this.ticketNum = ticketNum;
        this.departure = departure;
        this.arrival = arrival;
    }

    public void checkTicket() {
        try {
            if(!ticketNum.matches("\\d+")){
                throw new NumberFormatException("Input is invalid.");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public void checkDeparture() {
        try {
            if (!departure.matches("^[a-zA-Z]*$")) {
                System.out.println("Flight will depart from " + departure);
                throw new IllegalArgumentException("Input is invalid.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void checkArrival() {
        try {
            if (!arrival.matches("^[a-zA-Z]*$")) {
                //System.out.println("Flight will depart from " + departure);
                throw new IllegalArgumentException("Input is invalid.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        String ticketNum = input.nextLine();
        String departure = input.nextLine();
        String arrival = input.nextLine();

        FlightBooking obj = new FlightBooking(ticketNum, departure, arrival);

        obj.checkTicket();
        obj.checkDeparture();
        obj.checkArrival();
    }
}
