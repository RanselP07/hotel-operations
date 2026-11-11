package com.pluralsight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testPunchIn() {
        //arrange
        Employee ransel = new Employee("Ransel");

        //act
        ransel.punchIn(8);

        //assert
        int expected = 8;
        Assertions.assertEquals(expected, ransel.startTime);

    }

    @Test
    void testPunchOut() {
        Employee ransel = new Employee("Ransel");
        ransel.punchIn(8);

        ransel.punchOut(14);

        Assertions.assertEquals(6, ransel.HoursWorked());
    }
}