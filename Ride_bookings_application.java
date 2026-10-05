
1000067071.jpg
1000067072.jpg
Code

import java.util.Scanner;

public class RideBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input gathering
        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();

        System.out.print("Enter pickup location: ");
        String pickup = sc.nextLine();

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.println("1. Bike  2. Auto  3. Cab");
        System.out.print("Choose ride type: ");
        int choice = sc.nextInt();

        double rate;
        String ride;

        // Determining ride type and rate
        switch (choice) {
            case 1:
                ride = "Bike";
                rate = 8;
                break;

            case 2:
                ride = "Auto";
                rate = 12;
                break;

            case 3:
                ride = "Cab";
                rate = 18;
                break;

            default:
                ride = "Invalid";
                rate = 0;
                break;
        }

        // Calculating total fare
        double fare = distance * rate;

        // Printing the booking details
        System.out.println("\n--- BOOKING DETAILS ---");
        System.out.println("Name: " + name + " | From: " + pickup
                + " | To: " + destination);
        System.out.println("Ride: " + ride + " | Fare: Rs." + fare);

        sc.close();
    }
}