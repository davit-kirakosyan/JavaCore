package homework.exercise.homework11;

import homework.exercise.homework11.medicalCenter.Commands;
import homework.exercise.homework11.medicalCenter.model.Doctor;
import homework.exercise.homework11.medicalCenter.model.Patient;
import homework.exercise.homework11.medicalCenter.model.Person;
import homework.exercise.homework11.medicalCenter.model.Profession;
import homework.exercise.homework11.medicalCenter.storage.Impl.MedicalCenterStorageImpl;
import homework.exercise.homework11.medicalCenter.storage.MedicalCenterStorage;
import homework.exercise.homework11.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands {

    private static MedicalCenterStorage medicalCenterStorage = new MedicalCenterStorageImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Doctor doctor = new Doctor("A001", "Poxos", "Poxosyna", "123456", "poxos@mail.com", Profession.INTERNISTS);
        medicalCenterStorage.add(doctor);
        Doctor doctor1 = new Doctor("A041", "Ando", "Poxosyna", "123456", "ando@mail.com", Profession.FAMILY_PHYSICIANS);
        medicalCenterStorage.add(doctor1);
        Doctor doctor2 = new Doctor("B001", "valod", "valodik", "369852", "valod@mail.com", Profession.EMERGENCY_PHYSICIANS);
        medicalCenterStorage.add(doctor2);
        Doctor doctor3 = new Doctor("Q01", "petros", "petrosyan", "0123741", "petros@mail.com", Profession.PSYCHIATRISTS);
        medicalCenterStorage.add(doctor3);
        try {
            medicalCenterStorage.add(new Patient("G1520", "martiros", "martirosyan", "5246321", doctor, DateUtil.toDateString("12/11/2121 10:30")));
            medicalCenterStorage.add(new Patient("G1221", "zmruxt", "zmruxtyan", "125246321", doctor1, DateUtil.toDateString("06/07/2006 18:00")));
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
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
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TO_DAYS_PATIENT:
                    printToDaysPatient();
                    break;
                case PRINT_ALL_DOCTORS_BY_PATIENT:
                    medicalCenterStorage.print();
                    break;
                default:
                    System.err.println("Wrong command please try again");
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

    private static void addPatient() {
        medicalCenterStorage.print();
        System.out.println("Please input Doctor id");
        String personId = scanner.nextLine();
        Person doctorById = medicalCenterStorage.getById(personId);
        Doctor doctorId = (Doctor) doctorById;
        if (doctorById != null) {
            System.out.println("Please input Patient's id, name, surname, phone, " +
                    "registerDateTime(day/month/year hour:minute)");
            String dataStr = scanner.nextLine();
            String[] dataArrStr = dataStr.split(",");
            String patientId = dataArrStr[0];
            Person patientById = medicalCenterStorage.getById(patientId);
            if (patientById == null) {
                try {
                    Patient patient = new Patient(patientId, dataArrStr[1], dataArrStr[2], dataArrStr[3],
                            doctorId, DateUtil.toDateString(dataArrStr[4]));
                    medicalCenterStorage.add(patient);
                } catch (ParseException e) {
                    System.err.println("Wrong date " + e + " please input date dd/MM/yyyy hh:mm");
                    addPatient();
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println(e.getMessage());
                    addPatient();
                }
            } else {
                System.out.println("Doctor with " + doctorId + " already exists!!");
            }
        }
    }

    private static void changeDoctorDataById() {
        medicalCenterStorage.print();

        try {
            System.out.println("Please input Doctor Id");
            String parsonId = scanner.nextLine();
            Person parsonById = medicalCenterStorage.getById(parsonId);
            if (parsonById != null) {
                System.out.print("Please input new Doctor's name, surname, email, phone, profession( ");
                for (Profession value : Profession.values()) {
                    System.out.print(value + ", ");
                }

                System.out.println(")");
                String dataStr = scanner.nextLine();
                String[] dataArrStr = dataStr.split(",");
                String email = dataArrStr[2];
                Doctor doctor = (Doctor) parsonById;
                Person doctorByEmail = medicalCenterStorage.getDoctorByEmail(email);
                if (doctorByEmail == null) {
                    doctor.setName(dataArrStr[0]);
                    doctor.setSurname(dataArrStr[1]);
                    doctor.setEmail(dataArrStr[2]);
                    doctor.setPhoneNumber(dataArrStr[3]);
                    doctor.setProfession(Profession.valueOf(dataArrStr[4].toUpperCase(Locale.ROOT)));
                } else {
                    System.out.println("Doctor with " + email + " already exists!!");
                }
            } else {
                System.out.println("Doctor with " + parsonId + " already exists!!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            changeDoctorDataById();
        } catch (IllegalArgumentException e) {
            System.err.println("You entered incorrectly ");
            changeDoctorDataById();
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
        try {
            System.out.print("Please input Doctor's id, name, surname, phone, email, profession( ");
            for (Profession value : Profession.values()) {
                System.out.print(value + ", ");
            }
            System.out.println(")");
            String dataStr = scanner.nextLine();
            String[] dataArrStr = dataStr.split(",");
            String doctorId = dataArrStr[0];
            Person doctorById = medicalCenterStorage.getById(doctorId);
            if (doctorById == null) {
                String email = dataArrStr[4];
                Person doctorByEmail = medicalCenterStorage.getDoctorByEmail(email);

                if (doctorByEmail == null) {
                    Doctor doctor = new Doctor(doctorId, dataArrStr[1], dataArrStr[2],
                            dataArrStr[3], email, Profession.valueOf(dataArrStr[5].toUpperCase(Locale.ROOT)));
                    medicalCenterStorage.add(doctor);
                } else {
                    System.err.println("Doctor with " + email + " already exists!!!");
                }
            } else {
                System.err.println("Doctor with " + doctorId + " already exists!!!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            addDoctor();
        } catch (IllegalArgumentException e) {
            System.err.println("You entered incorrectly ");
            addDoctor();
        }

    }
}

