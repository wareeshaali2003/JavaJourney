package Main.java.lab5;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Airplane {
    // Attributes of the Airplane class
    private String flightNumber;
    private String destination;
    private LocalTime departureTime;
    private boolean isDelayed;

    // Constructor to initialize the attributes
    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = LocalTime.parse(departureTime, DateTimeFormatter.ofPattern("HH:mm"));
        this.isDelayed = false;
    }

    // Method to check flight status
    public void checkFlightStatus() {
        if (isDelayed) {
            System.out.println("Flight " + flightNumber + " to " + destination + " is delayed. New departure time: " + departureTime);
        } else {
            System.out.println("Flight " + flightNumber + " to " + destination + " is on time. Departure time: " + departureTime);
        }
    }

    // Method to apply delay to the departure time
    public void delayFlight(int minutes) {
        departureTime = departureTime.plusMinutes(minutes);
        isDelayed = true;
        System.out.println("Flight " + flightNumber + " is delayed by " + minutes + " minutes.");
    }

    // Getters for flight details
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime.format(DateTimeFormatter.ofPattern("HH:mm"));
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Airplane class
        Airplane flight1 = new Airplane("AA123", "New York", "14:30");

        // Check the flight status
        flight1.checkFlightStatus();

        // Delay the flight by 45 minutes
        flight1.delayFlight(45);

        // Check the flight status again
        flight1.checkFlightStatus();
    }
}
