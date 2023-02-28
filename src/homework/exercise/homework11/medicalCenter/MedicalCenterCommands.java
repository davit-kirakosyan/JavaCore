package homework.homework11.medicalCenter;

public interface MedicalCenterCommands {

    int EXIT = 0;
    int ADD_DOCTOR = 1;
    int SEARCH_DOCTOR_BY_PROFESSION = 2;
    int DELETE_DOCTOR_BY_ID = 3;
    int CHANGE_DOCTOR_DATA_BY_ID = 4;
    int ADD_PATIENT = 5;
    int PRINT_ALL_PATIENTS_BY_DOCTOR = 6;
    int PRINT_TO_DAYS_PATIENTS = 7;
    int PRINT_ALL_DOCTORS = 8;


    static void printMedical() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_DOCTOR + " for ADD_DOCTOR");
        System.out.println("Please input " + SEARCH_DOCTOR_BY_PROFESSION + " for SEARCH_DOCTOR_BY_PROFESSION");
        System.out.println("Please input " + DELETE_DOCTOR_BY_ID + " for DELETE_DOCTOR_BY_ID");
        System.out.println("Please input " + CHANGE_DOCTOR_DATA_BY_ID + " for CHANGE_DOCTOR_DATA_BY_ID");
        System.out.println("Please input " + ADD_PATIENT + " for ADD_PATIENT");
        System.out.println("Please input " + PRINT_ALL_PATIENTS_BY_DOCTOR + " for PRINT_ALL_PATIENTS_BY_DOCTOR");
        System.out.println("Please input " + PRINT_TO_DAYS_PATIENTS + " for PRINT_TO_DAYS_PATIENTS");
        System.out.println("Please input " + PRINT_ALL_DOCTORS + " for PRINT_ALL_DOCTORS");
    }
}
