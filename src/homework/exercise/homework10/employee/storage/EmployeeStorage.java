package homework.exercise.homework10.employee.storage;

import homework.exercise.homework10.employee.model.Company;
import homework.exercise.homework10.employee.model.Employee;

public interface EmployeeStorage {
    void addEmployees(Employee employee);

    void printAllEmployees();

    void searchByCompany(Company keyword);

    void searchEmployeeByEmployeeID(String employeeByID);

    Employee getEmployeeId(String id);

    void searchEmployeeBySalaryMinMax(double min, double max);
    void inactiveEmployeeByID(String id);

    void activateEmployeeByID(String id);

    void printOnlyActiveEmployees();
}
