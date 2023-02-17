package homework.exercise.homework10.employee.storage.impl;

import homework.exercise.homework10.employee.model.Employee;
import homework.exercise.homework10.employee.storage.EmployeeStorage;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeStorageImpl implements EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    @Override
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

    @Override
    public void printAllEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public void searchEmployeeByCompanyName(String keyword) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(keyword)) {
                result = true;
            }
        }
        if (!result) {
            System.out.println("Employee with " + keyword + " not found");
        }
    }

    @Override
    public void searchEmployeeByEmployeeID(String employeeByID) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().contains(employeeByID)) {
                result = true;
            }
        }
        if (!result) {
            System.out.println("Employee with " + employeeByID + " not found");
        }
    }

    @Override
    public Employee getEmployeeId(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().toUpperCase(Locale.ROOT).equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public void searchEmployeeBySalaryMinMax(double min, double max) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= min &&
                    employees[i].getSalary() <= max) {
                System.out.println(employees[i]);
            }
        }
    }

    @Override
    public void inactiveEmployeeByID(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equalsIgnoreCase(id)) {
                employees[i].setActive(false);
            }
        }
    }

    @Override
    public void activateEmployeeByID(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equalsIgnoreCase(id)) {
                employees[i].setActive(true);
            }
        }
    }

    @Override
    public void printOnlyActiveEmployees() {
        boolean result = true;
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive() == result) {
                System.out.println(employees[i]);
            }
        }
    }
}

