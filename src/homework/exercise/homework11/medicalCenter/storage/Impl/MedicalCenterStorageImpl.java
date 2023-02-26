package homework.exercise.homework11.medicalCenter.storage.Impl;

import homework.exercise.homework11.medicalCenter.exception.MedicalNotFoundException;
import homework.exercise.homework11.medicalCenter.model.Doctor;
import homework.exercise.homework11.medicalCenter.model.Patient;
import homework.exercise.homework11.medicalCenter.model.Person;
import homework.exercise.homework11.medicalCenter.storage.MedicalCenterStorage;
import homework.exercise.homework11.medicalCenter.util.DateUtil;

import java.util.Date;
import java.util.Locale;

public class MedicalCenterStorageImpl implements MedicalCenterStorage {
    private Person[] persons = new Person[10];
    private int size;


    @Override
    public void add(Person person) {
        if (persons.length == size) {
            extend();
        }
        persons[size++] = person;
    }

    private void extend() {
        Person[] newPersons = new Person[persons.length + 5];
        for (int i = 0; i < size; i++) {
            newPersons[i] = persons[i];
        }
        persons = newPersons;
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(persons[i]);
        }
    }

    private void delete(int index) {
        if (index <= size) {
            for (int i = index; i < size; i++) {
                persons[i] = persons[i - 1];
            }
            size--;
        } else {
            System.out.println("no such element " + index);
        }
    }

    @Override
    public void deleteDoctorById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (persons[i].getId().equals(doctorId)) {
                delete(i);
                break;
            }
        }
    }


    @Override
    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor &&
                    ((Doctor) persons[i]).getProfession().name().equals(profession)) {
                System.out.println(persons[i]);
            }
        }
    }

    @Override
    public Person getById(String id) throws MedicalNotFoundException {
        for (int i = 0; i < size; i++) {
            if (persons[i].getId().equalsIgnoreCase(id)) {
                return persons[i];
            }
        }
        throw new MedicalNotFoundException("Doctor with " + id + " already exists!!!");
    }

    @Override
    public Doctor getDoctorById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                Doctor doctor = (Doctor) persons[i];
                if (doctor.getId().equalsIgnoreCase(doctorId)) {
                    return doctor;
                }
            }
        }
        return null;
    }

    @Override
    public Person getDoctorByEmail(String email){
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor &&
                    ((Doctor) persons[i]).getEmail().equalsIgnoreCase(email)) {
                return persons[i];
            }
        }
        return null;
    }

    @Override
    public void printToDays(String toDays) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Date registerDate = ((Patient) persons[i]).getRegisterDate();
                if (DateUtil.toStringDate(registerDate).equalsIgnoreCase(toDays)) {
                    System.out.println(persons[i]);
                }
            }
        }
    }

    @Override
    public void printAllPatientByDoctor(String doctor) {
        for (int i = 0; i < size; i++) {
            if (persons[i].getName().equalsIgnoreCase(doctor)) {
                System.out.println(persons[i]);
            }
        }
    }
}
