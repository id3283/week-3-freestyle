import getterssetters.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class BufferedFileReaderDemo {

    public static void main(String[] args) {
        String fileName = "src/main/resources/" + "employees.csv";
        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();

//        Employee[] employees = new Employee[8];
        int index = 0;
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufReader = new BufferedReader(reader);

            String line = bufReader.readLine();
            line = bufReader.readLine();
            while (line != null) {

                Employee employee = employeeFromLine(line);
                employeeArrayList.add(employee);

//                System.out.println("ID:  " + employee.getId() + " Name: " + employee.getName() + " Gross pay: " + employee.calculateGrossPay() );

                line = bufReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.err.println("I couldn't find the file named: " + fileName);
        } catch (IOException e) {
            System.err.println("IO Exception... I don't know what's is going on.");
        }

        double totalPay = 0;
        for (Employee e: employeeArrayList) {
            totalPay += e.calculateGrossPay();
        }
//        System.out.println("Total pay for all employees: " + totalPay);


        // how do i find name of employee with id 421
        // O(n)
        String name = null;
        for (Employee e: employeeArrayList) {
            if(e.getId() == 421 ) {
                name = e.getName();
            }
        }
        System.out.println("Employee with id 421: " + name);

        HashMap<Integer, Employee> employeeHashMap = new HashMap<Integer, Employee>();
        for (Employee e: employeeArrayList) {
            employeeHashMap.put(e.getId(), e);
        }

        //
        Employee foundEmployee = employeeHashMap.get(421);
        System.out.println("Employee with id 421: " + foundEmployee.getName() );

    }

    private static Employee employeeFromLine(String line) {
        String[] parts = line.split("\\|");

        // Convert parts to 4 variables
        int id = Integer.parseInt(parts[0]);
        String nameString = parts[1];
        double hoursWorked = Double.parseDouble(parts[2]);
        double payRate = Double.parseDouble(parts[3]);

        // Create new employee object
        Employee employee= new Employee(id, nameString, hoursWorked, payRate);
        return employee;
    }

}
