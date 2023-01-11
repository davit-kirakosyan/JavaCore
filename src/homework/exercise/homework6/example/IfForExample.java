package homework.exercise.homework6.example;

public class IfForExample {

    public void max(int a, int b) {
        if (a > b) {
            System.out.println("Max: " + a);
        } else {
            System.out.println("Max: " + b);
        }

    }

    public void numberMinToMax(int a, int b) {
        if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.print(i + " ");
            }
        } else if (b > a) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public void numbersToChar(int a, int b) {
        System.out.println();
        System.out.println((char) a + " " + (char) b);
    }

    public void numberToEquals(int a, int b) {
        if (a == b) {
            System.out.println("The number is equals");
        }else {
            System.out.println("The number isn't equals");
        }
    }
}
