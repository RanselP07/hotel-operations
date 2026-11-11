package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = 0;
        this.numberOfRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int roomCount, boolean suite){
        if (suite){
            if (roomCount <= getAvailableSuites()){
                this.bookedSuites += roomCount;
                return true;
            }
            else {
                return false;
            }
        } else {
            if (roomCount <= getAvailableRooms()) {
                this.bookedSuites += roomCount;
                return true;
            } else {
                return false;
            }
        }
    }

    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites;
    }

    public int getAvailableRooms(){
        return this.numberOfRooms - this.bookedBasicRooms;
    }
}
