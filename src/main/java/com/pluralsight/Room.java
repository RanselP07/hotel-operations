package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean checkIn;
    private boolean checkOut;
    private boolean available;
    private boolean cleanRoom;

    public Room(boolean occupied) {
        this.occupied = occupied;
        this.checkIn = occupied;
        this.dirty = occupied;
        this.checkOut = !occupied;
        this.available = !occupied;
        this.cleanRoom = !occupied;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }


    public boolean isCheckIn() {
        if(occupied){
            System.out.println("Room is Checked in.");
        }
        return this.checkIn = this.occupied;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return this.dirty = this.occupied;
    }

    public boolean isCheckOut() {
        if(!occupied){
            System.out.println("Room is Checked out.");
        }

        this.checkOut = !this.checkIn;
        return this.checkOut;
    }

    public boolean isAvailable() {
        if (cleanRoom == true){
            System.out.println("Room is available.");
        }
        this.available = cleanRoom;
        return this.available;
    }


    public boolean cleanRoom() {
        this.cleanRoom = !dirty;
        return cleanRoom;
    }
}
