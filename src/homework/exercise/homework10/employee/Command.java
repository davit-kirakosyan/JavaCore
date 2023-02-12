package homework.exercise.homework10.employee;

public interface Command {

    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String PRINT_ALL_EMPLOYEE = "2";
    String SEARCH_EMPLOYEE_BY_EMPLOYEE_ID = "3";
    String SEARCH_EMPLOYEE_BY_COMPANY_NAME = "4";
    String SEARCH_EMPLOYEE_BY_SALARY_RANG = "5";
    String CHANGE_EMPLOYEE_POSITION_BY_ID = "6";
    String PRINT_ONLY_ACTIVE_EMPLOYEES = "7";
    String INACTIVE_EMPLOYEE_BY_ID = "8";
    String ACTIVATE_EMPLOYEE_BY_ID = "9";

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_EMPLOYEE + " for ADD EMPLOYEE");
        System.out.println("Please input " + PRINT_ALL_EMPLOYEE + " for PRINT ALL EMPLOYEE");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_EMPLOYEE_ID + " for SEARCH EMPLOYEE BY EMPLOYEE ID");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_COMPANY_NAME + " for SEARCH EMPLOYEE BY COMPANY NAME");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_SALARY_RANG + " for SEARCH EMPLOYEE BY SALARY RANG");
        System.out.println("Please input " + CHANGE_EMPLOYEE_POSITION_BY_ID + " for CHANGE EMPLOYEE POSITION BY ID");
        System.out.println("Please input " + PRINT_ONLY_ACTIVE_EMPLOYEES + " for PRINT_ONLY_ACTIVE_EMPLOYEES");
        System.out.println("Please input " + INACTIVE_EMPLOYEE_BY_ID + " for INACTIVE_EMPLOYEE_BY_ID");
        System.out.println("Please input " + ACTIVATE_EMPLOYEE_BY_ID + " for ACTIVATE_EMPLOYEE_BY_ID");
    }
}
