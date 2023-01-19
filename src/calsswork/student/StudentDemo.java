package calsswork.student;

import java.util.Scanner;

public class StudentDemo {

    public static void main(String[] args) {
        System.out.println("Please input Student's");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input Student's name");
        String name = scanner.nextLine();
        System.out.println("Please input Student's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input Student's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input Student's email");
        String email = scanner.nextLine();
        System.out.println("Please input Student's phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input Student's courseName");
        String course = scanner.nextLine();

        Student student = new Student(name, surname, age, phoneNumber, email, course);

        System.out.println(student.name);
    }
}
