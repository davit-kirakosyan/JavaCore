package homework.exercise.homework11.medicalCenter.storage;

import homework.exercise.homework11.medicalCenter.model.Person;

import java.util.Date;

public interface MedicalCenterStorage {
    void add(Person person);

    void print();

    void deleteDoctorById(String doctorId);

    void searchDoctorByProfession(String profession);

    Person getById(String doctorId);

    Person getDoctorByEmail(String email);

    void printToDays(String toDays);

    void printAllPatientByDoctor(String doctor);
}
