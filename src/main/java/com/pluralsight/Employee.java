package com.pluralsight;

import java.time.LocalTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    int startTime;
    int endTime;

    public Employee(String name) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int HoursWorked() {
        this.hoursWorked = endTime - startTime;
        return this.hoursWorked;
    }

    public double getPayRate() {
        double totalPay = this.hoursWorked * this.payRate;
        return totalPay;
    }

    public int getRegularHours() {
        int regularHours = 0;

        if (hoursWorked > 40) {
            regularHours = 40;
        }

        return hoursWorked;
    }

    public int getOvertimeHours() {
        int hoursWorked = 0;
        int overtimeHours = 0;

        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
        }
        return overtimeHours;
    }

    public void punchIn(int hour){
        System.out.println("Hey, " + this.name + " punched in at: " + hour);
        this.startTime = hour;
    }

    public void punchIn(){
        LocalTime rightNow = LocalTime.now();
        int hour = rightNow.getHour();

        this.startTime = hour;
    }

    public void punchOut(int hour){
        System.out.println("Hey, " + this.name + " punched out at: " + hour);
        this.endTime = hour;
    }

    public void punchOut(){
        LocalTime rightNow = LocalTime.now();
        int hour = rightNow.getHour();

        this.endTime = hour;
    }
}
