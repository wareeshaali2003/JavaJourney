package Main.java.lab6;

import java.util.ArrayList;
import java.util.List;

class Movie {
    // Attributes of the Movie class
    private String title;
    private String director;
    private List<String> actors;
    private List<String> reviews;

    // Constructor to initialize the attributes
    public Movie(String title, String director, List<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>(actors);
        this.reviews = new ArrayList<>();
    }

    // Method to add a review
    public void addReview(String review) {
        reviews.add(review);
        System.out.println("Review added: " + review);
    }

    // Method to retrieve all reviews
    public List<String> getReviews() {
        return new ArrayList<>(reviews); // Return a copy of the reviews list
    }

    // Method to display movie details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.print("Actors: ");
        for (String actor : actors) {
            System.out.print(actor + ", ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // List of actors
        List<String> actors = new ArrayList<>();
        actors.add("Actor 1");
        actors.add("Actor 2");
        actors.add("Actor 3");

        // Create an instance of the Movie class
        Movie movie = new Movie("The Great Adventure", "John Doe", actors);

        // Display movie details
        movie.displayDetails();

        // Add reviews
        movie.addReview("Amazing movie with great performances!");
        movie.addReview("Loved the storyline and the direction.");

        // Retrieve and display reviews
        List<String> reviews = movie.getReviews();
        System.out.println("Reviews:");
        for (String review : reviews) {
            System.out.println("- " + review);
        }
    }
