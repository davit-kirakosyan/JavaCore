package homework.exercise.homework10.employee;

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
                System.out.println(employees[i]);
            }
        }
        if (!result) {
            System.out.println("Employee with " + employeeByID + " not found");
        }
    }

    public String employeeId(String id) {
        return id += (size + 1);
    }
}

