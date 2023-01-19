package homework.chapter7.stack;

public class TestStack {


    public static void main(String[] args) {

        Stack stack1 = new Stack(5);
        Stack stack2 = new Stack(8);

        for (int i = 0; i < 5; i++) {
            stack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            stack2.push(i);
        }

        System.out.print("Stack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(stack1.pop() + " ");
        }
        System.out.println();
        System.out.print("Stack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(stack2.pop() + " ");
        }
    }
}
