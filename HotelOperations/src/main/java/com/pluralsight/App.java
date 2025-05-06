package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Room room = new Room(2, 150.00, false, false);
        /*System.out.println("Room Test:");
        System.out.println("Beds: " + room.getNumberOfBeds());
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Occupied? " + room.isOccupied());
        System.out.println("Dirty? " + room.isDirty());
        System.out.println("Available? " + room.isAvailable());*/

        room.checkIn();
        System.out.println("\nAfter check in: " + room.isAvailable());

        room.checkOut();
        System.out.println("After check out: " + room.isAvailable());

        room.cleanRoom();
        System.out.println("After room clean: " + room.isAvailable());


        /*Reservation reservation = new Reservation("king", 3, true);
        System.out.println("\nReservation Test:");
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Nights: " + reservation.getNumberOfNights());
        System.out.println("Weekend? " + reservation.isWeekend());
        System.out.println("Price per Night: $" + reservation.getPrice());
        System.out.println("Total: $" + reservation.getReservationTotal());*/


    }
}
