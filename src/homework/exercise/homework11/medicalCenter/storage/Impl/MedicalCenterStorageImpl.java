package homework.exercise.homework11.medicalCenter.storage.Impl;

import homework.exercise.homework11.medicalCenter.model.Doctor;
import homework.exercise.homework11.medicalCenter.model.Patient;
import homework.exercise.homework11.medicalCenter.storage.MedicalCenterStorage;
import homework.exercise.homework11.medicalCenter.util.DateUtil;

import java.util.Date;

public class MedicalCenterStorageImpl implements MedicalCenterStorage {
    private Doctor[] doctors = new Doctor[10];
    private Patient[] patients = new Patient[10];
    private int sizeDoctors;
    private int sizePatient;



    @Override
    public void addDoctor(Doctor doctor) {
        if (doctors.length == sizeDoctors) {
            extendDoctor();
        }
        doctors[sizeDoctors++] = doctor;
    }


    @Override
    public void addPatient(Patient patient) {
        if (patients.length == sizePatient) {
            extendPatient();
        }
        patients[sizePatient++] = patient;
    }
    private void extendDoctor() {
        Doctor[] newDoctor = new Doctor[doctors.length + 5];
        for (int i = 0; i < sizeDoctors; i++) {
            newDoctor[i] = doctors[i];
        }
        doctors = newDoctor;
    }
    private void extendPatient() {
        Patient[] newPatient = new Patient[patients.length + 5];
        for (int i = 0; i < sizePatient; i++) {
            newPatient[i] = patients[i];
        }
        patients = newPatient;
    }
    private void delete(int index) {
        if (index <= sizeDoctors) {
            for (int i = index; i < sizeDoctors; i++) {
                doctors[i] = doctors[i - 1];
            }
            sizeDoctors--;
        }else {
            System.out.println("no such element " + index);
        }
    }

    @Override
    public void deleteDoctorById(String doctorId){
        for (int i = 0; i < sizeDoctors; i++) {
            if (doctors[i].getId().equalsIgnoreCase(doctorId)){
                delete(i);
                System.err.println("deleted");
                break;
            }
        }
    }
    @Override
    public void printDoctors() {
        for (int i = 0; i < sizeDoctors; i++) {
            System.out.println(doctors[i]);
        }
    }

    @Override
    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < sizeDoctors; i++) {
            if (doctors[i].getProfession().equalsIgnoreCase(profession)) {
                System.out.println(doctors[i]);
            }
        }
    }

    @Override
    public Doctor getDoctorById(String doctorId) {
        for (int i = 0; i < sizeDoctors; i++) {
            if (doctors[i].getId().equalsIgnoreCase(doctorId)) {
                return doctors[i];
            }
        }
        return null;
    }
    @Override
    public Doctor getDoctorByEmail(String email) {
        for (int i = 0; i < sizeDoctors; i++) {
            if (doctors[i].getEmail().equalsIgnoreCase(email)) {
                return doctors[i];
            }
        }
        return null;
    }

    @Override
    public void printAllPatient(){
        for (int i = 0; i < sizePatient; i++) {
            System.out.println(patients[i]);
        }
    }
    @Override
    public Patient getPatientById(String patientId) {
        for (int i = 0; i < sizePatient; i++) {
            if (patients[i].getId().equalsIgnoreCase(patientId)) {
                return patients[i];
            }
        }
        return null;
    }

    @Override
    public void printToDays(String toDays) {
        for (int i = 0; i < sizePatient; i++) {
            Date registerDate = patients[i].getRegisterDate();
            if (DateUtil.toStringDate(registerDate).equals(toDays)){
                System.out.println(patients[i]);
            }
        }
    }

    @Override
    public void printAllPatientByDoctor(String doctor) {
        for (int i = 0; i < sizePatient; i++) {
            if (patients[i].getDoctor().getName().equalsIgnoreCase(doctor)){
                System.out.println(patients[i]);
            }
        }
    }
}
