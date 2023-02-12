package homework.exercise.homework10;

import homework.exercise.homework10.employee.Command;
import homework.exercise.homework10.employee.model.Employee;
import homework.exercise.homework10.employee.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo implements Command {
    static EmployeeStorage employeeStorage = new EmployeeStorage();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Command.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEE:
                    employeeStorage.printAllEmployees();
                    break;
                case SEARCH_EMPLOYEE_BY_EMPLOYEE_ID:
                    searchByEmployeeByEmployeeID();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_NAME:
                    searchEmployeeByCompanyName();
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANG:
                    searchEmployeeBySalaryRang();
                    break;
                case CHANGE_EMPLOYEE_POSITION_BY_ID:
                    changeEmployeePositionByID();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEES:
                    employeeStorage.printOnlyActiveEmployees();
                    break;
                case INACTIVE_EMPLOYEE_BY_ID:
                    inactiveEmployeeByID();
                    break;
                case ACTIVATE_EMPLOYEE_BY_ID:
                    activateEmployeeByID();
                    break;
                default:
                    System.out.println("wrong command please try again!");
            }
        }
    }

    private static void activateEmployeeByID() {
        System.out.println("PLease input Employee's id active");
        String employeeId = scanner.nextLine();
        employeeStorage.activateEmployeeByID(employeeId);
    }

    private static void inactiveEmployeeByID() {
        System.out.println("PLease input Employee's id not active");
        String employeeId = scanner.nextLine();
        employeeStorage.inactiveEmployeeByID(employeeId);
    }

    private static void changeEmployeePositionByID() {
        System.out.println("Please input Employee's by id");
        String id = scanner.nextLine();
        employeeStorage.changeEmployeePositionByID(id);
    }

    private static void searchEmployeeBySalaryRang() {
        System.out.println("please input salary min, max");
        String strArr = scanner.nextLine();
        double min = Double.parseDouble(strArr.split(",")[0]);
        double max = Double.parseDouble(strArr.split(",")[1]);
        employeeStorage.searchEmployeeBySalaryMinMax(min, max);
    }

    private static void searchEmployeeByCompanyName() {
        System.out.println("Please input search employee by company");
        String companyName = scanner.nextLine();
        employeeStorage.searchEmployeeByCompanyName(companyName);
    }

    private static void searchByEmployeeByEmployeeID() {
        System.out.println("Please input search employee by employee ID");
        String employeeByID = scanner.nextLine();
        employeeStorage.searchEmployeeByEmployeeID(employeeByID);
    }

    private static void addEmployee() {
        System.out.println("please input Employee's name, surname, employeeID, salary, company, position");
        String arrStr = scanner.nextLine();
        String[] arrStrEmploy = arrStr.split(",");
        String employeeID = arrStrEmploy[2];
        Employee employeeById = employeeStorage.getEmployeeId(employeeID);
        if (employeeById == null) {
            Employee employee = new Employee(arrStrEmploy[0], arrStrEmploy[1],
                    employeeID, Double.parseDouble(arrStrEmploy[3]),
                    arrStrEmploy[4], arrStrEmploy[5]);
            employee.setActive(true);
            employeeStorage.addEmployees(employee);
            System.out.println("Employee was added");
        } else {
            System.out.println("Employee with " + employeeID + " already exists!!");
        }

    }
}
