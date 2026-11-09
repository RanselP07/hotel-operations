package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    public Employee(String name, int hoursWorked, double payRate){
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public double getPayRate(){
        double totalPay = this.hoursWorked * this.payRate;
        return totalPay;
    }

    public int getRegularHours(){
        int regularHours = 0;

        if(hoursWorked > 40){
            regularHours = 40;
        }

        return hoursWorked;
    }

    public int getOvertimeHours(){
        int hoursWorked = 0;
        int overtimeHours = 0;

        if (hoursWorked > 40){
            overtimeHours = hoursWorked - 40;
        }
        return overtimeHours;
    }
}
