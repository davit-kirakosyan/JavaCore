package homework.exercise.homework11;

import homework.exercise.homework11.medicalCenter.Commands;
import homework.exercise.homework11.medicalCenter.model.Doctor;
import homework.exercise.homework11.medicalCenter.model.Patient;
import homework.exercise.homework11.medicalCenter.storage.Impl.MedicalCenterStorageImpl;
import homework.exercise.homework11.medicalCenter.storage.MedicalCenterStorage;
import homework.exercise.homework11.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands {

    private static MedicalCenterStorage medicalCenterStorage = new MedicalCenterStorageImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        Doctor doctor = new Doctor("A001", "Poxos", "Poxosyna", "123456", "poxos@mail.com", "Xirurg");
        medicalCenterStorage.addDoctor(doctor);
        Doctor doctor1 = new Doctor("A041", "Ando", "Poxosyna", "123456", "poxos@mail.com", "Xirurg");
        medicalCenterStorage.addDoctor(doctor1);
        Doctor doctor2 = new Doctor("B001", "valod", "valodik", "369852", "valod@mail.com", "asistent");
        medicalCenterStorage.addDoctor(doctor2);
        Doctor doctor3 = new Doctor("Q01", "petros", "petrosyan", "0123741", "petros@mail.com", "profesor");
        medicalCenterStorage.addDoctor(doctor3);
        medicalCenterStorage.addPatient(new Patient("G1520", "martiros", "martirosyan", "5246321", doctor, DateUtil.toDateString("12/11/2121 10:30")));
        medicalCenterStorage.addPatient(new Patient("G1221", "zmruxt", "zmruxtyan", "125246321", doctor1, DateUtil.toDateString("06/07/2006 18:00")));
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            int command = Integer.parseInt(scanner.nextLine());
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
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TO_DAYS_PATIENT:
                    printToDaysPatient();
                    break;
                case PRINT_ALL_DOCTORS:
                    medicalCenterStorage.printDoctors();
                    break;
                case PRINT_ALL_PATIENT:
                    medicalCenterStorage.printAllPatient();
                    break;
                default:
                    System.err.println("Wrong command's");
            }
        }
    }

    private static void printToDaysPatient() {
        System.out.println("Please input Patient to days");
        String toDays = scanner.nextLine();

        medicalCenterStorage.printToDays(toDays);
    }

    private static void printAllPatientsByDoctor() {
        System.out.println("Please input Doctor by patient");
        String doctor = scanner.nextLine();
        medicalCenterStorage.printAllPatientByDoctor(doctor);
    }

    private static void addPatient() throws ParseException {
        medicalCenterStorage.printDoctors();
        System.out.println("Please input Doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = medicalCenterStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input Patient's id, name, surname, phone, " +
                    "registerDateTime(day/month/year hour:minute)");
            String dataStr = scanner.nextLine();
            String[] dataArrStr = dataStr.split(",");
            String patientId = dataArrStr[0];
            Patient patientById = medicalCenterStorage.getPatientById(patientId);
            if (patientById == null) {
                Patient patient = new Patient(patientId, dataArrStr[1], dataArrStr[2], dataArrStr[3],
                        doctorById, DateUtil.toDateString(dataArrStr[4]));
                medicalCenterStorage.addPatient(patient);
            }
        }
    }

    private static void changeDoctorDataById() {
        medicalCenterStorage.printDoctors();
        System.out.println("Please input Doctor Id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = medicalCenterStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input new Doctor's name, surname, email, phone, profession");
            String dataStr = scanner.nextLine();
            String[] dataArrStr = dataStr.split(",");
            doctorById.setName(dataArrStr[0]);
            doctorById.setSurname(dataArrStr[1]);
            doctorById.setEmail(dataArrStr[2]);
            doctorById.setPhoneNumber(dataArrStr[3]);
            doctorById.setProfession(dataArrStr[4]);
        } else {
            System.out.println("Employee with " + doctorId + " already exists!!");
        }
    }

    private static void deleteDoctorById() {
        System.out.println("Please input Doctor id by delete");
        String deleteById = scanner.nextLine();
        medicalCenterStorage.deleteDoctorById(deleteById);
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input Doctor by profession");
        String profession = scanner.nextLine();
        medicalCenterStorage.searchDoctorByProfession(profession);
    }

    private static void addDoctor() {
        System.out.println("Please input Doctor's id, name, surname, email, phone, profession");
        String dataStr = scanner.nextLine();
        String[] dataArrStr = dataStr.split(",");
        String doctorId = dataArrStr[0];
        Doctor doctorById = medicalCenterStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor(doctorId, dataArrStr[1], dataArrStr[2],
                    dataArrStr[3], dataArrStr[4], dataArrStr[5]);
            medicalCenterStorage.addDoctor(doctor);
        } else {
            System.out.println("Employee with " + doctorId + " already exists!!");
        }

    }
}
