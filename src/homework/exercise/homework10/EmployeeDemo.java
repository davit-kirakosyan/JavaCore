package homework.exercise.homework10;

import homework.exercise.homework10.employee.Command;
import homework.exercise.homework10.employee.model.Company;
import homework.exercise.homework10.employee.model.Employee;
import homework.exercise.homework10.employee.storage.CompanyStorage;
import homework.exercise.homework10.employee.storage.EmployeeStorage;
import homework.exercise.homework10.employee.storage.impl.CompanyStorageImpl;
import homework.exercise.homework10.employee.storage.impl.EmployeeStorageImpl;
import homework.exercise.homework10.employee.utill.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Command {
    static EmployeeStorage employeeStorage = new EmployeeStorageImpl();
    static Scanner scanner = new Scanner(System.in);
    static CompanyStorage companyStorage = new CompanyStorageImpl();

    public static void main(String[] args) throws ParseException {
        Company company = new Company("A001", "Java", "Gyumri", "949565");
        company.setCountOfEmployees(4);
        companyStorage.addCompany(company);
        employeeStorage.addEmployees(new Employee("Poxos", "Poxosyan", "A001", 26, company, "Junior", true, new Date(), DateUtil.dateToString("11/03/2003")));
        employeeStorage.addEmployees(new Employee("Petros", "Petrosyan", "B001", 31, company, "Junior", true, new Date(), DateUtil.dateToString("12/12/2021")));
        employeeStorage.addEmployees(new Employee("Martiros", "Martirosyan", "M001", 321, company, "Junior", true, new Date(), DateUtil.dateToString("22/12/2022")));
        employeeStorage.addEmployees(new Employee("Valod", "Valodyan", "V001", 11, company, "Middle", true, new Date(), DateUtil.dateToString("23/12/2023")));
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
                case ADD_COMPANY:
                    addECompany();
                    break;
                case PRINT_ALL_EMPLOYEE:
                    employeeStorage.printAllEmployees();
                    break;
                case SEARCH_EMPLOYEE_BY_EMPLOYEE_ID:
                    searchByEmployeeByEmployeeID();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY:
                    searchByCompany();
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
                case PRINT_ALL_COMPANIES:
                    companyStorage.printAllCompanies();
                    break;
                default:
                    System.out.println("wrong command please try again!");
            }
        }
    }

    private static void addECompany() {
        System.out.println("please input Company's id, name, address, phone");
        String companyArr = scanner.nextLine();
        String[] companyArrStr = companyArr.split(",");
        String companyId = companyArrStr[0];
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById == null) {
            Company company = new Company(companyId,
                    companyArrStr[1], companyArrStr[2], companyArrStr[3]);
            companyStorage.addCompany(company);
        } else {
            System.out.println("Employee with " + companyId + " already exists!!");
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
        Employee employeeId = employeeStorage.getEmployeeId(id);
        if (employeeId != null) {
            System.out.println("Please input Employee's by newPosition");
            String newPosition = scanner.nextLine();
            employeeId.setPosition(newPosition);
        } else {
            System.out.println("Employee with " + employeeId + " already exists!!");
        }
        System.out.println(employeeStorage.getEmployeeId(id));
    }

    private static void searchEmployeeBySalaryRang() {
        System.out.println("please input salary min, max");
        String strArr = scanner.nextLine();
        String[] rangStrArr = strArr.split(",");
        double min = Double.parseDouble(rangStrArr[0]);
        double max = Double.parseDouble(rangStrArr[1]);
        employeeStorage.searchEmployeeBySalaryMinMax(min, max);
    }

    private static void searchByCompany() {
        companyStorage.printAllCompanies();
        System.out.println("Please input company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null) {
            employeeStorage.searchByCompany(companyById);
        } else {
            System.out.println("Employee with " + companyId + " already exists!!");
        }

    }

    private static void searchByEmployeeByEmployeeID() {
        System.out.println("Please input search employee by employee ID");
        String employeeByID = scanner.nextLine();
        employeeStorage.searchEmployeeByEmployeeID(employeeByID);
    }

    private static void addEmployee() throws ParseException {
        if (companyStorage.getSize() == 0) {
            System.out.println("Please add company first!");
            return;
        }
        companyStorage.printAllCompanies();
        System.out.println("Please choose company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null) {
            System.out.println("please input Employee's name, surname, employeeID, salary, position, dateOfBirthday(day/month/year)");
            String arrStr = scanner.nextLine();
            String[] arrStrEmploy = arrStr.split(",");
            String employeeID = arrStrEmploy[2];
            Employee employeeById = employeeStorage.getEmployeeId(employeeID);
            Date date = DateUtil.dateToString(arrStrEmploy[5]);
            if (employeeById == null) {
                Employee employee = new Employee(employeeID, arrStrEmploy[1],
                        employeeID, Double.parseDouble(arrStrEmploy[3]),
                        companyById, arrStrEmploy[4], true, new Date(),
                        date);
                employeeStorage.addEmployees(employee);
                companyById.setCountOfEmployees(companyById.getCountOfEmployees() + 1);
                System.out.println("Employee was added");
            } else {
                System.out.println("Employee with " + employeeID + " already exists!!");
            }
        }
    }
}
