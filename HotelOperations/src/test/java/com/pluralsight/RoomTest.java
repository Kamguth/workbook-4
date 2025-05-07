package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void verify_() {
        //arranging
        Room room1 = new Room(1, 2, 124);

        //acting
        boolean result = room1.isOccupied();

        //assert
        assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    void checkOut() {
        
    }

    @org.junit.jupiter.api.Test
    void cleanRoom() {
    }
}