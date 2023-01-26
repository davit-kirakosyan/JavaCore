package homework.chapter7.stack;

public class Stack {

    private int[] stack = new int[10];
    private int tos;

    Stack(int size) {
        stack = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stack.length-1) {
            System.out.println("Stack-ի մեջ տեղ չկա");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack-ը դադարկ է");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
