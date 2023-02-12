package homework.chapter9.stack;

public class FixedStack implements IntStack {
    private int[] stack;
    public int tos;

    FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stack.length - 1) {
            System.out.println("Cтeк заполнен.");
        } else
            stack[++tos] = item;

    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        }else
            return stack[tos--];

    }
}
