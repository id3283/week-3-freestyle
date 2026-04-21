package getterssetters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String line = "30|Brittany Thibbs|40|16.50";

        // Split up the line into an array "parts"
        String[] parts = line.split("\\|");

        // Convert parts to 4 variables
        int id = Integer.parseInt(parts[0]);
        String nameString = parts[1];
        double hoursWorked = Double.parseDouble(parts[2]);
        double payRate = Double.parseDouble(parts[3]);

        // Create new employee object
        Employee newEmployee;
        newEmployee = new Employee();
        newEmployee.setId(id);
        newEmployee.setName(nameString);
        newEmployee.setHoursWorked(hoursWorked);
        newEmployee.setPayRate(payRate);

        System.out.println("ID:  " + newEmployee.getId() + " Name: " + newEmployee.getName() + " Gross pay: " + newEmployee.calculateGrossPay() );
    }
}
