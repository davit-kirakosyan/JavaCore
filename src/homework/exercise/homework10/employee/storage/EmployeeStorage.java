package homework.exercise.homework10.employee.storage;

import homework.exercise.homework10.employee.model.Employee;

import java.util.Scanner;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void addEmployees(Employee employee) {
        if (employees.length == size) {
            extend();
        }
        employees[size++] = employee;
    }

    private void extend() {
        Employee[] newEmployees = new Employee[employees.length + 5];
        for (int i = 0; i < size; i++) {
            newEmployees[i] = employees[i];
        }
        employees = newEmployees;
    }

    public void printAllEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void searchEmployeeByCompanyName(String keyword) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(keyword)) {
                result = true;
                System.out.println(employees[i]);
            }
        }
        if (!result) {
            System.out.println("Employee with " + keyword + " not found");
        }
    }

    public void searchEmployeeByEmployeeID(String employeeByID) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().contains(employeeByID)) {
                result = true;
                System.out.println(employees[i]);
            }
        }
        if (!result) {
            System.out.println("Employee with " + employeeByID + " not found");
        }
    }

    public Employee getEmployeeId(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void searchEmployeeBySalaryMinMax(double min, double max) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= min &&
                    employees[i].getSalary() <= max) {
                System.out.println(employees[i]);
            }
        }
    }

    public void changeEmployeePositionByID(String id) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equalsIgnoreCase(id)) {
                System.out.println(employees[i]);
                System.out.println("Please input new position");
                String newPosition = scanner.nextLine();
                employees[i].setPosition(newPosition);
            }
        }
    }

    public void inactiveEmployeeByID(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equalsIgnoreCase(id)) {
                employees[i].setActive(false);
                System.out.println(employees[i]);
            }
        }
    }

    public void activateEmployeeByID(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equalsIgnoreCase(id)) {
                employees[i].setActive(true);
                System.out.println(employees[i]);
            }
        }
    }

    public void printOnlyActiveEmployees() {
        boolean result = true;
        for (int i = 0; i < size; i++) {
            if (employees[i].getActive() == result){
                System.out.println(employees[i]);
            }
        }
    }
}

