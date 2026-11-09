package com.pluralsight;

public class Main {

    static void main(String[] args) {
        Reservation reservation = new Reservation("king");

        System.out.print("Did it work: ");
        System.out.print(139 == reservation.getPrice());
    }
}
