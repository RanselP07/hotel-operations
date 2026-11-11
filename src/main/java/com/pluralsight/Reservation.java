package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    public Reservation(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        double price = 0;

        switch (this.roomType) {
            case "king" -> {
                price = 139.00;
            }
            case "double" -> {
                price = 124.00;
            }
            default -> {
                System.out.println("That room type is not available!!");
            }
        }
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double isWeekend() {
        String weekday = "";
        weekend = false;
        double weekendPrice = 0;

        switch (weekday) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                weekend = false;
            }
            case "Saturday", "Sunday" -> {
                weekend = true;
            }
            default -> {
                System.out.println("Invalid weekday.");
            }
        }

        if (weekend == true) {
            weekendPrice = (getPrice() * .1);
        }

        return weekendPrice;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getReservationTotal() {
        reservationTotal = getPrice() + isWeekend();
        return reservationTotal;
    }
}