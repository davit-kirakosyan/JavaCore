package homework.exercise.homework11.medicalCenter.storage.impl;

import homework.exercise.homework11.medicalCenter.model.Doctor;
import homework.exercise.homework11.medicalCenter.model.Patient;
import homework.exercise.homework11.medicalCenter.model.Person;
import homework.exercise.homework11.medicalCenter.storage.PersonStorage;
import homework.exercise.homework11.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class PersonStorageImpl implements PersonStorage {

    private Person[] people = new Person[10];

    private int size;

    @Override
    public void add(Person person) {
        if (people.length == size) {
            extend();
        }
        people[size++] = person;
    }

    @Override
    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor) {
                Doctor doctor = (Doctor) people[i];
                if (doctor.getProfession().name().toUpperCase(Locale.ROOT).equalsIgnoreCase(profession)) {
                    System.out.println(doctor);
                }
            }else {
                System.err.println("there is no such professor");
            }
        }
    }

    @Override
    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor) {
                Doctor doctor = (Doctor) people[i];
                if (doctor.getId().equals(id)) {
                    deleteByIndex(i);
                    break;
                }
            }
        }
    }

    @Override
    public Doctor getDoctorById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor) {
                Doctor doctor = (Doctor) people[i];
                if (doctor.getId().equals(doctorId)) {
                    return doctor;
                }
            }
        }
        return null;
    }

    @Override
    public Patient getPatientById(String patientId) {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient) {
                Patient patient = (Patient) people[i];
                if (patient.getId().equals(patientId)) {
                    return patient;
                }
            }
        }
        return null;
    }

    @Override
    public Patient getPatientDateTime(String dateTime) throws ParseException {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient) {
                Patient patient = (Patient) people[i];
                Date date = DateUtil.toDateString(dateTime);
                if (patient.getRegisterDateTime().equals(date)) {
                    return patient;
                }
            }
        }
        return null;
    }

    @Override
    public void printAllPatientsByDoctor(String name) {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient) {
                Patient patient = (Patient) people[i];
                if (patient.getName().equalsIgnoreCase(name)) {
                    System.out.println(patient);
                }
            }
        }
    }

    @Override
    public void printToDaysPatients() {
        Date toDay = new Date();
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient) {
                Patient patient = (Patient) people[i];
                if (DateUtil.isSameDay(toDay, patient.getRegisterDateTime())){
                    System.out.println(patient);
                }
            }
        }
    }

    @Override
    public void printAllDoctor() {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor) {
                System.out.println(people[i]);
            }
        }
    }

    private void extend() {
        Person[] newPeople = new Person[people.length + 5];
        System.arraycopy(people, 0, newPeople, 0, size);
        people = newPeople;
    }

    private void deleteByIndex(int index) {
        for (int i = index; i < size; i++) {
            people[i] = people[i - 1];
        }
        size--;
    }
}
