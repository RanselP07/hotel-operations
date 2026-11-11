package com.pluralsight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void isCheckIn() {
        //arrange
        Room room1 = new Room(true);

        //assert
        Assertions.assertEquals(true,room1.isCheckIn());
    }

    @Test
    void isCheckOut() {
        //arrange
        Room room1 = new Room(false);

        //assert
        Assertions.assertEquals(true,room1.isCheckOut());
    }

    @Test
    void cleanRoom() {
        //arrange
        Room room1 = new Room(false);

        //assert
        Assertions.assertEquals(true,room1.isAvailable());
    }
}