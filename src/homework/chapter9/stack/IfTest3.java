package homework.chapter9.stack;

public class IfTest3 {

    public static void main(String[] args) {
        IntStack myStack;

        AnyStack anyStack = new AnyStack(5);
        FixedStack fixedStack = new FixedStack(8);

myStack = anyStack;
        for (int i = 0; i < 12; i++) {
            myStack.push(i);
        }
        myStack = fixedStack;
        for (int i = 0; i < 8; i++) {
            myStack.push(i);
        }

        myStack = anyStack;
        System.out.print("fixedStack1: ");
        for (int i = 0; i < 12; i++) {
            System.out.print(myStack.pop() + " ");
        }
        myStack = fixedStack;
        System.out.println();
        System.out.print("fixedStack2: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(myStack.pop() + " ");
        }
    }
}
