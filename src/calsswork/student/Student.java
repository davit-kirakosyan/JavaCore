package calsswork.student;

public class Student {

    String name;
    String surname;
    int age;
    String phoneNumber;
    String email;
    String courseName;

    Student(){

    }
    Student(String name, String surname, String phoneNumber, String courseName) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.courseName = courseName;
    }

    Student(String name, String surname, int age, String phoneNumber, String email, String courseName) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.courseName = courseName;
    }
}
