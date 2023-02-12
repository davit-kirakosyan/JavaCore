package homework.chapter9.stack;

public class IfTest2 {

    public static void main(String[] args) {

        AnyStack anyStack1 = new AnyStack(5);
        AnyStack anyStack2 = new AnyStack(8);


        for (int i = 0; i < 12; i++) {
            anyStack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            anyStack2.push(i);
        }

        System.out.print("fixedStack1: ");
        for (int i = 0; i < 12; i++) {
            System.out.print(anyStack1.pop() + " ");
        }
        System.out.println();
        System.out.print("fixedStack2: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(anyStack2.pop() + " ");
        }
    }
}
