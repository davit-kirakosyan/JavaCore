package homework.exercise.employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {
        EmployeeStorage employeeStorage = new EmployeeStorage();
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEE");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY EMPLOYEE ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEE BY COMPANY NAME");

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("please input Employee's name");
                    String name = scanner.nextLine();
                    System.out.println("please input Employee's surname");
                    String surname = scanner.nextLine();
                    System.out.println("please input Employee's salary");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("please input Employee's company");
                    String company = scanner.nextLine();
                    System.out.println("please input Employee's position");
                    String position = scanner.nextLine();
                    String emplID = employeeStorage.employeeId("A");
                    Employee employee = new Employee(name, surname,
                            emplID, salary, company, position);
                    employeeStorage.addEmployees(employee);
                    break;
                case "2":
                    employeeStorage.printAllEmployees();
                    break;
                case "3":
                    System.out.println("Please input search employee by employee ID");
                    String employeeByID = scanner.nextLine();
                    employeeStorage.searchEmployeeByEmployeeID(employeeByID);
                    break;
                case "4":
                    System.out.println("Please input search employee by company");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchEmployeeByCompanyName(companyName);
                    break;
                default:
                    System.out.println("wrong command please try again!");
            }
        }
    }
}
