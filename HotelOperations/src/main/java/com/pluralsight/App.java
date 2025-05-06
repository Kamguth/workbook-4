package com.pluralsight;

import java.util.EmptyStackException;
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

       /*room.checkIn();
        System.out.println("\nAfter check in: " + room.isAvailable());

        room.checkOut();
        System.out.println("After check out: " + room.isAvailable());

        room.cleanRoom();
        System.out.println("After room clean: " + room.isAvailable());*/


        /*Reservation reservation = new Reservation("king", 3, true);
        System.out.println("\nReservation Test:");
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Nights: " + reservation.getNumberOfNights());
        System.out.println("Weekend? " + reservation.isWeekend());
        System.out.println("Price per Night: $" + reservation.getPrice());
        System.out.println("Total: $" + reservation.getReservationTotal());*/

        Employee emp = new Employee(123, "Kam", "Cyber Security", 36.00, 40);

        emp.punchIn(10.0);
        emp.punchOut(14.5);

        System.out.println("Employee ID and name: " + emp.getEmployeeId() + " " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Pay rate: " + emp.getPayRate());
        System.out.println("Hours worked: " + emp.getHoursWorked());
        System.out.println("Regular Hours: " + emp.getRegularHours());
        System.out.println("Overtime Hours: " + emp.getOvertimeHours());
        System.out.println("Total Pay: $" + emp.getTotalPay());



    }
}
