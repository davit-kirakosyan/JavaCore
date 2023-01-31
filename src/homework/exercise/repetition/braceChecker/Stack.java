package homework.exercise.repetition.braceChecker;

public class Stack {

    private int[] stack = new int[10];
    private int tos;

    public Stack() {
        tos = -1;
    }

    private void extend() {
        int[] large = new int[stack.length + 5];
        for (int i = 0; i < tos; i++) {
            large[i] = stack[i];
        }
        stack = large;
    }

    public void push(int item) {
        if (tos == stack.length - 1) {
            extend();
        } else {
            stack[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
