package Main.java.lab5;

import java.util.ArrayList;
import java.util.List;

class TravelService {
    // Attributes to store reservations
    private List<String> flightReservations;
    private List<String> hotelReservations;

    // Constructor to initialize the attributes
    public TravelService() {
        flightReservations = new ArrayList<>();
        hotelReservations = new ArrayList<>();
    }

    // Method to search for flights
    public void searchFlights(String origin, String destination) {
        System.out.println("Searching for flights from " + origin + " to " + destination + "...");
        // Simulate search results
        System.out.println("Found flights: Flight1, Flight2, Flight3");
    }

    // Method to search for hotels
    public void searchHotels(String location) {
        System.out.println("Searching for hotels in " + location + "...");
        // Simulate search results
        System.out.println("Found hotels: HotelA, HotelB, HotelC");
    }

    // Method to book a flight
    public void bookFlight(String flight) {
        flightReservations.add(flight);
        System.out.println("Flight " + flight + " booked successfully.");
    }

    // Method to book a hotel
    public void bookHotel(String hotel) {
        hotelReservations.add(hotel);
        System.out.println("Hotel " + hotel + " booked successfully.");
    }

    // Method to cancel a flight reservation
    public void cancelFlight(String flight) {
        if (flightReservations.remove(flight)) {
            System.out.println("Flight " + flight + " reservation canceled successfully.");
        } else {
            System.out.println("No reservation found for flight " + flight);
        }
    }

    // Method to cancel a hotel reservation
    public void cancelHotel(String hotel) {
        if (hotelReservations.remove(hotel)) {
            System.out.println("Hotel " + hotel + " reservation canceled successfully.");
        } else {
            System.out.println("No reservation found for hotel " + hotel);
        }
    }

    // Method to display current reservations
    public void displayReservations() {
        System.out.println("Current flight reservations: " + flightReservations);
        System.out.println("Current hotel reservations: " + hotelReservations);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the TravelService class
        TravelService travelService = new TravelService();

        // Search for flights and hotels
        travelService.searchFlights("New York", "Los Angeles");
        travelService.searchHotels("Los Angeles");

        // Book flights and hotels
        travelService.bookFlight("Flight1");
        travelService.bookHotel("HotelA");

        // Display current reservations
        travelService.displayReservations();

        // Cancel a flight and a hotel reservation
        travelService.cancelFlight("Flight1");
        travelService.cancelHotel("HotelA");

        // Display current reservations after cancellation
        travelService.displayReservations();
    }
}
