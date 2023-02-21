package homework.exercise.homework11.medicalCenter.storage;

import homework.exercise.homework11.medicalCenter.model.Doctor;
import homework.exercise.homework11.medicalCenter.model.Patient;

public interface MedicalCenterStorage {
    void addDoctor(Doctor doctor);

    void addPatient(Patient patient);

    void deleteDoctorById(String doctorId);

    void printDoctors();

    void searchDoctorByProfession(String profession);

    Doctor getDoctorById(String doctorId);

    Doctor getDoctorByEmail(String email);

    void printAllPatient();

    Patient getPatientById(String patientId);

    void printToDays(String toDays);

    void printAllPatientByDoctor(String doctor);
}
