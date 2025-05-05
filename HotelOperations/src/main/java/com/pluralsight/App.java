package com.pluralsight;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
Room room1 = new Room(2, 150.00, false,false, true);

        System.out.println("Number of beds: " + room1.getNumberOfBeds());
        System.out.println("Price per night: $" + room1.getPrice());
        System.out.println("Is Occupied: " + room1.isOccupied());
        System.out.println("Is Dirty: " + room1.isDirty());
        System.out.println("Is Available: " + room1.isAvailable());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter room type (king or double): ");
        String roomType = scanner.nextLine();

        System.out.println("Enter number of nights: ");
        int numberOfNights = scanner.nextInt();

    }
}
