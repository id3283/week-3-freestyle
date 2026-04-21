package getterssetters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String line = "30|Brittany Thibbs|40|16.50";
        String[] parts = line.split("\\|");

        int id = Integer.parseInt(parts[0]);
        String nameString = parts[1];
        double hoursWorked = Double.parseDouble(parts[2]);
        double payRate = Double.parseDouble(parts[3]);

        Employee newEmployee;
        newEmployee = new Employee();
        newEmployee.setId(id);
        newEmployee.setName(nameString);
        newEmployee.setHoursWorked(hoursWorked);
        newEmployee.setPayRate(payRate);

        System.out.println(newEmployee.getName());
    }
}
