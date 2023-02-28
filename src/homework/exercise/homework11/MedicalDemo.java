package homework.homework11;

import homework.homework11.medicalCenter.MedicalCenterCommands;
import homework.homework11.medicalCenter.model.Doctor;
import homework.homework11.medicalCenter.model.Patient;
import homework.homework11.medicalCenter.model.type.ProfessionType;
import homework.homework11.medicalCenter.storage.impl.PersonStorageImpl;
import homework.homework11.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class MedicalDemo implements MedicalCenterCommands {

    private static PersonStorageImpl personStorage = new PersonStorageImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            MedicalCenterCommands.printMedical();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorDataById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientByDoctor();
                    break;
                case PRINT_TO_DAYS_PATIENTS:
                    personStorage.printToDaysPatients();
                    break;
                case PRINT_ALL_DOCTORS:
                    personStorage.printAllDoctor();
                    break;
                default:
                    System.err.println("Wrong command please try again");
            }
        }
    }

    private static void printAllPatientByDoctor() {
        System.out.println("Please input Patient's name");
        String name = scanner.nextLine();
        personStorage.printAllPatientsByDoctor(name);
    }

    private static void addPatient() {
        try {
            System.out.println("Please input Doctor's id");
            String doctorId = scanner.nextLine();
            Doctor doctorById = personStorage.getDoctorById(doctorId);
            if (doctorById != null) {
                System.out.println("Please input Patient's id, name, surname, phone, registerDateTime(day/month/year hour:minute)");
                String dataStr = scanner.nextLine();
                String[] dataPatientArr = dataStr.split(",");
                String patientId = dataPatientArr[0];
                Patient patientById = personStorage.getPatientById(patientId);
                if (patientById == null) {
                    try {
                        String dateTime = dataPatientArr[4];
                        Patient patientDateTime = personStorage.getPatientDateTime(dateTime);
                        if(patientDateTime == null) {
                            Patient patient = new Patient(patientId, dataPatientArr[1], dataPatientArr[2],
                                    dataPatientArr[3], doctorById, DateUtil.toDateString(dateTime));
                            personStorage.add(patient);
                        }else {
                            System.err.println("Patient with " + dateTime + " already exists!!!");
                        }
                    }catch (ParseException e){
                        System.err.println(e.getMessage());
                        addPatient();
                    }

                } else {
                    System.err.println("Patient with " + patientId + " already exists!!!");
                }
            }else {
                System.err.println("Doctor with " + doctorId + " already exists!!!");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            addPatient();
        }

    }

    private static void changeDoctorDataById() {
        System.out.println("Please input Doctor's id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null){
            System.out.println("Change Doctor's name, surname, phone, email, profession(");
            for (ProfessionType value : ProfessionType.values()) {
                System.out.print(value + ",");
            }
            System.out.println(")");
            String dataStr = scanner.nextLine();
            String[] dataStrArr = dataStr.split(",");
            doctorById.setName(dataStrArr[0]);
            doctorById.setSurname(dataStrArr[1]);
            doctorById.setPhone(dataStrArr[2]);
            doctorById.setEmail(dataStrArr[3]);
            doctorById.setProfession(ProfessionType.valueOf(dataStrArr[3]));
        }
    }

    private static void deleteDoctorById() {
        System.out.println("Please input Doctor's id");
        String doctorId = scanner.nextLine();
        personStorage.deleteDoctorById(doctorId);
        System.out.println("delete Doctor");
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession's (");
        for (ProfessionType value : ProfessionType.values()) {
            System.out.print(value + ",");
        }
        System.out.println(")");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByProfession(profession);
    }

    private static void addDoctor() {
        try {
            System.out.print("Please input Doctor's id, name, surname, phone, email, profession(");
            for (ProfessionType value : ProfessionType.values()) {
                System.out.print(value + ",");
            }
            System.out.println(")");
            String dateStr = scanner.nextLine();
            String[] dataDoctorArr = dateStr.split(",");
            String doctorId = dataDoctorArr[0];
            Doctor doctorById = personStorage.getDoctorById(doctorId);
            if (doctorById == null) {
                Doctor doctor = new Doctor(doctorId, dataDoctorArr[1], dataDoctorArr[2], dataDoctorArr[3],
                        dataDoctorArr[4], ProfessionType.valueOf(dataDoctorArr[5].toUpperCase(Locale.ROOT)));
                personStorage.add(doctor);
            }else {
                System.err.println("Doctor with " + doctorId + " already exists!!!");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            addDoctor();
        }


    }
}
