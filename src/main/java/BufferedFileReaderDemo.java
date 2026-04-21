import getterssetters.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReaderDemo {

    public static void main(String[] args) {
        String fileName = "src/main/resources/" + "employees.csv";

//        Employee[] employees = new Employee[8];

        int index = 0;
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufReader = new BufferedReader(reader);

            String line = bufReader.readLine();
            line = bufReader.readLine();
            while (line != null) {
//                System.out.println(line);

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

                // Stick 'em in the HR array
//                employees[index] = newEmployee;
//                index++;

                System.out.println("ID:  " + newEmployee.getId() + " Name: " + newEmployee.getName() + " Gross pay: " + newEmployee.calculateGrossPay());

                line = bufReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.err.println("I couldn't find the file named: " + fileName);
        } catch (IOException e) {
            System.err.println("IO Exception... I don't know what's is going on.");
        }

    }
}
