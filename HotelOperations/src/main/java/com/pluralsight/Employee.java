package com.pluralsight;


public class Employee {
     int employeeId;
     String name;
     String department;
     double payRate;
     double hoursWorked;
     double startTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * (payRate * 1.5);
        return regularPay + overtimePay;
    }

    public double getRegularHours() {
       if (hoursWorked > 40) {
           return 40;
       }
       else {
           return hoursWorked;
       }
    }
    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else return 0;
    }

    public void punchIn(double time) {
        startTime = time;
    }

    public void punchOut(double time) {
        double workedHours = time - startTime;
        hoursWorked += workedHours;

    }
}
