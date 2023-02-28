package homework.exercise.homework11.medicalCenter.storage;

import homework.exercise.homework11.medicalCenter.model.Doctor;
import homework.exercise.homework11.medicalCenter.model.Patient;
import homework.exercise.homework11.medicalCenter.model.Person;

import java.text.ParseException;

public interface PersonStorage {
    void add(Person person);

    void searchDoctorByProfession(String profession);

    void deleteDoctorById(String id);

    Doctor getDoctorById(String doctorId);

    Patient getPatientById(String patientId);

    Patient getPatientDateTime(String dateTime) throws ParseException;

    void printAllPatientsByDoctor(String name);

    void printToDaysPatients();

    void printAllDoctor();
}
