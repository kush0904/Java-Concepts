package sideProjects.flightTicket;

import java.util.Scanner;

public class Ticket {

    private String ticketNo;
    private String startLocation;
    private String destination;

    public Ticket(String ticketNo, String startLocation, String destination) {
        this.ticketNo = ticketNo;
        this.startLocation = startLocation;
        this.destination = destination;
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public String getDestination() {
        return destination;
    }

    public String finalTicket() {
        return (startLocation.substring(0,2).toUpperCase() + ticketNo + destination.substring(0,2).toUpperCase());
    }

    public static void main(String[] args) {
        String ticketNo, startLocation, destination;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ticket number: ");
        ticketNo = sc.next();

        System.out.print("Enter start location: ");
        startLocation = sc.next();

        System.out.print("Enter destination: ");
        destination = sc.next();

        try {
            if (ticketNo.isEmpty()) {
                throw new IllegalArgumentException("Ticket number cannot be empty.");
            }

            if (!ticketNo.matches("\\d+")) {
                throw new IllegalArgumentException("Ticket number must contain only digits.");
            }

            int ticketNumber = Integer.parseInt(ticketNo);

            Ticket obj = new Ticket(ticketNo, startLocation, destination);

            System.out.println();
            System.out.println("Ticket Information:");
            System.out.println("Ticket Number: " + obj.getTicketNo());
            System.out.println("Start Location: " + obj.getStartLocation());
            System.out.println("Destination: " + obj.getDestination());
            System.out.println("Your Ticket Number: " + obj.finalTicket());
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Ticket number must be a valid integer.");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Thanks for choosing Boeing 767!!");
        }
    }
}
